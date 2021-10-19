/**
 * Write  TesteRepeticao1 description here.
 *
 * @author Satoshi
 * @version (1.0)
 */

import javax.swing.*;

public class TesteRepeticao1
{
    // codigo para receber dois valores inteiros (inicial e final)
    // e mostra os numeros pares, a qtd de pares e a soma deles

    public static void main(String[] args) {
        String sini = JOptionPane.showInputDialog("Inicial");
        String sfim = JOptionPane.showInputDialog("Final");
        int ini = Integer.parseInt(sini);
        int fim = Integer.parseInt(sfim);

        int qtde = 0;
        int soma = 0;
        StringBuilder result = new StringBuilder();
        for (int n=ini; n<=fim; n++){
            if (n % 2 == 0){
                /**
                 * The reason to prefer StringBuilder is that both + and concat create a new object every time you call
                 * them (provided the right hand side argument is not empty). This can quickly add up to a lot of
                 * objects, almost all of which are completely unnecessary.
                 * As others have pointed out, when you use + multiple times within the same statement, the compiler can
                 * often optimize this for you. However, in my experience this argument doesn't apply when the
                 * concatenations happen in separate statements. It certainly doesn't help with loops.
                 */
                // result += n + " - ";
                result.append(n).append(" - ");
                soma += n;
                qtde++;
            }
        }
        JOptionPane.showMessageDialog(null, result);
        JOptionPane.showMessageDialog(null,"Qtde: " + qtde);
        JOptionPane.showMessageDialog(null, "Soma: " + soma);
    }
}
