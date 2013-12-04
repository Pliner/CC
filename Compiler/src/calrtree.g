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
    int stackSize = 0;
    void stackUp(int size) {
        stackSize+= size;
        if(stackSize > maxStackSize)
            maxStackSize = stackSize;
    }

    void define(String var) {
        if(vars.containsKey(var))
            throw new RuntimeException("Variable " + var + " has been already defined");
        vars.put(var, lastLocalVariable);
        lastLocalVariable += 2;
    }

    int getIndex(String var) {
        if(!vars.containsKey(var))
            throw new RuntimeException("Variable " + var + " has been already defined");
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
    : ^(DISPLAY e = expr {stackUp(1);})-> print(e={$e.st})
    | ^(EQ ID e=expr) {define($ID.text);}-> define(i={getIndex($ID.text)}, e={$e.st}, v={$ID.text})
    | INT{stackUp(2);} -> intToDouble(n={$INT.text})
    | DOUBLE{stackUp(2);} -> double(n={$DOUBLE.text})
    ;

