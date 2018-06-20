//header
grammar Tulp;

//RULES
compilationUnit : ( constant | print )* EOF ; //root rule - our code consist consist only of variables and prints (see definition below)
constant : ID EQUALS value ; //requires ID token followed by EQUALS TOKEN ...
print : PRINT LEFT_BRACKET ID RIGHT_BRACKET ; //print statement must consist of 'print' keyword and ID
value : op=NUMBER
      | op=STRING ; //must be NUMBER or STRING value (defined below)

//TOKENS
PRINT : 'print' ;
EQUALS : '=' ; //must be '='
NUMBER : [0-9]+ ; //must consist only of digits
STRING : '\'.*\'' ; //must be anything in qutoes
ID : [a-zA-Z0-9]+ ; //must be any alphanumeric value
WS: [ \t\n\r]+ -> skip ; //special TOKEN for skipping whitespaces
LEFT_BRACKET : '(' ;
RIGHT_BRACKET : ')' ;