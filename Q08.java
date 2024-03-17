// bibliotecas 
import java.io.*;

public class Q08 {
    public static void main ( String[] args ) throws Exception {
        // definir dados
        RandomAccessFile raf = new RandomAccessFile( "Questao08.txt", "rw" ); // abrir arquivo
        // variaveis de entrada
        int n = 0;
        double numero = 0.0;

        // digitar quantidade de numeros
        n = MyIO.readInt( );

        // repeticao para ler numeros e salvar em arquivo
        for( int i = 0; i < n; i = i + 1 ) {
            // ler numero
            numero = MyIO.readDouble( );
            // abrir arquivo
            raf.writeDouble( numero );
        } // end for

        // fechar arquivo
        Arq.close( ); 

        // chamar funcao
        lerDeArquivoEEscrever( "Questao08.txt", n );

    } // end main( )

    /*
        lerDeArquivoEEscrever( ) - funcao para ler valores de um arquivo e escreve-los na tela de tras para frente
        @param filename - nome do arquivo
        @param quantidade - quantidade de valores que o arquivo possui
    */
    public static void lerDeArquivoEEscrever( String filename, int quantidade ) throws Exception {
        // definir dados
        RandomAccessFile raf = new RandomAccessFile( filename, "rw" );
        double numero = 0.0;

        // repeticao para ler arquivo e escrever na tela os valore de tras pra frente
        for( int i = quantidade * 8 - 1; i >= 0; i = i - 1 ) {

            // condicao para setar corretamente o ponteiro nos valores necessarios
            if( i % 8 == 0 || i == 0 ){
                raf.seek(i);

                // armazenar valor em variavel
                numero = raf.readDouble( );

                // verificar se variavel e inteira ou real e escrever na tela
                if( isInteiro( numero ) ) {
                    System.out.println( (int)numero );
                } else {
                    System.out.println( numero );
                }
            } // end if
        } // end for
    } // end lerDeArquivoEEscrever( )

    /*
        isInteiro - funcao que verifica se um numero e inteiro ou nao
        @param n - numero que sera verificado
        @return - valor booleano: true  -> se for inteiro
                                  false -> se nao for inteiro
    */
    public static boolean isInteiro( double n ) {
        // definir dados
        boolean resultado = false;

        // condicao de verificacao
        if( n == (int)n ) {
            resultado = true;
        } // end if

        // retornar valor
        return ( resultado );
    } // end isinteiro( )
} // end Q08