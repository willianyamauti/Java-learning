/**
 * Classe auxiliar para exibição de janelas de dialogos
 *
 * @author Satoshi
 * @version (1.0)
 */

import javax.swing.*;

public class Tela {
    /**
     * Metodo que retorna um valor int de um input feito atraves de uma janela
     * @param txt mensagem para exibição na janela de input
     * @return input da janela como int
     */
    public static int retornaInt(String txt){
        // usa o metodo java para imprimir uma tela para input do num
        // o metodo sempre vai retornar uma string
        String snum = JOptionPane.showInputDialog(txt);
        return Integer.parseInt(snum);
    }

    /**
     *Metodo que retorna um valor double de um input feito atraves de uma janela
     * @param txt mensagem para exibição na janela de input
     * @return input da janela como double
     */
    public static double retornaDbl(String txt){
        String snum = JOptionPane.showInputDialog(txt);
        return Double.parseDouble(snum);

    }

    /**
     *Metodo que retorna um valor String de um input feito atraves de uma janela
     * @param txt mensagem para exibição na janela de input
     * @return input da janela como String
     */
    public static String retornaTxt(String txt){
        String sop = JOptionPane.showInputDialog(txt);
        return sop;
    }


    /**
     *Metodo que imprime em uma janela o parametro passado como argumento
     * @param txt mensagem para ser impressa na janela
     */
    public static void mostraTxt(String txt){
        // imprime o txt em uma tela
        JOptionPane.showMessageDialog(null, txt);
    }

}
