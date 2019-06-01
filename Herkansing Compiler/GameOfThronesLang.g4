grammar GameOfThronesLang;

winteriscoming: statement* EOF;

something_for_the_maesters:
            PRINT expr SEMICOLON                                                        # printExpr
            | (INT_TYPE|STRING_TYPE|) IDENTIFIER EQUALS expr SEMICOLON                  # assign
            | IF condition_statement block (ELSE block|)                                # ifElse
            | WHILE condition_statement block                                           # while;

block: '{' statement* '}';

condition_statement: OPEN_P condition (((AND|OR) condition)*|)  CLOSE_P;

condition: (NOT|)( leftExpr=expr (GT|LT|EQ|NE) rightExpr=expr| expr);

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
MUL : 'LORDUMBER' ;
DIV : 'NEDSTARK' ;
IF: 'BELIEVE';
ELSE: 'OR_DONT';
NOT: 'NOT';
AND: 'AND';
OR: 'OR';
WHILE: 'AS_LONG_AS';
ADD :   'REINFORCEMENTS_COMING' ;
SUB :   'THE_ARMY_OF_THE_DEAD_IS_ATTACKING' ;
OPEN_P : 'RIDERS_APPROACHING';
CLOSE_P : 'WILDLINGS_APPROACHING';
STRING_TYPE : 'BOOK';
INT_TYPE : 'COINS';
PRINT: 'SPEAK';
STRING: '"' (~'"'|'\\"')* '"';
GT: 'MOUNTAIN_TYRION';
LT: 'TYRION_MOUNTAIN';
EQ: 'TYRION_TYRION';
NE: 'NOT_EQUALS';
EQUALS: 'IS' ;
SEMICOLON:  'AND_NOW_YOUR_WATCH_HAS_ENDED';
IDENTIFIER: [a-zA-Z]+;
INT : [0-9]+;
WS: [\r\n\t ]+ -> skip;
