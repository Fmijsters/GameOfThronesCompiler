grammar GameOfThronesLang;

winteriscoming: statement* EOF;

something_for_the_maesters:
            PRINT expr SEMICOLON                                                        # printExpr
            | (INT_TYPE|STRING_TYPE|) IDENTIFIER EQUALS expr SEMICOLON                  # assign
            | IF OPEN_P (leftExpr=expr (GT|LT|EQ|NE) rightExpr=expr| expr) CLOSE_P block ELSE block #ifElse
            | IF OPEN_P (leftExpr=expr (GT|LT|EQ|NE) rightExpr=expr| expr) CLOSE_P block # if;

block: '{' statement* '}';

expr:   leftExpr=expr op=(MUL|DIV) rightExpr=expr                                       # MulDiv
    |   leftExpr=expr op=(ADD|SUB) rightExpr=expr                                       # AddSub
    |   INT                                                                             # int
    |   STRING                                                                          # string
    |   COMMENT                                                                         # comment
    |   IDENTIFIER                                                                      # identifier
    |   OPEN_P expr CLOSE_P                                                             # parens
    ;


statement: something_for_the_maesters | expr | block;

COMMENT : '#' ~( '\r' | '\n' )*;
MUL :   'LORDUMBER' ;
DIV :   'NEDSTARK' ;
IF: 'BELIEVE';
ELSE: 'OR_DONT';
ADD :   'REINFORCEMENTS_COMING' ;
SUB :   'THE_ARMY_OF_THE_DEAD_IS_ATTACKING' ;
OPEN_P : 'RIDERS_APPROACHING';
CLOSE_P : 'WILDLINGS_APPROACHING';
STRING_TYPE : 'STRING';
INT_TYPE : 'INT';
PRINT: 'SPEAK';
STRING: '"' (~'"'|'\\"')* '"';
GT: 'MOUNTAIN_TYRION';
LT: 'TYRION_MOUNTAIN';
EQ: 'TYRION_TYRION';
NE: 'NOT_EQUALS';
EQUALS: '=' ;
SEMICOLON:  'AND_NOW_YOUR_WATCH_HAS_ENDED';
IDENTIFIER: [a-zA-Z]+;
INT : [0-9]+;
WS: [\r\n\t ]+ -> skip;
