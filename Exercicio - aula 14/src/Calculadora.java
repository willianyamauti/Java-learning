/**
 * Classe que executa um calculo aritmetico
 * conforme os parametros enviados
 * 
 * @author (odi) 
 * @version (1.0)
 */
public class Calculadora
{
    /**
     * Método executar
     *
     * @param n1 Um parâmetro
     * @param n2 Um parâmetro
     * @param op Um parâmetro
     * @return O valor de retorno
     */
    // throws indica que pode gerar uma exceção
    public static double executar(double n1, double n2, String op) throws MinhaEx {
        double result = 0;
        
        if (n2 == 7)
            //gera uma exceção
            throw new MinhaEx();
        
        if ( op.equals("+") ) 
            result = n1 + n2;
        if ( op.equals("-") )
            result = n1 - n2;
        if ( op.equals("*") )
            result = n1 * n2;
        if ( op.equals("/") )
            result = n1 / n2;
        
        return result;
    }
}
