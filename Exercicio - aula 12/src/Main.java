/**
 * Aplicação para adicionar, consultar e aumentar limite de clientes
 *
 * @author Satoshi
 * @version (1.0)
 */

public class Main
{
    public static void main(String[] args)
    {
        String resposta = "s";
        int opt = 0;
        while(resposta.equalsIgnoreCase("s"))
        {
            opt = EntradaSaida.receberInt("1: cadastrar, 2:pesquisar, 3:limite");
            switch(opt)
            {
                case (1) -> Sistema.cadastarCliente();
                case (2) -> Sistema.pesquisarCliente();
                case (3) -> Sistema.aumentarLimite();
                default -> EntradaSaida.mostrarTexto("Opção Invalida");
            }
            resposta = EntradaSaida.receberString("Continuar s/n");
        }
    }
}
