/**
 * Enter class TesteJanela description here
 *
 * @author Satoshi
 * @version (1.0)
 */

import javax.swing.*;

public class TesteJanela
{
    public static void main(String[] args) {
        String sida;
        // SEMPRE vira um texto (string)
        sida = JOptionPane.showInputDialog("Digite sua idade");

        //mas eu posso usar uma classe para converter
        // nesse caso, converte uma String em formato de numero
        // exemplo: "123" para 123
        int ida = Integer.parseInt(sida);

        String msg = "";
        if (ida >= 18){
            msg = "Ok tudo estabelecido!";
        } else {
            msg = "Não teve sorte!";
        }
        // mostra uma msg na janela de dialogo
        JOptionPane.showMessageDialog(null, msg);
    }
}
