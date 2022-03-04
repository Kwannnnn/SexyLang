grammar SexyLang;

program: statement*;

expr
    : literal
    ;

literal
    : bulgeLiteral
    | bodyCountLiteral
    | lengthLiteral
    | safeWordLiteral
    ;

statement
    : varDeclaration
    | varAssignment
    | printStmt
    ;

varDeclaration: INSERT type literal IN IDENTIFIER;
varAssignment: INSERT literal IN IDENTIFIER;
printStmt: (MOAN | MOANLOUD) expr;

type
    : BULGE
    | BODYCOUNT
    | LENGTH
    | SAFEWORD
    ;

keyword
    : BULGE
    | BODYCOUNT
    | LENGTH
    | SAFEWORD
    | INSERT
    | IN
    | MOAN
    | MOANLOUD
    | BEDACTIVITY
    | EJACULATE
    | IF
    | ELSEIF
    | ELSE
    | LUBE
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
ELSEIF:         'elseif';
ELSE:           'else';
LUBE:           'lube';
// Other
HARD:           'hard';
SOFT:           'soft';

// SEPARATORS
L_PAREN:    '(';
R_PAREN:    ')';
L_BRACE:    '{';
R_BRACE:    '}';
COMMA:      ',';

// OPERATORS
// Arithmetic
ADD:        '+';
SUB:        '-';
MULT:       '*';
DIV:        '/';
NEG:        '!';
// Logic
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