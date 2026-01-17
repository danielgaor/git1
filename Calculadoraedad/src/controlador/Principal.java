
package controlador;

import Vista.Consola;
import modelo.Calculadoraedad;

/**
 * Clase usada para calcular los años que una persona tiene.
 * 
 * @author Marcos
 * @version 1.0
 * @see modelo.Calculadoraedad
 * @see Vista.Consola
 */
public class Principal {
    /**
     * Main que pide dos años  y calcula la edad que tienes.
     *
     * @param args 
     */
     public static void main(String[] args) {
         Consola c = new Consola();
         
         Calculadoraedad a = c.pideanio();
         c.muestraanio(a);
         
    }
    
}
