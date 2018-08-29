//header
grammar Tulp;

//RULES
compilationUnit : ( classDeclaration )* EOF ;
classDeclaration : CLASS ID classDefinition ;
classDefinition : LEFT_MUSTACHE classElements RIGHT_MUSTACHE ;
classElements : ( method )* ;
method : ID inputTuple (outputTuple)? (asynchronousOutputTuple)? methodDefinition ;
inputTuple : tuple ;
outputTuple : OUTPUT tuple ;
asynchronousOutputTuple : ASYNCHRONOUS_OUTPUT tuple ;
tuple : LEFT_BRACKET RIGHT_BRACKET ;
methodDefinition : LEFT_MUSTACHE methodElements RIGHT_MUSTACHE ;
methodElements : ( constant | print )* ;
//compilationUnit : ( constant | print )* EOF ; //root rule - our code consist consist only of variables and prints (see definition below)
constant : ID EQUALS value ; //requires ID token followed by EQUALS TOKEN ...
print : PRINT LEFT_BRACKET ID RIGHT_BRACKET ; //print statement must consist of 'print' keyword and ID
value : op=NUMBER
      | op=STRING ; //must be NUMBER or STRING value (defined below)

//TOKENS
PRINT : 'print' ;
CLASS : 'class' ;
EQUALS : '=' ; //must be '='
NUMBER : [0-9]+ ; //must consist only of digits
STRING : '\''[a-zA-Z_][a-zA-Z0-9]*'\'' ; //must be anything in qutoes
ID : [a-zA-Z0-9]+ ; //must be any alphanumeric value
WS: [ \t\n\r]+ -> skip ; //special TOKEN for skipping whitespaces
LEFT_BRACKET : '(' ;
RIGHT_BRACKET : ')' ;
LEFT_MUSTACHE : '{' ;
RIGHT_MUSTACHE : '}' ;
OUTPUT : '->' ;
ASYNCHRONOUS_OUTPUT : '@' ;