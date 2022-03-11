grammar SexyLang;

program: (expression | statement)* EOF;

// EXPRESSIONS
expression
    : NEG expression                                                    #NegationExpression
    | left=expression op=(MUL | DIV) right=expression                   #MulDivExpression
    | left=expression op=(ADD | SUB) right=expression                   #AddSubExpression
    | left=expression op=(EQUAL | LE | GE | LT | GT) right=expression   #LogicExpression
    | expression op=(AND | OR) expression                               #ChainedLogicExpression
    | L_PAREN expression R_PAREN                                        #GroupExpression
    | bedActivityCall                                                   #BedActivitCallExpression
    | bulgeLiteral                                                      #BulgeLiteralExpression
    | bodyCountLiteral                                                  #BodyCountLiteralExpression
    | safeWordLiteral                                                   #SafeWordLiteralExpression
    | lengthLiteral                                                     #LengthLiteralExpression
    | IDENTIFIER                                                        #IdentifierExpression
    ;

 bedActivityCall
     : IDENTIFIER L_PAREN params? R_PAREN;

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
    | ejaculateStmt
    ;

block
    : L_CURLY blockStatement? R_CURLY
    ;

varDeclaration: INSERT type expression IN IDENTIFIER;
varAssignment: INSERT expression IN IDENTIFIER;
moanStmt: (MOAN | MOANLOUD) expression;
ejaculateStmt: EJACULATE expression?;
ifStmt: IF L_PAREN expression R_PAREN block elseStmt?;
elseStmt: ELSE (block | ifStmt);
lubeStmt: LUBE expression block;
bedActivityStmt: BEDACTIVITY IDENTIFIER type? L_PAREN paramsDeclaration? R_PAREN block;

paramsDeclaration
    : type IDENTIFIER
    ;

// TYPES AND LITERALS
// Types
type
    : BULGE
    | BODYCOUNT
    | LENGTH
    | SAFEWORD
    ;

bulgeLiteral
    : HARD
    | SOFT
    ;
bodyCountLiteral: '0' | '-'? NUMBER;
lengthLiteral: bodyCountLiteral ('.' ('0' | NUMBER))?;
safeWordLiteral: '"' IDENTIFIER* '"';


// KEYWORDS
// Types
BULGE:          'bulge';
BODYCOUNT:      'bodyCount';
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
COMMA:      ',';

// OPERATORS
// Arithmetic
ADD:        '+';
SUB:        '-';
MUL:       '*';
DIV:        '/';
// Logic
NEG:        '!';
EQUAL:      '==';
GT:         '>';
LT:         '<';
GE:         '>=';
LE:         '<=';
AND:        'and';
OR:         'or';

IDENTIFIER : [A-Za-z][A-Za-z0-9_]*;
NUMBER : [1-9][0-9]*;

WS: [\r\n\t ]+ -> skip;
COMMENT:    '3==D';