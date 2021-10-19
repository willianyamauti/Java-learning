/**
 * Write  Main description here.
 *
 * @author Satoshi
 * @version (1.0)
 */

public class Main {
    public static void main(String[] args) {
        Funcionario func = null;

        String nome = Tela.retornaTxt("Nome");
        String email = Tela.retornaTxt("Email");

        String tipo = Tela.retornaTxt("H - Horista | I - Integral ");
        boolean fim_laco = false;
        while (!fim_laco)   // while (fim_laco != true)
        {
            switch (tipo.toLowerCase()) {
                case ("h") -> {
                    int qtd = Tela.retornaInt("Qtd de horas");
                    double valor = Tela.retornaDbl("Valor hora");
                    func = new FuncHorista(nome, email, qtd, valor);
                    fim_laco = true;
                }
                case ("I") -> {
                    double salario = Tela.retornaDbl("Salario base");
                    func = new FuncIntegral(nome, email, salario);
                    fim_laco = true;
                }
                default -> {
                    Tela.mostraTxt("Opção invalida escolha entre H ou I!");
                    tipo = Tela.retornaTxt("H - Horista | I - Integral ");
                }
            }
        }
        double salario = func.calcularSalario();
        nome = func.getNome();
        Tela.mostraTxt(nome + " seu salario será: " + salario);
    }
}
