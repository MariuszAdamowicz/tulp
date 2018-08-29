grammar Stalk;

build_script : (expression EOL)* EOF ;
expression : program_name
             | start_point ;
program_name : 'program' EQUAL ID ;
start_point  : 'start' EQUAL PATH DOT ID ;

ID : [a-zA-Z][a-zA-Z0-9_]* ;
DOT : '.' ;
EQUAL : '=' ;
PATH : [a-zA-Z][a-zA-Z0-9_/]* ;
EOL : [\r\n] ;
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
