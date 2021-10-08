/**
 * Classe principal de inico do sistema
 *
 * @author satoshi
 * @version (1.0)
 */

public class Principal {
    public static void main(String[] args) {

        //criação do objeto
        Monitor m1 = new Monitor();

        //uso dos metodos disponiveis
        m1.ligar();
        m1.exibirMsg("Monitor Ligado");

        m1.exibirMsg("Resolução atual:" + m1.reso);
        m1.ajustarReso(12454616);
        m1.exibirMsg("Ajustada resolução");

        m1.desligar();

    }
}
