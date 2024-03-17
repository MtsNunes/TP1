#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

bool isInteiro( double numero )
{
    // definir dados
    bool resultado = false;

    // condicao de verificacao
    if( numero == (int)numero )
    {
        resultado = true;
    } // end if

    // retornar valor
    return ( resultado );
} // end isInteiro( )

void readFileAndWrite( char* filename, int n )
{
    // definir dados
    double num = 0.0;
    int num2 = 0;

    // abrir arquivo
    FILE* arquivo = fopen( filename, "rb" );

    fseek( arquivo, 0, SEEK_END );
    double fileSize = ftell( arquivo );
    rewind( arquivo );

    // repeticao para percorrer arquivo e mostrar na tela seus valores
    for ( int i = 0; i < n; i = i + 1 ) 
    {
        fseek( arquivo, fileSize - (i + 1) * sizeof(double), SEEK_SET );

        // ler valor de arquivo
        fread( &num, sizeof(double), 1, arquivo );

        // condicao para mostrar na tela
        if ( isInteiro( num ) ) 
        {
            num2 = (int)num;
            printf( "%d\n", num2 );
        } 
        else 
        {
            printf( "%g\n", num );
        } // end if
    } // end for

} // end readFileAndWrite( )

int main( int argc, char* argv[] )
{
    // definir dados
    FILE* arquivo;
    // variaveis de entrada
    int n = 0;
    double num = 0.0;

    // ler quantidade
    scanf( "%d", &n );

    // abrir arquivo
    arquivo = fopen( "Questao09.bin", "wb" );

    // repeticao para preencher valores em aquivo
    for( int i = 0; i < n; i = i + 1 )
    {
        // ler numero
        scanf( "%lf", &num );
        // esrever em arquivo
        fwrite( &num, sizeof(double), 1, arquivo );
    } // end for
    
    // fechar arquivo
    fclose( arquivo );

    // chamar funcao
    readFileAndWrite( "Questao09.bin", n );

    // fim do programa
    return( 0 );
} // end main( )