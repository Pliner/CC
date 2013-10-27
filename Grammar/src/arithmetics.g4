grammar arithmetics;

INT : [0-9]+;
DOUBLE: [0-9]+'.'[0-9]+;
WS  : [ \t\r\n]+ -> skip;
ID  : [a-zA-Z_][a-zA-Z_0-9]*;

PLUS  : '+';
MINUS : '-';
MULT  : '*';
DIV   : '/';
LPAR  : '(';
RPAR  : ')';
POWER: '^';
PI: 'PI';
E: 'E';

input
    : expr EOF
    ;

expr
    : term ((PLUS | MINUS) term)*
    ;

term
    : powered ((MULT | DIV) powered)*
    ;

powered
    : factor POWER powered
    | factor
    ;

factor
    : (PLUS | MINUS) factor
    | atom
    ;

atom
    : (INT | DOUBLE | PI | E)
    | LPAR expr RPAR
    ;