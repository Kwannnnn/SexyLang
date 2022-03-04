grammar Seminar;

program: (expr | stat | functionDecl)*;

expr: assExpr | stringLiteral | numberLiteral;
stat: returnStat;
content: (expr | stat) SEMICOLON;

blockStat : OPEN_BRACK content* CLOSE_BRACK;
returnStat : RETURN expr;
functionDecl : FUNCTION IDENTIFIER OPEN_PAR paramsDecl? CLOSE_PAR typeDeclaration? blockStat;

assExpr : (CONST | LET) IDENTIFIER typeDeclaration? EQUALS expr SEMICOLON;
methodCall: IDENTIFIER OPEN_PAR params? CLOSE_PAR;

paramsDecl: IDENTIFIER (COMMA IDENTIFIER)*;
params: expr (COMMA expr)*;


stringLiteral : '"' IDENTIFIER '"';
numberLiteral : '0' | '-'? NUMBER;
typeDeclaration : COLON typeIndication;
typeIndication : (NUMBER_DEF | STRING_DEF);

CONST : 'const';
LET : 'let';
EQUALS : '=';
SEMICOLON : ';';
COLON : ':';
COMMA : ',';
OPEN_PAR : '(';
CLOSE_PAR : ')';
OPEN_BRACK : '{';
CLOSE_BRACK : '}';
NUMBER_DEF : 'number';
STRING_DEF : 'string';
FUNCTION : 'function';
RETURN : 'return';

IDENTIFIER : [A-Za-z][A-Za-z0-9_]*;
NUMBER : [1-9][0-9]*;

WS : [\r\n\t ]+ -> skip;
