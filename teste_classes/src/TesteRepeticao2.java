/**
 * Write  TesteRepeticao2 description here.
 *
 * @author Satoshi
 * @version (1.0)
 */

import javax.swing.*;

public class TesteRepeticao2
{
    // codigo que recebe dados de um numero de pessoas (idade, nome)
    // e ao final mostra os dados da pessoa com menor idade
    public static void main(String[] args) {
        // declaração das variaveis com uso dentro do while
        String nome;
        String sida;
        int ida;

        //inicialização das variaveis de controle
        String resp = "sim";
        String nomenew = "";
        int idanew = 200;
        int idatotal = 0; // somador
        int npes = 0;

        while (resp.equalsIgnoreCase("sim")){
            nome = JOptionPane.showInputDialog("Nome: ");
            sida = JOptionPane.showInputDialog("Idade: ");
            ida = Integer.parseInt(sida);

            if (ida <idanew){
                idanew = ida; // idanew é a idade do mais novo
                nomenew = nome; // nomenew é o nome do mais novo
            }
            idatotal += ida;  // somador das idades
            npes ++; // contador de pessoas

            resp = JOptionPane.showInputDialog("Tem mais alguém?");

        }

        double media = idatotal / npes;
        JOptionPane.showMessageDialog(null, "Mais novo: " + nomenew);
        JOptionPane.showMessageDialog(null, "Menor idade: " + idanew);
        JOptionPane.showMessageDialog(null, "Media: " + media);


    }
}
