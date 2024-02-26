// bibliotecas
import java.util.Scanner;

public class Q01 {
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
                if ( isPalindromo( str ) == true ) {
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
    public static boolean isPalindromo ( String str ) {
        // definir dados
        boolean resp = true;
        int esq = 0;
        int dir = str.length( ) - 1;
        int meio = str.length( ) / 2;
 
        // repeticao para percorrer string
        while ( esq < meio ) {
            if ( str.charAt(esq) != str.charAt(dir) ) {
                resp = false;
                esq = meio;
            } // end if
            esq = esq + 1;
            dir = dir - 1;
        } // end while

        // retornar valor
        return ( resp );
    }
} // end Q01