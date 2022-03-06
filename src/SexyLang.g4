grammar SexyLang;

program: (expression | statement)*;

// EXPRESSIONS
expression
    : literal
    | arithmeticExpression
    | logicExpression
    | bedActivityCall
    ;

arithmeticExpression
    : bodyCountLiteral arithmeticOperator bodyCountLiteral
    | lengthLiteral arithmeticOperator lengthLiteral
    ;

logicExpression
    : unaryLogicExpression
    | comparable binaryLogicOperator comparable
    ;

comparable
    : literal
    | unaryLogicExpression
    ;

unaryLogicExpression
    : NEG? bulgeLiteral
    ;

bedActivityCall
    : IDENTIFIER L_PAREN params? R_PAREN;

params
    : (expression | IDENTIFIER) (COMMA (expression | IDENTIFIER))*
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

block
    : L_CURLY blockStatement? R_CURLY
    ;

blockStatement
    : varDeclaration
    | varAssignment
    | moanStmt
    | ifStmt
    | lubeStmt
    | ejaculateStmt
    ;

varDeclaration: INSERT type expression IN IDENTIFIER;
varAssignment: INSERT expression IN IDENTIFIER;
moanStmt: (MOAN | MOANLOUD) (expression | IDENTIFIER);
ejaculateStmt: EJACULATE (expression | IDENTIFIER)?;
ifStmt: IF L_PAREN condition R_PAREN block elseStmt?;
elseStmt: ELSE (block | ifStmt);
lubeStmt: LUBE condition block;
bedActivityStmt: BEDACTIVITY IDENTIFIER type? L_PAREN paramsDeclaration? R_PAREN block;

paramsDeclaration
    : type IDENTIFIER
    ;

// LOGIC
condition
    : expression
    | expression ((AND | OR) expression)*
    ;

// TYPES AND LITERALS
// Types
type
    : BULGE
    | BODYCOUNT
    | LENGTH
    | SAFEWORD
    ;

// Literals
literal
    : bulgeLiteral
    | bodyCountLiteral
    | lengthLiteral
    | safeWordLiteral
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
arithmeticOperator
    : ADD
    | SUB
    | MULT
    | DIV
    ;
ADD:        '+';
SUB:        '-';
MULT:       '*';
DIV:        '/';
// Logic
binaryLogicOperator
    : EQUAL
    | GT
    | LT
    | GE
    | LE
    ;
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