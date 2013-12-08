tree grammar calrtree;

options {
    tokenVocab=calr;
    ASTLabelType=CommonTree;
    output = template;
}

@header {
import java.lang.Double;
import java.lang.Math;
import java.util.Map;
import java.util.HashMap;
}


@members {
    Map<String, Integer> vars = new HashMap<String, Integer>();
    int maxStackSize = 2;
    int lastLocalVariable = 3;
    int stackSize = 2;

    void stackUp(int size) {
        stackSize+= size;
        if(stackSize > maxStackSize)
            maxStackSize = stackSize;
    }

    void stackDown(int size) {
        stackSize-= size;
        if(stackSize < 2)
             stackSize = 2;
    }

    void define(String var) {
        if(vars.containsKey(var))
            throw new RuntimeException("Variable " + var + " has been already defined");
        vars.put(var, lastLocalVariable);
        lastLocalVariable += 2;
    }

    int getIndex(String var) {
        if(!vars.containsKey(var))
            throw new RuntimeException("Variable " + var + " has not been defined");
        return vars.get(var);
    }
}



calc
    : lines -> main(e={$lines.st}, l={lastLocalVariable}, s={maxStackSize})
    ;

lines
    : ((e += expr)+) -> lines(e={$e})
    ;

expr
    : ^(DISPLAY e = expr {stackUp(1);}) -> print(e={$e.st})
    | ^(READ ID{define($ID.text);}) -> read(i={getIndex($ID.text)})
    | ^(EQ ID e=expr) {define($ID.text);} -> define(i={getIndex($ID.text)}, e={$e.st})
    | ^(PLUS left=expr right=expr) {stackDown(2);} -> add(left={$left.st}, right={$right.st})
    | ^(MINUS left=expr right=expr) {stackDown(2);} -> sub(left={$left.st}, right={$right.st})
    | ^(MULT left=expr right=expr) {stackDown(2);} -> mul(left={$left.st}, right={$right.st})
    | ^(DIV left=expr right=expr) {stackDown(2);} -> div(left={$left.st}, right={$right.st})
    | ^(POW base=expr power=expr) -> pow(base={$base.st}, power={$power.st})
    | INT{stackUp(2);} -> intToDouble(n={$INT.text})
    | DOUBLE{stackUp(2);} -> double(n={$DOUBLE.text})
    | PI{stackUp(2);} -> double(n={Math.PI})
    | E{stackUp(2);} -> double(n={Math.E})
    | ID{stackUp(2);} -> resolve(i={getIndex($ID.text)})
    ;

