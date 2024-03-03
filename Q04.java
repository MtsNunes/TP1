// bibliotecas
import java.util.Scanner;
import java.util.Random;

public class Q04 {
    public static void main ( String[] args ) {
        // definir dados
        char caracter;
        char substituto;
        Random gerador = new Random( );
        gerador.setSeed( 4 );
        // variaveis de entrada
        Scanner reader = new Scanner( System.in );
        String str;
        String newStr;

        // repeticao para controlar as entradas e saidas
        do {
            // entrada
            str = reader.nextLine( );

            // condicao de para encerrar quando str = "FIM"
            if ( !( str.equals( "FIM" ) ) ) {

                // repeticao para escolher caracter que sera substituido
  //              do {
                    caracter = ( char ) ( 'a' + ( Math.abs( gerador.nextInt( ) ) % 26 ) );
//                } while ( isInString( str, caracter ) ); // end do-while

                // gerar caracter que substituira
                substituto = ( char ) ( 'a' + ( Math.abs( gerador.nextInt( ) ) % 26 ) );

                // susbtituir
                newStr = substituicao( str, caracter, substituto );

                // mostrar na tela a string com suas devidas substituicoes
                System.out.println ( newStr );
            } // end if
        } while ( !( str.equals( "FIM" ) ) );
    }

    /*
        isInString( ) - funcao para verificar se um caracter faz parte de uma string
        @param str - string que sera verificada
        @param C - caracter que sera verificado
        @return - true  -> se pertencer a string
                  false -> se nao pertencer a string
    */
    public static boolean isInString ( String str, char caracter ) {
        // definir dados
        boolean resultado = true;

        // repeticao para verificar
        for ( int i = 0; i < str.length( ); i = i + 1 ) {

            // condicao para verificar se o caracter esta na posicao i da string
            if ( caracter == str.charAt(i) ) {
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
    public static String substituicao( String str, char caracter, char substituto ) {
        // definir dados
        String newStr = new String( );

        // repeticao para preencher a nova string substituindo os caracteres
        for ( int i = 0; i < str.length( ); i = i + 1 ) {
            // condicao para realizar substituicao apenas das letras escolhidas
            if ( str.charAt(i) != caracter ) {
                newStr = newStr + str.charAt(i);
            } else {
                newStr = newStr + substituto;
            } // end if
        } // end for

        // retornar nova string
        return ( newStr );
    } // end substituicao( )
} // end Q04