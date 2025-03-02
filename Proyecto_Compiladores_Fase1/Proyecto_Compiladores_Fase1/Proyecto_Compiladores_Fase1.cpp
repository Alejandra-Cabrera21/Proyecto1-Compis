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

const string palabras_clave[] = { "int", "float", "string", "bool", "if", "else", "while", "return", "read", "write", "def" };
const char operadores_aritmeticos[] = { '+', '-', '*', '/' };
const string operadores_relacionales[] = { "==", "!=", "> ", "< " };
const char simbolos_especiales[] = { '{', '}', '(', ')', ';', '=' };

bool esDigito(char c) { return c >= '0' && c <= '9'; }
bool esLetra(char c) { return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == '_'; }
bool esEspacio(char c) { return c == ' ' || c == '\t' || c == '\n'; }
bool esOperadorAritmetico(char c) {
    for (char op : operadores_aritmeticos) if (c == op) return true;
    return false;
}
bool esSimboloEspecial(char c) {
    for (char s : simbolos_especiales) if (c == s) return true;
    return false;
}
bool esPalabraClave(string str) {
    for (string palabra : palabras_clave) if (str == palabra) return true;
    return false;
}
bool esOperadorRelacional(string str) {
    for (string op : operadores_relacionales) if (str == op) return true;
    return false;
}

int main() {


    return 0;
}
