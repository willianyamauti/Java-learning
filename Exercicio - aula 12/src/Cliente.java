/**
 * Write  Clientes description here.
 *
 * @author Satoshi
 * @version (1.0)
 */

public abstract class Cliente
{
    private String nome;
    private String email;
    private int idade;

    /**
     *  Construtor com a inicialização basica - polimorfismo
     */
    public Cliente(){
        this.nome = "";
        this.email = "";
        this.idade = 0;
    }

    /**
     * Construtor
     * @params (String, String, int)
     */
    public Cliente(String nome, String email, int idade){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    // metodos get e set
    public String retornaNome(){
        return this.nome;
    }

    public void  ajustarNome(String nome){
        this.nome = nome;
    }

    public String retornaEmail(){
        return this.email;
    }

    public void ajustarEmail(String email){
        this.email = email;
    }

    public int retornaIdade(){
        return this.idade;
    }

    public void ajustarIdade(int idade){
        this.idade = idade;
    }

}
