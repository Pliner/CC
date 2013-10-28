grammar Calculator;

input
        : (expr DELIMETER)+ EOF              # print
        ;

expr
        : expr POWER expr
        | MINUS expr            # uminus
        | expr MULT expr        # mult
        | expr DIV expr         # div
        | expr PLUS expr        # plus
        | expr MINUS expr       # minus
        | ID EQ expr            # declaration
        | INT                   # int
        | ID                    # id
        | LPAR expr RPAR     # pars
        ;

POWER   : '**'
INT     : [0-9]+;
WS      : [ \t\r\n]+ -> skip;
ID      : [a-zA-Z_][a-zA-Z_ 0-9]*;
PLUS    : '+';
MINUS   : '-';
MULT    : '*';
DIV     : '/';
EQ      : '=';
LPAR    : '(';
RPAR    : ')';
DELIMETER: ';';