// bibliotecas
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Q07 {
    public static void main ( String[] args ) {
        // definir dados
        String html;
        char e1 = 225;
        char e2 = 233;
        char e3 = 237;
        char e4 = 243;
        char e5 = 250;
        char e6 = 224;
        char e7 = 232;
        char e8 = 236;
        char e9 = 242;
        char e10 = 249;
        char e11 = 227;
        char e12 = 245;
        char e13 = 226;
        char e14 = 234;
        char e15 = 238;
        char e16 = 244;
        char e17 = 251;
        // variaveis de entrada
        Scanner leitor = new Scanner ( System.in );
        String nome;
        String endereco;
        // variaveis de saida
        int x1 = 0;
        int x2 = 0;
        int x3 = 0;
        int x4 = 0;
        int x5 = 0;
        int x6 = 0;
        int x7 = 0;
        int x8 = 0;
        int x9 = 0;
        int x10 = 0;
        int x11 = 0;
        int x12 = 0;
        int x13 = 0;
        int x14 = 0;
        int x15 = 0;
        int x16 = 0;
        int x17 = 0;
        int x18 = 0;
        int x19 = 0;
        int x20 = 0;
        int x21 = 0;
        int x22 = 0;
        int x23 = 0;
        int x24 = 0;
        int x25 = 0;
        // repeticao para controle de entradas e saidas
        do {
            // ler nome
            nome = leitor.nextLine( );

            // condicao para interromper quando nome == FIM
            if ( !( isFIM( nome ) ) ) {
                // zerar variaveis
                x1 = 0;
                x2 = 0;
                x3 = 0;
                x4 = 0;
                x5 = 0;
                x6 = 0;
                x7 = 0;
                x8 = 0;
                x9 = 0;
                x10 = 0;
                x11 = 0;
                x12 = 0;
                x13 = 0;
                x14 = 0;
                x15 = 0;
                x16 = 0;
                x17 = 0;
                x18 = 0;
                x19 = 0;
                x20 = 0;
                x21 = 0;
                x22 = 0;
                x23 = 0;

                // ler endereco
                endereco = leitor.nextLine( );

                // armazenar o html todo em uma string
                html = getHtml( endereco );

                // repeticao para percorrer a pagina html e armazenar nos contadores as quantidades pedidas
                for( int i = 0; i < html.length( ); i = i + 1 ) {
                    if ( html.charAt(i) == 'a' ) { // 'a'
                        x1 = x1 + 1;
                    } else if ( html.charAt(i) == 'e' ) { // 'e'
                        x2 = x2 + 1;
                    } else if ( html.charAt(i) == 'i' ) { // 'i'
                        x3 = x3 + 1;
                    } else if ( html.charAt(i) == 'o' ) { // 'o'
                        x4 = x4 + 1;
                    } else if ( html.charAt(i) == 'u' ) { // 'u'
                        x5 = x5 + 1;
                    } else if ( html.charAt(i) == e1 ) { // á
                        x6 = x6 + 1;
                    } else if ( html.charAt(i) == e2 ) { // 'é'
                        x7 = x7 + 1;
                    } else if ( html.charAt(i) == e3 ) { // 'í'
                        x8 = x8 + 1;
                    } else if ( html.charAt(i) == e4 ) { // 'ó'
                        x9 = x9 + 1;
                    } else if ( html.charAt(i) == e5 ) { // 'ú'
                        x10 = x10 + 1;
                    } else if ( html.charAt(i) == e6 ) { // 'à'
                        x11 = x11 + 1;
                    } else if ( html.charAt(i) == e7 ) { // 'è'
                        x12 = x12 + 1;
                    } else if ( html.charAt(i) == e8 ) { // 'ì'
                        x13 = x13 + 1;
                    } else if ( html.charAt(i) == e9 ) { // 'ò'
                        x14 = x14 + 1;
                    } else if ( html.charAt(i) == e10 ) { // 'ù'
                        x15 = x15 + 1;
                    } else if ( html.charAt(i) == e11 ) { // 'ã'
                        x16 = x16 + 1;
                    } else if ( html.charAt(i) == e12 ) { // 'õ'
                        x17 = x17 + 1;
                    } else if ( html.charAt(i) == e13 ) { // 'â'
                        x18 = x18 + 1;
                    } else if ( html.charAt(i) == e14 ) { // 'ê'
                        x19 = x19 + 1;
                    } else if ( html.charAt(i) == e15 ) { // 'î'
                        x20 = x20 + 1;
                    } else if ( html.charAt(i) == e16 ) { // 'ô'
                        x21 = x21 + 1;
                    } else if ( html.charAt(i) == e17 ) { // 'û'
                        x22 = x22 + 1;
                    } else if ( isConsoante( html.charAt(i) ) ) {
                        x23 = x23 + 1;
                    }
                } // end for

                x24 = contaTagBr( html );
                x25 = contaTagTable( html );

            System.out.println( "a" + '(' + x1 + ')' + ' ' + "e" + '(' + x2 + ')' + ' ' + "i" + '(' + x3 + ')' + ' ' + "o" + '(' + x4 + ')' + ' ' + "u" + '(' + x5 + ')' + ' ' + e1 + '(' + x6 + ')' + ' ' + e2 + '(' + x7 + ')' + ' ' + e3 + '(' + x8 + ')' + ' ' + e4 + '(' + x9 + ')' + ' ' + e5 + '(' + x10 + ')' + ' ' + e6 + '(' + x11 + ')' + ' ' + e7 + '(' + x12 + ')' + ' ' + e8 + '(' + x13 + ')' + ' ' + e9 + '(' + x14 + ')' + ' ' + e10 + '(' + x15 + ')' + ' ' + e11 + '(' + x16 + ')' + ' ' + e12 + '(' + x17 + ')' + ' ' + e13 + '(' + x18 + ')' + ' ' + e14 + '(' + x19 + ')' + ' ' + e15 + '(' + x20 + ')' + ' ' + e16 + '(' + x21 + ')' + ' ' + e17 + '(' + x22 + ')' + ' ' + "consoante" + '(' + x23 + ')' + ' ' + "<br>" + '(' + x24 + ')' + ' ' + "<table>" + '(' + x25 + ')' + ' ' + nome );
            } // end if
        } while ( !( isFIM( nome ) ) );
    } // end main( )

    /*
        contaTagBr( ) - funcao que verifica se e uma tag <br>
        @param str - string(html) que sera verificada
        return - quantidade de tags <br> existentes
    */
    public static int contaTagBr ( String str ) {
        // definir dados
        int contador = 0;

        // repeticao para percorrer a string
        for( int i = 0; i < str.length( ); i = i + 1 ) {
            if ( str.charAt(i) == '<' ) {
                if ( str.charAt(i + 1) == 'b' ) {
                    if ( str.charAt(i + 2) == 'r' ) {
                        if ( str.charAt(i + 3) == '>' ) {
                            contador = contador + 1;
                        } // end if
                    } // end if
                } // end if
            } // end if
        } // end for

        // retornar valor
        return ( contador );
    } // end contaTagBr

    /*
        contaTagTable( ) - funcao que verifica se e uma tag <table>
        @param str - string(html) que sera verificada
        return - quantidade de tags <table> existentes
    */
    public static int contaTagTable ( String str ) {
        // definir dados
        int contador = 0;

        // repeticao para percorrer a string
        for( int i = 0; i < str.length( ); i = i + 1 ) {
            if ( str.charAt(i) == '<' ) {
                if ( str.charAt(i + 1) == 't' ) {
                    if ( str.charAt(i + 2) == 'a' ) {
                        if ( str.charAt(i + 3) == 'b' ) {
                            if ( str.charAt(i + 4) == 'l' ) {
                                if ( str.charAt(i + 5) == 'e' ) {
                                    if ( str.charAt(i + 6) == '>' ) {
                                        contador = contador + 1;
                                    } // end if
                                } // end if
                            } // end if
                        } // end if
                    } // end if
                } // end if
            } // end if
        } // end for

        // retornar valor
        return ( contador );
    } // end contaTagTable

    /*
        isConsoante( ) - funcao que verifica se um caracter e ou nao consoante
        @param caractere - caractere que sera analisado
        @return - valor booleano: true  -> se for consoante
                                  false -> se nao for consoante
    */
    public static boolean isConsoante( char caractere ) {
        // definir dados
        boolean resp = false;
        char c = caractere;
        
        // condicao que verifica se e vogal ou nao
        if ( isInString( c, "bcdfghjklmnpqrstvwxyz" ) ) {
            resp = true;
        } // end if

        // retornar valor
        return ( resp );
    } // end isConsoante( )

    /*
        isInString( ) - funcao que verifica se um caracter pertence ou nao a uma string
        @param caractere - caractere que sera verificado
        @param str - string que sera analisada
        @return - valor booleano: true  -> se pertence a string
                                  false -> se nao pertence a string
    */
    public static boolean isInString ( char caractere, String str) {
        // definir dados
        boolean resultado = false;

        // repeticao para percorrer string
        for ( int i = 0; i < str.length( ); i = i + 1 ) {
            // condicao para verificar se o caractere pertence ou nao a string
            if ( caractere == str.charAt(i) ) {
                resultado = true;
            } // end if
        } // end for

        // retornar valor
        return ( resultado );
    } // end isInString( )

    /*
        isFIM( ) - verifica se uma string e igual a "FIM"
        @param str - string que sera analisada
        @return - valor booleano: true  -> se igual a FIM
                                  false -> se diferente de FIM
    */
    public static boolean isFIM ( String str ) {
        // definir dados
        boolean resp = false;
        if( str.length( ) == 3 ) {
            if( str.charAt(0) == 'F') {
                if( str.charAt(1) == 'I' ) {
                    if( str.charAt(2) == 'M' ) {
                        resp = true;
                    } // end if
                } // end if
            } // end if
        } // end if

        // retornar valor
        return ( resp );
    } // end isFIM( )

    public static String getHtml(String endereco){
      URL url;
      InputStream is = null;
      BufferedReader br;
      String resp = "", line;

      try {
         url = new URL(endereco);
         is = url.openStream();  // throws an IOException
         br = new BufferedReader(new InputStreamReader(is));

         while ((line = br.readLine()) != null) {
            resp += line + "\n";
         }
      } catch (MalformedURLException mue) {
         mue.printStackTrace();
      } catch (IOException ioe) {
         ioe.printStackTrace();
      } 

      try {
         is.close();
      } catch (IOException ioe) {
         // nothing to see here

      }

      return resp;
   }
} // end Q07