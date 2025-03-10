grammar SexyLang;

program: (expression | statement)* EOF;

// EXPRESSIONS
expression
    : L_PAREN expression R_PAREN                                                    #GroupExpression
    | op=NEG expression                                                             #NegationExpression
    | left=expression op=(MUL | DIV) right=expression                               #MulDivExpression
    | left=expression op=(ADD | SUB) right=expression                               #AddSubExpression
    | left=expression op=(EQUAL | NOT_EQUAL | LE | GE | LT | GT) right=expression   #RelationalExpression
    | left=expression op=(AND | OR) right=expression                                #BooleanAlgebraExpression
    | WHAT_LENGTH L_PAREN R_PAREN                                                   #WhatLengthCallExpression
    | name=IDENTIFIER L_PAREN params? R_PAREN                                       #BedActivityCallExpression
    | bulgeLiteral                                                                  #BulgeLiteralExpression
    | bodyCountLiteral                                                              #BodyCountLiteralExpression
    | safeWordLiteral                                                               #SafeWordLiteralExpression
    | lengthLiteral                                                                 #LengthLiteralExpression
    | bodyCountArrayLiteral                                                         #BodyCountArrayLiteralExpression
    | lengthArrayLiteral                                                            #LengthArrayLiteralExpression
    | bulgeArrayLiteral                                                             #BulgeArrayLiteralExpression
    | safeWordArrayLiteral                                                          #SafeWordArrayLiteralExpression
    | arrayAccess                                                                   #ArrayAccessExpression
    | IDENTIFIER                                                                    #IdentifierExpression
    ;

 params
     : expression (COMMA expression)*
     ;

// STATEMENTS
statement
    : arrayValueChangeStmt
    | varDeclaration
    | varAssignment
    | moanStmt
    | ifStmt
    | lubeStmt
    | bedActivityStmt
    | COMMENT
    ;

blockStatement
    : arrayValueChangeStmt
    | varDeclaration
    | varAssignment
    | moanStmt
    | ifStmt
    | lubeStmt
    | COMMENT
    ;

block
    : L_CURLY (expression | blockStatement)* R_CURLY
    ;

methodBlock
    : L_CURLY (expression | blockStatement)* ejaculateStmt R_CURLY
    ;

arrayValueChangeStmt: command=INSERT expression IN arrayAccess;
varDeclaration: command=INSERT varType=type expression IN varName=IDENTIFIER;
varAssignment: command=INSERT expression IN varName=IDENTIFIER;
moanStmt: command=(MOAN | MOANLOUD) expression;
ejaculateStmt: command=EJACULATE expression?;
ifStmt: command=IF L_PAREN condition=expression R_PAREN block elseIfStmt* elseStmt?;
elseIfStmt: command=ELSEIF L_PAREN condition=expression R_PAREN block;
elseStmt: command=ELSE block;
lubeStmt: command=LUBE condition=expression block;
bedActivityStmt: BEDACTIVITY name=IDENTIFIER type L_PAREN parameterList? R_PAREN methodBlock;

parameterList
    : parameterDeclaration (COMMA parameterDeclaration)*
    ;

parameterDeclaration
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
    | LENGTH_ARRAY
    | BULGE_ARRAY
    | SAFEWORD_ARRAY
    ;

bulgeLiteral
    : HARD
    | SOFT
    ;
safeWordLiteral: StringLiteral;
bodyCountLiteral: '0' | '-'? NUMBER;
lengthLiteral: bodyCountLiteral ('.' ('0' | NUMBER))?;

bodyCountElements: bodyCountLiteral (COMMA bodyCountLiteral)*;
bodyCountArrayLiteral: L_SQUARE bodyCountElements? R_SQUARE;

lengthArrayElements: lengthLiteral (COMMA lengthLiteral)*;
lengthArrayLiteral: L_SQUARE lengthArrayElements? R_SQUARE;

bulgeArrayElements: bulgeLiteral (COMMA bulgeLiteral)*;
bulgeArrayLiteral: L_SQUARE bulgeArrayElements? R_SQUARE;

safeWordArrayElements: safeWordLiteral (COMMA safeWordLiteral)*;
safeWordArrayLiteral: L_SQUARE safeWordArrayElements? R_SQUARE;

arrayAccess: IDENTIFIER L_SQUARE index=expression R_SQUARE;

// KEYWORDS
// Types
EMPTY:          'empty';
BULGE:          'bulge';
BODYCOUNT:      'bodyCount';
LENGTH:         'length';
SAFEWORD:       'SafeWord';
BODYCOUNT_ARRAY:'bodyCounts';
LENGTH_ARRAY:   'lengths';
BULGE_ARRAY:    'bulges';
SAFEWORD_ARRAY: 'SafeWords';

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
WHAT_LENGTH:    'whatLength';
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
QUOTE:      '"';

// OPERATORS
// Arithmetic
ADD:        '+';
SUB:        '-';
MUL:       '*';
DIV:        '/';
// Relational
EQUAL:      '==';
NOT_EQUAL:  '!=';
GT:         '>';
LT:         '<';
GE:         '>=';
LE:         '<=';
// Logic
AND:        'and';
OR:         'or';
NEG:        '!';

// Retrieved from https://github.com/antlr/grammars-v4/blob/master/java/java8/Java8Lexer.g4
StringLiteral
    : QUOTE StringCharacters? QUOTE
    ;

fragment
StringCharacters
	:	STRING_CHARACTER+
	;

fragment
STRING_CHARACTER
	:	~["\\\r\n]
	|	'\\' [btnfr"'\\]
	;
IDENTIFIER: [A-Za-z][A-Za-z0-9_]*;
NUMBER:     [1-9][0-9]*;
COMMENT:    '3==D' ~[\r\n]* -> skip;
WS:         [\r\n\t ]+ -> skip;