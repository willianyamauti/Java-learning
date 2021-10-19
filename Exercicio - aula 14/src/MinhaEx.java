public class MinhaEx extends Exception
{
    //construtor
    /**
     * MinhaEx Construtor
     *
     */
    public MinhaEx() {
        super("Bug da Minha Ex");
    }
    
    //metodo que retorna algum texto de bug
    /**
     * Método getBug
     *
     * @return O valor de retorno
     */
    public String getBug() {
        return this.getMessage();
    }
}
