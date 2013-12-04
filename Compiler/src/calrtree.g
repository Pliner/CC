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
    Map<String, Double> declaredVariables = new HashMap<String, Double>();
    int maxStackSize = 2;
    int localsSize = 3;
    int stackSize = 0;

    void stackUp(int size) {
        stackSize+= size;
        if(stackSize > maxStackSize)
            maxStackSize = stackSize;
    }
}



calc
    : lines -> main(e={$lines.st}, l={localsSize}, s={maxStackSize})
    ;

lines
    : ((e += expr)+) -> lines(e={$e})
    ;

expr
    : ^(DISPLAY e = expr {stackUp(1);})-> print(e={$e.st})
    | DOUBLE{stackUp(2);} -> double(n={$DOUBLE.text})
    ;

