/**
 * Classe auxiliar para exibição de janelas de dialogos
 *
 * @author Satoshi
 * @version (1.0)
 */

import javax.swing.*;

public class EntradaSaida {
    /**
     * Metodo que retorna um valor int de um input feito atraves de uma janela
     * @param txt mensagem para exibição na janela de input
     * @return input da janela como int
     */
    public static int receberInt(String txt){
        // usa o metodo java para imprimir uma tela para input do num
        // o metodo sempre vai retornar uma string
        String snum = JOptionPane.showInputDialog(txt);
        try{
            return Integer.parseInt(snum);
        }
        // recebera o erro caso o numero digitado for decimal
        catch( Exception e){
            JOptionPane.showMessageDialog(null,"Digite apenas numeros inteiros");
            return 0;
        }
    }

    /**
     *Metodo que retorna um valor double de um input feito atraves de uma janela
     * @param txt mensagem para exibição na janela de input
     * @return input da janela como double
     */
    public static double receberDouble(String txt){
        String snum = JOptionPane.showInputDialog(txt);
        try {
            return Double.parseDouble(snum);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Digite apenas numeros");
            return 0;
        }

    }

    /**
     *Metodo que retorna um valor String de um input feito atraves de uma janela
     * @param txt mensagem para exibição na janela de input
     * @return input da janela como String
     */
    public static String receberString(String txt){
        String sop = JOptionPane.showInputDialog(txt);
        return sop;
    }


    /**
     *Metodo que imprime em uma janela o parametro passado como argumento
     * @param txt mensagem para ser impressa na janela
     */
    public static void mostrarTexto(String txt){
        // imprime o txt em uma tela
        JOptionPane.showMessageDialog(null, txt);
    }

}
