/**
 * Write  Tela description here.
 *
 * @author Satoshi
 * @version (1.0)
 */

import javax.swing.*;

public class Tela {
    /**
     *
     * @param txt
     * @return int
     */
    // static nesse caso possibilita usar o metodo sem atribuir esse objeto a uma variavel
    public static int retornaInt(String txt){
        // usa o metodo java para imprimir uma tela para input do num
        // o metodo sempre vai retornar uma string
        String snum = JOptionPane.showInputDialog(txt);
        //converte a string para int
        // podia ser feito como: int num = Integer.parseInt(snum);
        return Integer.parseInt(snum);

    }

    /**
     *
     * @param txt
     */
    public static void mostraTxt(String txt){
        // imprime o txt em uma tela
        JOptionPane.showMessageDialog(null, txt);
    }

}
