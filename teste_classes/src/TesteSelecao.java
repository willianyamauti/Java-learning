/**
 * Write  TesteSelecao description here.
 *
 * @author Satoshi
 * @version (1.0)
 */

import javax.swing.*;

public class TesteSelecao
{
    public static void main(String[] args) {
        // faca um coigo que receba a idade
        // de um atleta e infrome a categoria
        // 05 a 12 infantil
        // 13 a 20 juvenil
        // 21 a 45 adulto
        // 46 a 70 master
        String sida;
        sida = JOptionPane.showInputDialog("Informe a idade");
        int ida = Integer.parseInt(sida);

        String msg = "";
        if (ida < 5 || ida > 70){
            msg = "idade não permitida";
        }
        else if ( ida >= 5 && ida <= 12){
            msg = "Categoria Infantil";
        }
        else if (ida >= 13 && ida <= 20){
            msg = "Categoria Juvenil";
        }
        else if (ida >= 21 && ida <= 45){
            msg = "Categoria Adulto";
        }
        else {
            msg = "Categoria Master";
        }

        JOptionPane.showMessageDialog(null, msg);
    }
}
