/**
 * Write  Funchorista description here.
 *
 * @author Satoshi
 * @version (1.0)
 */

public class FuncHorista extends Funcionario
{
    private int qtd;
    private double valor;
    /**
     * Construtor para classe FuncHorista
     */

    public FuncHorista(String nome, String email, int qtd, double valor){
        //chamando o construtor da classe pai
        super(nome, email);
        this.qtd = qtd;
        this.valor = valor;


    }

    //metodo que para realizar o calculo de salario
    public double calcularSalario(){
        double base = (this.qtd * this.valor)   ;
        return base - (base * this.TAX);
    }


}
