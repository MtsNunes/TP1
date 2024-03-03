// bibliotecas
import java.util.Scanner;

public class Q12 {
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
                newStr = criptografar( str, 0 );
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
    public static String criptografar( String str, int pos ) {
        // definir dados
        String newStr = new String( );

        // caso base
        if ( pos == str.length( ) ) {
            newStr = newStr;
        } else {
            newStr = newStr + ( char ) ( str.charAt( pos ) + 3 ) + criptografar( str, pos + 1 );
        } // end if

        // retornar mensagem criptografada
        return ( newStr );
    } // end criptografar( )
} // end Q12