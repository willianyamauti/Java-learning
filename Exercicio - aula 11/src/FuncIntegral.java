/**
 * Write  FuncIntegral description here.
 *
 * @author Satoshi
 * @version (1.0)
 */
public class FuncIntegral extends Funcionario
{

    private double base;
    /**
     * Construtor para classe FuncHorista
     */
    public FuncIntegral(String nome, String email, double base){
        super(nome, email);
        this.base = base;
    }

    public double calcularSalario(){
        return this.base - (this.base * TAX);
    }

}
