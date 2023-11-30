grammar Bashiv2;

// Reglas sintácticas

// Aquí definimos la regla para un script que puede contener múltiples declaraciones
script: statement*;

// Definimos la regla para una declaración, que puede ser un comando, un bucle, o una asignación
statement: command | loop | assignment | listDeclaration | COMMENT;

// Regla para un comando, que puede ser un simple comando, una estructura if o una estructura switch
command: simpleCommand | ifCommand | switchCommand;

// Regla para un simple comando que consiste en una palabra seguida de argumentos opcionales
simpleCommand: WORD (ARG+)?;

// Regla para una estructura if con condición, bloque 'then', bloque 'else' y 'fi'
ifCommand: 'if' condition 'then' script 'else' script 'fi';


// Regla para una estructura switch con expresión, casos y bloque 'esac'
switchCommand: 'switch' WORD 'in' '{' switchCases* '}' 'esac';

// Regla para un caso en la estructura switch
switchCases: 'case' (WORD | NUMBER) ':' script;

// Regla para un bucle, que puede ser un bucle 'for' o un bucle 'while'
loop: 'for' WORD 'in' (WORD (',' WORD)*)? 'do' script 'done'
  | 'while' condition 'do' script 'done';

// Regla para una asignación de variable
assignment: WORD '=' WS* expression;

// Regla para una declaración de lista
//declare -a lista= [1.3434,34,]
//myarray = (12,3234,4)
listDeclaration: WORD '=' WS* '(' (expression (',' expression)*)? ')';

// Regla para una condición, aquí es simplificada, pero puedes expandirla para manejar expresiones más complejas
//<
//>
//==
//-a -> &&
//-o ||
condition: WORD | expression;

// Regla para una expresión, que puede ser una expresión simple o una combinación lógica con '&&' o '||'
expression: simpleExpression | expression '&&' expression | expression '||' expression;

// Regla para una expresión simple, que puede ser una palabra, un argumento, un número, o una variable
simpleExpression: WORD #Word
                  | ARG #Arg
                  | NUMBER #Number
                  | variable #Var
                  ; 

// Tokens léxicos

// Definimos las reglas para las palabras, argumentos, cadenas, y números
WORD: [-]?[a-zA-Z_][a-zA-Z0-9_]*;
ARG: WORD | STRING;

STRING: '"' (~["])* '"';
NUMBER: ('+' | '-')? [0-9]+;
variable: '$' WORD;

// Definimos un token para los espacios en blanco que serán ignorados
WS: [ \t\r\n]+ -> skip;

NEWLINE: '\r'? '\n' ;
COMMENT: '#' ~[/\r\n]* NEWLINE -> skip ;
