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

varDeclaration: command=INSERT varType=type expression IN varName=IDENTIFIER;
varAssignment: command=INSERT expression IN varName=IDENTIFIER;
moanStmt: command=(MOAN | MOANLOUD) expression;
ejaculateStmt: command=EJACULATE expression?;
ifStmt: command=IF L_PAREN condition=expression R_PAREN block elseIfStmt* elseStmt?;
elseIfStmt: command=ELSEIF L_PAREN conition=expression R_PAREN block;
elseStmt: command=ELSE block;
lubeStmt: command=LUBE expression block;
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
safeWordLiteral: STRING ;
bodyCountLiteral: '0' | '-'? NUMBER;
lengthLiteral: bodyCountLiteral ('.' ('0' | NUMBER))?;


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

STRING: '"' [a-zA-Z0-9 ]* '"';
IDENTIFIER : [A-Za-z][A-Za-z0-9_]*;
NUMBER : [1-9][0-9]*;

WS: [\r\n\t ]+ -> skip;
COMMENT:    '3==D';