
package Vista;

import java.util.Scanner;
import modelo.Calculadoraedad;

/**
 * Clase con dos funciones, una para pedir los anios y otra que muestra edad.
 * 
 * @author Marcos
 * @see modelo.Calculadoraedad
 */
public class Consola {
    
    /**
    * Pide el anio de nacimiento y el anio actual.
    * 
    * @return actualedad
    */
            
    public Calculadoraedad pideanio(){
        Scanner teclado = new Scanner(System.in);
        Calculadoraedad actualedad = new Calculadoraedad();
        System.out.print("Dime el anio de nacimiento: ");
        actualedad.setAnio1(teclado.nextInt());
        System.out.print("Dime el anio actual: ");
        actualedad.setAnio2(teclado.nextInt());
        
        return actualedad;      
    }
    /**
    * Muestra la edad actual.
    * 
    * @param actualedad anio 1 y anio 2 para calcular la edad.
    */
    public void muestraanio(Calculadoraedad actualedad){
        
        System.out.println("Tu edad es: "+ (actualedad.getAnio2() - actualedad.getAnio1()));
        
    }
}
