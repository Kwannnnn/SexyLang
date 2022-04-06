grammar SexyLang;

program: (expression | statement)* EOF;

// EXPRESSIONS
expression
    : L_PAREN expression R_PAREN                                        #GroupExpression
    | NEG expression                                                    #NegationExpression
    | left=expression op=(MUL | DIV) right=expression                   #MulDivExpression
    | left=expression op=(ADD | SUB) right=expression                   #AddSubExpression
    | left=expression op=(EQUAL | LE | GE | LT | GT) right=expression   #LogicExpression
    | left=expression op=(AND | OR) right=expression                    #ChainedLogicExpression
    | whatLengthCall                                                    #WhatLengthCallExpression
    | bedActivityCall                                                   #BedActivitCallExpression
    | bulgeLiteral                                                      #BulgeLiteralExpression
    | bodyCountLiteral                                                  #BodyCountLiteralExpression
    | safeWordLiteral                                                   #SafeWordLiteralExpression
    | lengthLiteral                                                     #LengthLiteralExpression
    | bodyCountArrayLiteral                                             #BodyCountArrayLiteralExpression
    | arrayAccess                                                       #ArrayAccessExpression
    | IDENTIFIER                                                        #IdentifierExpression
    ;

 whatLengthCall: WHAT_LENGTH L_PAREN R_PAREN;

 bedActivityCall
     : name=IDENTIFIER L_PAREN params? R_PAREN;

 params
     : expression (COMMA expression)*
     ;

// STATEMENTS
statement
    : varDeclaration
    | varAssignment
    | moanStmt
    | ifStmt
    | lubeStmt
    | bedActivityStmt
    ;

blockStatement
    : varDeclaration
    | varAssignment
    | moanStmt
    | ifStmt
    | lubeStmt
    ;

block
    : L_CURLY (expression | blockStatement)* R_CURLY
    ;

methodBlock
    : L_CURLY (expression | blockStatement)* ejaculateStmt R_CURLY
    ;

varDeclaration: command=INSERT varType=type expression IN varName=IDENTIFIER;
varAssignment: command=INSERT expression IN varName=IDENTIFIER;
moanStmt: command=(MOAN | MOANLOUD) expression;
ejaculateStmt: command=EJACULATE expression?;
ifStmt: command=IF L_PAREN condition=expression R_PAREN block elseIfStmt* elseStmt?;
elseIfStmt: command=ELSEIF L_PAREN condition=expression R_PAREN block;
elseStmt: command=ELSE block;
lubeStmt: command=LUBE condition=expression block;
bedActivityStmt: BEDACTIVITY name=IDENTIFIER type L_PAREN args? R_PAREN methodBlock;

args
    : argDeclaration (COMMA argDeclaration)*
    ;

argDeclaration
    : type name=IDENTIFIER
    ;

// TYPES AND LITERALS
// Types
type
    : EMPTY
    | BULGE
    | BODYCOUNT
    | LENGTH
    | SAFEWORD
    | BODYCOUNT_ARRAY
    ;

bulgeLiteral
    : HARD
    | SOFT
    ;
safeWordLiteral: STRING ;
bodyCountLiteral: '0' | '-'? NUMBER;
lengthLiteral: bodyCountLiteral ('.' ('0' | NUMBER))?;

bodyCountElements: bodyCountLiteral (COMMA bodyCountLiteral)*;
bodyCountArrayLiteral: L_SQUARE bodyCountElements? R_SQUARE;
// insert bodyCountArray [6, 9] in ass

arrayAccess: IDENTIFIER L_SQUARE index=('0' | NUMBER) R_SQUARE;

// KEYWORDS
// Types
EMPTY:          'empty';
BULGE:          'bulge';
BODYCOUNT:      'bodyCount';
BODYCOUNT_ARRAY:'bodyCountArray';
LENGTH:         'length';
SAFEWORD:       'SafeWord';
// Reserved for methods
INSERT:         'insert';
IN:             'in';
MOAN:           'moan';
MOANLOUD:       'moanLoud';
BEDACTIVITY:    'bedActivity';
EJACULATE:      'ejaculate';
IF:             'if';
ELSEIF:         'else if';
ELSE:           'else';
LUBE:           'lube';
// Other
HARD:           'hard';
SOFT:           'soft';

// SEPARATORS
L_PAREN:    '(';
R_PAREN:    ')';
L_CURLY:    '{';
R_CURLY:    '}';
L_SQUARE:   '[';
R_SQUARE:   ']';
COMMA:      ',';

// OPERATORS
// Arithmetic
ADD:        '+';
SUB:        '-';
MUL:       '*';
DIV:        '/';
NEG:        '!';
EQUAL:      '==';
GT:         '>';
LT:         '<';
GE:         '>=';
LE:         '<=';
// Logic
AND:        'and';
OR:         'or';

WHAT_LENGTH: 'whatLength';

// TODO: Copy STRING rules from java
//STRING: '"' [a-zA-Z0-9 ]* '"';
STRING: '"' (~["\\\r\n])* '"';
IDENTIFIER: [A-Za-z][A-Za-z0-9_]*;
NUMBER : [1-9][0-9]*;

WS: [\r\n\t ]+ -> skip;
COMMENT:    '3==D';