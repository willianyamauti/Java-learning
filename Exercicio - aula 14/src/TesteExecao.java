/**
 * Exemplo de funcionamento de uma exeçao
 *
 * @author Satoshi
 * @version (1.0)
 */

public class TesteExecao
{
    public static void main(String[] args) {
        try {
            System.out.println("valor do parametro que foi enviado" + args[0]);
        }
        catch(ArrayIndexOutOfBoundsException bug){
            System.out.println("Acesso a posição do array não existe");
        }
        catch(Exception bug){
            System.out.println("Bug geral: " + bug.getMessage());
        }
        finally{
            System.out.println("Executa depois de tudo");
        }
    }

}
