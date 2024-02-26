// bibliotecas
import java.util.Scanner;

public class Q10 {
    public static void main ( String[] args ) {
        // definir dados
        // variaveis de entrada
        String str;
        Scanner reader = new Scanner ( System.in );

        // repeticao de controle das entradas e saidas
        do {
            // entrada
            str = reader.nextLine( );

            // condicao para evitar o teste do FIM
            if ( !( str.equals( "FIM" ) ) ) {
                // condicao que verifica se e palindromo ou nao
                if ( isPalindromo( str, 0 ) == true ) {
                    // mostrar na tela se verdadeiro 
                    System.out.println ( "SIM" );
                } else {
                    // mostrar na tela se false
                    System.out.println ( "NAO" );
                } // end if
            } // end if
        } while ( !( str.equals( "FIM" ) ) ); // end do-while
    } // end main( )

    /*
        isPalindromo( ) - funcao que verifica se e ou nao palindromo
        @param str - string que sera analisada
        @return - valor booleano ( true se palindromo || false se nao palindromo )
    */
   public static boolean isPalindromo ( String str, int pos ) {
        // definir dados
        boolean resp = true;

        // caso base
        if ( pos == str.length( ) ) {
            resp = true;
        } else if ( str.charAt(pos) != str.charAt(str.length( ) - pos - 1) ) {
            resp = false;
        } else {
            resp = isPalindromo( str, pos + 1 );
        } // end if

        // retornar valor
        return ( resp );
    }
} // end Q10