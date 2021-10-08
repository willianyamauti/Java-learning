/**
 * Classe representa os atributos e metodos de um monitor
 * @author satoshi
 * @version (1.0)
 */

public class Monitor
{
    //atributos do monitor
    int reso;
    String tipo;

    //metodo construtor - para inicializar os dados do objeto
    public Monitor()
    {
        this.reso = 1024;
        this.tipo = "LED";
    }

    //metodo que liga o monitor
    public void ligar()
    {
        System.out.println("Ligando monitor...");;
    }

    //metodo que exibe mensagem no monitor
    public void exibirMsg(String msg)
    {
        System.out.println(msg);
    }

    //desligar
    public void desligar()
    {
        System.out.println("Desligando monitor");
    }

    // metodos auxiliares para ajustar atributos
    public void ajustarReso(int reso)
    {
        if (reso != 1024 || reso != 1280 || reso != 1600 ){
            this.reso = 1024;
        }
        else{
            this.reso = reso;
        }
    }
}
