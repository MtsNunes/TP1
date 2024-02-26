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
bool isPalindromo ( char* cadeia ) 
{
    // definir dados
    bool resp = true;
    int esq = 0;
    int dir = strlen(cadeia) - 1;
    int meio = strlen(cadeia) / 2;
 
    // repeticao para percorrer string
    while ( esq < meio ) 
    {
        if ( cadeia[esq] != cadeia[dir] ) 
        {
            resp = false;
            esq = meio;
        } // end if
        esq = esq + 1;
        dir = dir - 1;
    } // end while

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
            if ( isPalindromo( cadeia ) == true ) 
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