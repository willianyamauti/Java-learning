/**
 * Write  Pares description here.
 *
 * @author Satoshi
 * @version (1.0)
 */

public class Pares {
    // retorna uma string com todos os numeros pares de x a y

    /**
     *
     * @param ini
     * @param fim
     * @return str
     */
    public String retornaNros (int ini, int fim){
        StringBuilder pares = new StringBuilder();
        for (int n = ini; n <= fim; n++){
            if (n%2 == 0){
                // adiciona o novo numero formatado na string pares
                pares.append(n).append("-");
            }
        }

        return pares.toString();
    }

}
