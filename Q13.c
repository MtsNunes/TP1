// bibliotecas
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

    /*
        isInString( ) - funcao para verificar se um caracter faz parte de uma string
        @param str - string que sera verificada
        @param C - caracter que sera verificado
        @return - true  -> se pertencer a string
                  false -> se nao pertencer a string
    */
bool isInString ( char* str, char caracter ) {
    // definir dados
    bool resultado = true;

    // repeticao para verificar
    for ( int i = 0; i < strlen(str); i = i + 1 ) {

        // condicao para verificar se o caracter esta na posicao i da string
        if ( caracter == str[i] ) {
            resultado = false;
        } // end if
    } // end for

    // retornar valor
    return ( resultado );
} // end isInString( )

    /*
        substituicao( ) - substitui dois caracteres na string
        @param str - string recebida
        @param caracter - caracter escolhido para ser substituido
        @param substituto - caracter que entrara no lugar do outro
        @return - string com os caracteres substituidos
    */
void substituicao( char* str, int pos, char caracter, char substituto ) 
{
    // caso base
    if ( pos ==  strlen( str ) ) 
    {
        str = str;
    } 
    else if ( str[pos] != caracter ) 
    {
        str[pos] = str[pos]; 
        substituicao( str, pos + 1, caracter, substituto );
    } 
    else 
    {
        str[pos] = substituto; 
        substituicao( str, pos + 1, caracter, substituto );
    } // end if
} // end substituicao( )

int main ( int argc, char argv ) 
{
    // definir dados
    char caracter;
    char substituto;
    //srand( 4 );
    // variaveis de entrada
    char* str = (char*) malloc(1000 * sizeof(char));

    // repeticao para controlar as entradas e saidas
    do {
        // entrada
        scanf ( " %[^\n]", str );

        // condicao de para encerrar quando str = "FIM"
        if ( strcmp( str, "FIM" ) != 0 ) {
            
            // gerar caracter que sera substituido
            caracter = 'a' + ( rand() % 26 );

            // gerar caracter que substituira
            substituto = 'a' + ( rand() % 26 );

            substituicao( str, 0, caracter, substituto );

            // mostrar na tela a string com suas devidas substituicoes
            printf( "%s\n", str );
        } // end if
    } while ( strcmp( str, "FIM" ) != 0 );

    // fim do programa
    return ( 0 );
} // end main( )