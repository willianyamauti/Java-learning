/**
 * Classe com as funções para
 * pesquisar e cadastrar clientes
 *
 * @author Satoshi
 * @version (1.0)
 */

import java.util.*;

public class Sistema
{
    // variavel que armazenara os "clintes"
    // é um Arraylist SOMENTE de obj "Cliente"
    private static ArrayList<Cliente> dados = new ArrayList<Cliente>();

    // metodo para obter os dados do usuario
    // criar objeto e adicionar ao "list"
    public static void cadastarCliente(){
        String nome, email, tipo;
        int idade;
        nome = EntradaSaida.receberString("Nome: ");
        email = EntradaSaida.receberString("Email: ");
        idade = EntradaSaida.receberInt("Idade: ");
        tipo = EntradaSaida.receberString("(C)omum ou (V)ip: ");
        Cliente cliente;
        //checa o tipo do cliente para criar o objeto da classe correta
        if (tipo.equalsIgnoreCase("V")){
            cliente = new ClienteVip(nome,email,idade);
        }
        else{
            cliente = new ClienteComum(nome,email,idade);
        }
        dados.add(cliente);
    }

    // metodoque obtem o nome a pesquisar
    // procura no list e retorna os dados
    public static void pesquisarCliente(){
        String pesquisa = EntradaSaida.receberString("Nome a pesquisar: ");
        Cliente cliente = retornarCliente(pesquisa);
        String saida = "";
        if (cliente!=null){
            saida += cliente.retornaNome() + "\n";
            saida += "Email: " + cliente.retornaEmail() + "\n";
            saida += "Idade: " + cliente.retornaIdade();
        }
        else{
            saida = "Nenhum resultado encontrado.";
        }
        EntradaSaida.mostrarTexto(saida);
    }

    // metodo que recebe uma string de pesquisa(nome)
    // e retorna o objeto cliente vinculado com esse nome
    private static Cliente retornarCliente(String pesquisa){
        Cliente cliente = null;
        // Itera sobre o Arraylist e faz a comparação de nomes para
        // cada objeto na lista
        for (int i=0; i<dados.size(); i++){
            cliente = dados.get(i);
            String nome = cliente.retornaNome();
            if (nome.equalsIgnoreCase(pesquisa)){
                return cliente;
            }
        }
        // caso nao tiver o cliente na lista
        return null;
    }

    // aumenta o limite da conta
    // se o cliente for vip
    public static void aumentarLimite(){
        String pesquisa = EntradaSaida.receberString("Cliente: ");
        Cliente cliente = retornarCliente(pesquisa);
        if (cliente != null && cliente instanceof ClienteVip){
            // forçar o tipo (typecasting)
            ClienteVip c_vip = (ClienteVip)cliente;
            c_vip.ajustarLimite();
            double limite = c_vip.retornarLimite();
            EntradaSaida.mostrarTexto("Novo Limite: " + limite);
        }
        else{
            EntradaSaida.mostrarTexto("O cliente é da categoria comum...");
        }
    }
}
