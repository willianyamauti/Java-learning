/**
 *  Exercício para treinar os recursos vistos ate agora
 *  - Classificação, organização dos atributos e metodos
 *  - E também alguns recursos da linguagem (Sting, Arrays, etc)
 *
 * @author Satoshi
 * @version (1.0)
 */

public class Main
{
    public static void main(String[] args) {
        // obter os dados que o usuario informa
        int ini = Tela.retornaInt("Informe um numero inteiro");
        int fim = Tela.retornaInt("Informe outro numero inteiro");

        //cria objeto para processamento
        Pares p = new Pares();
        String res = p.retornaNros(ini, fim);

        // saida com o resultado
        Tela.mostraTxt(res);

    }
}
