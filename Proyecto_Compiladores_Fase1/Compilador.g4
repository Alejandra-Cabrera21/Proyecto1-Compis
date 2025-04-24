grammar Compilador;

programa: lista_declaraciones lista_funciones lista_sentencias ;

lista_declaraciones: declaracion lista_declaraciones | ;
declaracion: tipo ;

tipo: 'int' IDENT '=' expresion ';'
    | 'float' IDENT '=' expresion ';'
    | 'string' IDENT '=' STRING ';'
    | 'bool' IDENT '=' booleano ';' ;

expresion: expresion_suma ;
expresion_suma: expresion_multiplicacion (('+' | '-') expresion_multiplicacion)* ;
expresion_multiplicacion: expresion_parentesis (('*' | '/') expresion_parentesis)* ;
expresion_parentesis: '(' expresion ')' | NUMERO | IDENT ;

booleano: 'True'
        | 'False'
        | IDENT operador_relacional IDENT
        | NUMERO operador_relacional NUMERO ;

operador_relacional: '==' | '!=' | '>' | '<' ;

lista_funciones: funcion lista_funciones | ;
funcion: 'def' IDENT '(' parametros ')' bloque ;
parametros: var IDENT mas_parametros | ;
mas_parametros: ',' var IDENT mas_parametros | ;
var: 'int' | 'float' | 'string' | 'bool' ;

bloque: '{' lista_sentencias '}' ;
lista_sentencias: sentencia lista_sentencias | ;
sentencia: asignacion
         | estructura_control
         | entrada_salida
         | llamada_funcion ;

asignacion: IDENT '=' expresion ';'
          | IDENT '=' STRING ';'
          | IDENT '=' booleano ';' ;

estructura_control: 'if' '(' booleano ')' bloque else_opcional
                  | 'while' '(' booleano ')' bloque ;

else_opcional: 'else' bloque | ;

entrada_salida: 'read' '(' STRING ')' ';'
              | 'write' '(' contenido ',' STRING ')' ';'
              | 'Print' '(' contenido ')' ';' ;

contenido: STRING | IDENT ;

llamada_funcion: IDENT '(' argumentos ')' ';' ;
argumentos: expresion mas_argumentos | ;
mas_argumentos: ',' expresion mas_argumentos | ;

// LÉXICO
IDENT: [a-zA-Z_][a-zA-Z0-9_]* ;
NUMERO: [0-9]+('.'[0-9]+)? ;
STRING: '"' .*? '"' ;

PLUS: '+' ;
MINUS: '-' ;
MUL: '*' ;
DIV: '/' ;

EQ: '==' ;
NEQ: '!=' ;
GT: '>' ;
LT: '<' ;

LBRACE: '{' ;
RBRACE: '}' ;
LPAREN: '(' ;
RPAREN: ')' ;
SEMI: ';' ;
ASSIGN: '=' ;
COMMA: ',' ;

WS: [ \t\r\n]+ -> skip ;
