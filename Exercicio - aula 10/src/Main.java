/**
 * Sistema que faz uma operação aritimética simples
 * - Recebe dois números e um operador e exibe o resultado
 * - Calculadora simples
 *
 * @author Satoshi
 * @version (1.0)
 */

public class Main {
    /**
     *  Metodo Principal
     */
    public static void main(String[] args) {
        double n1 = Tela.retornaDbl("Informe um valor");
        double n2 = Tela.retornaDbl("Informe outro valor");
        String op = Tela.retornaTxt("Informe o operador: (+, -, *, /)");

        double res = Calculadora.exec(n1, n2, op);

        Tela.mostraTxt("Resultado: " + res);

    }

}
