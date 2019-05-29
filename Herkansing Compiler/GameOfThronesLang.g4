grammar GameOfThronesLang;

winteriscoming: statement* EOF;

something_for_the_maesters:
            PRINT expr SEMICOLON                                # printExpr
            | expr SEMICOLON                                # simple_expression
            |   IDENTIFIER '=' expr SEMICOLON                   # assign;

expr:   expr op=('*'|'/') expr                                  # MulDiv
    |   leftExpr=expr op=('+'|'-') rightExpr=expr               # AddSub
    |   INT                         # int
    |   IDENTIFIER                  # identifier
    |   OPEN_P expr CLOSE_P         # parens
    ;


statement: something_for_the_maesters | expr;


MUL :   '*' ;
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ;
OPEN_P : '(';
CLOSE_P : ')';
PRINT: 'SPEAK';
EQUALS: '=' ;
SEMICOLON:  ';';
IDENTIFIER: [a-zA-Z]+ ;
INT : [0-9]+;
WS: [\r\n\t ]+ -> skip;
