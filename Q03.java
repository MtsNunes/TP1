// bibliotecas
import java.util.Scanner;

public class Q03 {
    public static void main ( String[] args ) {
        // definir dados
        // variaveis de entrada
        String str = new String( );
        // variaveis de saida
        String newStr = new String( );

        // repeticao de controle das entradas e saidas
        do {
            // entrada
            str = MyIO.readLine( );

            if ( !( str.equals( "FIM" ) ) ) {
                // armazenar a mensagem criptografada em newStr
                newStr = criptografar( str );
                // mostrar mensagem criptografada
                MyIO.println ( newStr );
            }
        } while ( !( str.equals( "FIM" ) ) ); // end do-while
    } // end main( )

    /*
        criptografar( ) - funcao que realiza o ciframento de Cesar
        @param str - mensagem que sera criptografada
        @return - string com mensagem criptografada
    */
    public static String criptografar( String str ) {
        // definir dados
        String newStr = new String( );

        // repeticao para percorrer str e armazenar mensagem criptografada em newStr
        for ( int i = 0; i < str.length( ); i = i + 1 ) {
            newStr = newStr + ( char ) ( str.charAt( i ) + 3 );
        } // end for

        // retornar mensagem criptografada
        return ( newStr );
    } // end criptografar( )
} // end Q03