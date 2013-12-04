grammar calr;

options {
    output = AST;
}

tokens {
    EXPR;
}

calc
    : lines EOF!
    ;

lines
    : (line NL!)+
    ;

line
    : expr
    ;

expr
    : t1=term (PLUS^ t2=term | MINUS^ t2=term)*
    | ID EQ^ expr
    | READ^ ID
    | DISPLAY^ expr
    ;

term
    : f1=factor (MULT^ f2=factor | DIV^ f2=factor)*
    ;

factor
    : PLUS^ f1=factor
    | MINUS^ f2=factor
    | power
    ;

power
    : atom (POW^ f=factor)?
    ;

atom
    : INT
    | DOUBLE
    | PI
    | E
    | ID
    | LPAR! expr RPAR!
    ;

READ
    : 'read'
    ;

DISPLAY
    : 'display'
    ;
PI
    : 'PI'
    ;

E
    : 'E'
    ;

ID      : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')*
    ;

INT
    : INTPart
    ;

DOUBLE
    : '.' INTPart
    | INTPart '.'
    | INTPart '.' INTPart
    ;

fragment INTPart
    : '0'..'9'+
    ;

PLUS
    : '+'
    ;

MINUS
    : '-'
    ;

MULT
    : '*'
    ;

DIV
    : '/'
    ;

POW
    : '**'
    ;

LPAR
    : '('
    ;

RPAR
    : ')'
    ;

EQ
    : '='
    ;

NL
    : ('\r'|'\n')+
    ;

WHITESPACE
    : ('\t'|' '|'\u000C')+ {$channel = HIDDEN;}
    ;
