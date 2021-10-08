/**
 * Classe para representar o objeto caneta e suas funcionalidades
 * @author satoshi
 * @version (1.0)
 */


public class Caneta
{
    // caracteristicas da caneta
    //representadas por variaveis
    String cor;
    int tamanho;

    //funcionalidades da caneta
    //representadas por metodos

    //ajusta a cor da caneta
    public void ajustaCor(String cor) {
        //this faz referencia aos atributos da classe
        this.cor = cor;
    }

    //ajusta o tamanho da ponta da caneta
    public void ajustaTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    //escreve um texto
    public void escrever( String txt)
    {
        System.out.println("Cor: " + this.cor);
        System.out.println("tamanho: " + this.tamanho);
        System.out.println("Texto informado: " + txt);
    }
}
