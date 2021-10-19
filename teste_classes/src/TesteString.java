/**
 * @author satoshi
 * @version (1.0)
 *
 */

public class TesteString
{
    // String é uma classe do java
    // portanto todas as variaveis são objetos
    public static void main(String[] args) {

        String texto1 = "teste 1 teste 1 teste 1";
        String texto2 = new String("teste 2 teste 2 teste 2 teste 2");

        // coloca em caixa alta
        System.out.println(texto1.toUpperCase());
        // pegando a partir do caracter x ate a posiçao y
        System.out.println( texto2.substring(5,10));
        // compara se a string é igual a x
        System.out.println( texto1.equals("teste1") );
        // pega o caractere da posição x
        System.out.println( texto2.charAt(10));

        //declaramos um array usando colchetes
        //no java temos vetor com tipos definidos
        // divide a string no caracter x
        String[] vetor = texto1.split(" ");
        System.out.println(vetor[4]);

    }

}
