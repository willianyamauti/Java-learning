/**
 * Write  Calculadora description here.
 *
 * @author Satoshi
 * @version (1.0)
 */
import javax.swing.*;
public class Calculadora {
    /**
     * Metodo que realiza as 4 operaçẽs aritmeticas essenciais
     * @param n1 primeiro numero
     * @param n2 Segundo nuemero
     * @param op Operadores disponives(+, -, *, /)
     * @return resultado como double
     */
    public static Double exec(double n1, double n2, String op){
//        switch (op){
//            case "+":
//                res = n1 + n2;
//                break;
//
//            case "-":
//                res = n1 - n2;
//                break;
//            case "*":
//                res = n1 * n2;
//                break;
//            case "/":
//                res = n1 / n2;
//                break;
//            default:
//                System.out.println("Escolha um operador valido (+, -, *, /)");
//                break;
//        }
        // versão melhorada de um switch
        double res = 0;
//        String error_invalidOperator = "Operador inválido! Operadores disponíveis (+, -, *, /)";
        switch (op) {
            case "+" -> res = n1 + n2;
            case "-" -> res = n1 - n2;
            case "*" -> res = n1 * n2;
            case "/" -> res = n1 / n2;
            default -> res = 0;
        }
        return res;
    }
}
