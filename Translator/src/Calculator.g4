grammar Calculator;

input
        : line+ EOF
        ;

line:  (expr DELIMITER);

expr
        : expr POWER expr # powerExpr
        | MINUS expr # uminusExpr
        | expr MULT expr # multExpr
        | expr DIV expr # divExpr
        | expr PLUS expr # plusExpr
        | expr MINUS expr # minusExpr
        | ID EQ expr  # eqExpr
        | READ ID # readExpr
        | DISPLAY expr # displayExpr
        | INT # intExpr
        | ID  # idExpr
        | LPAR expr RPAR # parExpr
        ;

READ    : 'read';
DISPLAY : 'display';
POWER   : '**';
INT     : [0-9]+;
WS      : [ \t\r\n]+ -> skip;
ID      : [a-zA-Z_][a-zA-Z_0-9]*;
PLUS    : '+';
MINUS   : '-';
MULT    : '*';
DIV     : '/';
EQ      : '=';
LPAR    : '(';
RPAR    : ')';
DELIMITER: ';';
