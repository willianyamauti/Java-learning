/**
 * Write  Funcionario description here.
 *
 * @author Satoshi
 * @version (1.0)
 */

public abstract class Funcionario {
    // constante (final) que pode ser acessada
    // dentro da estrutura hierarquica (protect)
    protected final double TAX = 0.1;

    //outros atributoss com acesso local
    String nome;
    String email;

    /**
     * Construtor para objetos Funcionarios
     */
    public Funcionario(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    // metodo que ajusta o nome
    public void setNome(String nome){
        this.nome = nome;
    }

    // metodo que retorna o nome
    public String getNome(){
        return this.nome;
    }

    //cria um modelo para as subclasses que forem herdas a classe Funcionario sejam
    // obrigatoriamente implementado
    public abstract double calcularSalario();
}
