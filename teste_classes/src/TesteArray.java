/**
 * Enter class description here
 *
 * @author Satoshi
 * @version (1.0)
 */

import java.util.*;

public class TesteArray
{
    public static void main(String[] args) {
        // podemos declarar variaveis para comportar
        // mais de um valor(array)
        String[] nomes = new String[5];
        nomes[0] = "Fulano";
        nomes[1] = "Beltrano";
        nomes[2] = "Ciclano";
        nomes[3] = "Deutrano";

        int[] idades = new int[5];
        idades[0] = 12;
        idades[1] = 13;
        idades[2] = 14;

        System.out.println(nomes[1]+" com idade "+idades[1] );
        //-------------------------------------------------------

        // mas podemos utilizar de uma classe da linguagem
        // para manipulação de vetores de qq coisa

        ArrayList vetor = new ArrayList();
        vetor.add("texto de testes");
        vetor.add(1234);

        System.out.println( "qtd de elementos: " + vetor.size() );
        System.out.println(vetor.get(0));
    }

}
