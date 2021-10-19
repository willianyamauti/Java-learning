/**
 * Write  ClienteVip description here.
 *
 * @author Satoshi
 * @version (1.0)
 */

public class ClienteVip extends Cliente{
    // variavel que contem o limite do cheque especial
    double limite = 3000;

    public ClienteVip(String nome, String email, int idade){
        super(nome, email, idade);
    }

    public void ajustarLimite(){
        this.limite += 1000;
    }

    public double retornarLimite(){
        return this.limite;
    }
}
