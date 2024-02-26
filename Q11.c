// bibliotecas
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

/*
    isPalindromo( ) - funcao que verifica se e ou nao palindromo
    @param cadeia - cadeia de caracteres que sera analisada
    @return - valor booleano ( true se palindromo || false se nao palindromo )
*/
bool isPalindromo ( char* cadeia, int pos ) 
{
    // definir dados
    bool resp = true;
    // caso base
    if ( pos == strlen(cadeia) ) 
    {
        resp = true;
    }
    // recursao
    else if ( cadeia[pos] != cadeia[strlen(cadeia) - pos - 1] ) 
    {
        resp = false;
    }
    else
    {
        resp = isPalindromo( cadeia, pos + 1 );
    } // end if

    // retornar valor
    return ( resp );
}

int main ( int agrc, char* argv )
{
    // definir dados
    // variaveis de entrada
    char* cadeia = (char*)malloc(1000*sizeof(char));

    // repeticao de controle das entradas e saidas
    do 
    {
        // entrada
        scanf ( " %[^\n]", cadeia );

        // condicao para evitar o teste do FIM
        if ( strcmp( cadeia,"FIM" ) ) 
        {
            // condicao que verifica se e palindromo ou nao
            if ( isPalindromo( cadeia, 0 ) == true ) 
            {
                // mostrar na tela se verdadeiro 
                printf ( "SIM\n" );
            }
            else
            {
                // mostrar na tela se false
                printf ( "NAO\n" );
            } // end if
        } // end if
    } while ( strcmp( cadeia,"FIM" )  ); // end do-while

    // fim do programa 
    return ( 0 );
} // end main( )