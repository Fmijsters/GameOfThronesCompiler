grammar GameOfThronesLang;

winteriscoming: statement* EOF;

something_for_the_maesters:
            PRINT expr SEMICOLON                              # printExpr
            |   IDENTIFIER '=' expr SEMICOLON               # assign;

expr:   expr op=('*'|'/') expr      # MulDiv
    |   expr op=('+'|'-') expr      # AddSub
    |   INT                         # int
    |   IDENTIFIER                  # identifier
    |   OPEN_P expr CLOSE_P         # parens
    ;


statement: something_for_the_maesters;


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
