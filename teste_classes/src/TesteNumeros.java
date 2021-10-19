/**
 * Enter class TesteNumeros description here
 *
 * @author Satoshi
 * @version (1.0)
 */
public class TesteNumeros
{
        public static void main(String[] args) {
            // no java temos as classes que representam  os tipos
            // para fazermos conversões
            String snro = "1234";
            int inro = Integer.parseInt(snro);
            float frno = Float.parseFloat(snro);
            double drno = Double.parseDouble(snro);

            // da para se fazer ao contrario tbm
            int ival = 1234;
            String sval = Integer.toString(ival);

            // temos a classe math para outras operações aritmeticas
            System.out.println( Math.pow(2,3) );    // potencia
            System.out.println( Math.sqrt(25) );    // raiz quadrada
            System.out.println( Math.sin(90) );     // seno
            System.out.println( Math.E );   // constante de euler
            System.out.println( Math.PI );  // constante Pi
        }
}
