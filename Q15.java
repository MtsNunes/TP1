// bibliotecas
import java.util.Scanner;

public class Q15 {
    public static void main ( String[] args ) {
        // definir dados
        // variaveis de entrada
        String str;
        Scanner reader = new Scanner ( System.in );
        // variaveis de saida
        boolean x1;
        boolean x2;
        boolean x3;
        boolean x4;
        String x1a;
        String x2a;
        String x3a;
        String x4a;

        // repeticao de controle das entradas e saidas
        do {
            // entrada
            str = reader.nextLine( );

            if ( !( str.equals( "FIM" ) ) ) {

                // fazer verificacoes
                x1 = somenteVogais( str, 0 );
                x2 = somenteConsoantes( str, 0 );
                x3 = isInteiro( str, 0 );
                x4 = isReal( str, 0, 0, 0 );

                // condicoes para mostrar na tela se SIM ou NAO para cada caso
                if ( x1 == true ) {
                    x1a = "SIM";
                } else {
                    x1a = "NAO";
                } // end if
                if ( x2 == true ) {
                    x2a = "SIM";
                } else {
                    x2a = "NAO";
                } // end if
                if ( x3 == true ) {
                    x3a = "SIM";
                } else {
                    x3a = "NAO";
                } // end if
                if ( x4 == true ) {
                    x4a = "SIM";
                } else {
                    x4a = "NAO";
                } // end if
                // end condicoes

                // mostrar na tela
                System.out.println ( x1a + " " + x2a + " " + x3a + " " + x4a );
            } // end if
        } while ( !( str.equals( "FIM" ) ) ); // end do-while
    } // end main( )

    /*
        somenteVogais( ) - funcao que verifica se uma string e composta apenas por vogais
        @param str - string que sera verificada
        @return - true  -> se possui somente vogais
                  false -> se nao possui apenas vogais
    */
    public static boolean somenteVogais( String str, int pos ) {
        // definir dados
        boolean resultado = true;

        // caso base
        if ( pos == str.length( ) ) {
            resultado = true;
        } else if ( isInString( "AEIOUaeiou", str.charAt(pos) ) == false ) {
            resultado = false;
        } else {
            resultado = somenteVogais( str, pos + 1 );
        } // end if

        // retornar valor
        return ( resultado );
    } // end somenteVogais( )

    /*
        somenteConsoantes( ) - funcao que verifica se uma string e composta apenas por consoantes
        @param str - string que sera verificada
        @return - true  -> se possui somente consoantes
                  false -> se nao possui apenas consoantes
    */
    public static boolean somenteConsoantes( String str, int pos ) {
        // definir dados
        boolean resultado = true;
        
        // caso base
        if ( pos == str.length( ) ) {
            resultado = true;
        } else if ( isInString( "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz", str.charAt(pos) ) == false ) {
            resultado = false;
        } else {
            resultado = somenteConsoantes( str, pos + 1 );
        } // end if

        // retornar valor
        return ( resultado );
    } // end somenteConsoantes( )

    /*
        isInteiro( ) - funcao que verifica se uma string e um numero inteiro
        @param str - string que sera verificada
        @return - true  -> se e um numero inteiro
                  false -> se nao e um numero inteiro
    */
    public static boolean isInteiro( String str, int pos ) {
        // definir dados
        boolean resultado = true;
        
        // caso base
        if ( pos == str.length( ) ) {
            resultado = true;
        } else if ( !( '0' <= str.charAt(pos) && str.charAt(pos) <= '9' ) ) {
            resultado = false;
        } else {
            resultado = isInteiro( str, pos + 1 );
        }

        // retornar valor
        return ( resultado );
    } // end isInteiro( )

    /*
        isReal( ) - funcao que verifica se uma string e um numero real
        @param str - string que sera verificada
        @return - true  -> se e um numero real
                  false -> se nao e um numero real
    */
    public static boolean isReal( String str, int pos, int contaV, int contaP ) {
        // definir dados
        boolean resultado = true;
        
        // caso base
        if ( pos == str.length( ) ) {
            resultado = true;
        } else if ( !( '0' <= str.charAt(pos) && str.charAt(pos) <= '9' || str.charAt(pos) == ',' || str.charAt(pos) == '.' ) ) {
            resultado = false;
        } else if ( str.charAt(pos) == ',' ) {
            resultado = isReal( str, pos + 1, contaV + 1, contaP );
        } else if ( str.charAt(pos) == '.' ) {
            resultado = isReal( str, pos + 1, contaV, contaP + 1 );
        } else if ( contaP > 1 ) {
            resultado = false;
        } else if ( contaV > 1 ) {
            resultado = false;
        } else {
            resultado = isReal( str, pos + 1, contaV, contaP );
        } // end if

        // retornar valor
        return ( resultado );
    } // end isReal( )

    /*
        isInString( ) - funcao para verificar se um caracter faz parte de uma string
        @param str - string que sera verificada
        @param C - caracter que sera verificado
        @return - true  -> se pertencer a string
                  false -> se nao pertencer a string
    */
    public static boolean isInString ( String str, char caracter ) {
        // definir dados
        boolean resultado = false;

        // repeticao para verificar
        for ( int i = 0; i < str.length( ); i = i + 1 ) {

            // condicao para verificar se o caracter esta na posicao i da string
            if ( caracter == str.charAt(i) ) {
                resultado = true;
            } // end if
        } // end for

        // retornar valor
        return ( resultado );
    } // end isInString( )
} // end Q15