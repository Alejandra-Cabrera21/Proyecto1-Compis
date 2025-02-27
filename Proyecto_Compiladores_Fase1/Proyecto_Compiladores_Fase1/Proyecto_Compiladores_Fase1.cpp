#include <iostream>

using namespace std;

enum TokenType {
    IDENTIFICADOR, NUMERO_ENTERO, NUMERO_FLOTANTE, CADENA_TEXTO,
    OPERADOR_ARITMETICO, OPERADOR_RELACIONAL, PALABRA_CLAVE,
    SIMBOLO_ESPECIAL, ERROR, FIN_DE_ARCHIVO
};

struct Token {
    TokenType tipo;
    string valor;   
};


int main() {


    return 0;
}
