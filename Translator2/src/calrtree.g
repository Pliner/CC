tree grammar calrtree;

options {
    tokenVocab=calr;
    ASTLabelType=CommonTree;
}

@header {
import java.lang.Double;
import java.lang.Math;
}

calc
    : (expr{System.out.println();})+
    ;

expr
    : ^(PLUS{System.out.print("(+ ");} expr expr?)  {System.out.print(") ");}
    | ^(MINUS{System.out.print("(- ");} expr expr?) {System.out.print(") ");}
    | ^(MULT{System.out.print("(* ");} expr expr)   {System.out.print(") ");}
    | ^(DIV{System.out.print("(/ ");} expr expr)    {System.out.print(") ");}
    | ^(POW{System.out.print("(expt ");} expr expr)    {System.out.print(") ");}
    | ^(EQ{System.out.print("(define ");} ID{System.out.print($ID.text + " ");} expr)    {System.out.print(") ");}
    | ^(DISPLAY{System.out.print("(display ");} expr)    {System.out.print(") ");}
    | ^(READ{System.out.print("(define ");} ID{System.out.print($ID.text + " ");})    {System.out.print("(read)) ");}
    | DOUBLE                    {System.out.print($DOUBLE.text + " ");}
    | PI                        {System.out.print("PI ");}
    | E                         {System.out.print("E ");}
    | ID                          {System.out.print($ID.text + " ");}
    ;

