package calculadorajunit;

/**
 * Calculadora para comprobar con JUnit
 * @author Daniel
 * @version 2.0
 */
public class CalculadoraJUnit {

    /**
     * Esto sumara los dos numeros
     * @param a el primer numero
     * @param b el segundo numero
     * @return el resultado de a+b
     * @since 1.0
     */
    public int suma(int a, int b){
        return a+b;
    }
    
    /**
     * Esto restara los dos numeros
     * @param a el primer numero
     * @param b el segundo numero
     * @return el resultado de a-b
     * @since 1.0
     */
    public int resta(int a, int b){
        return a-b;
    }

    /**
     * Esto dividira los dos numeros
     * @param a el primer numero
     * @param b el segundo numero
     * @return el resultado de a/b
     * @since 2.0
     *
     * @throws Exception en caso de que el segundo numero sea cero
     */    
    public int diiv(int a, int b) throws Exception{
        if(b==0){
            throw new Exception("El segundo numero, b, es cero");
        }else{
            return a/b;
        }
    }
}