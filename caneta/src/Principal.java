public class Principal
{
    public static void main(String[] args)
    {
        //criacao de um objeto real para uso
        Caneta bic = new Caneta();

        //e aqui o uso efetivo atarvwes do metodo
        bic.ajustaCor("Azul");
        bic.ajustaTamanho(12);
        bic.escrever("teste");
    }
}
