
package modelo;

/**
 *  Atributos, Constructores, Getters y Setters.
 * 
 * @author Marcos
 */
public class Calculadoraedad {
    private int anio1;
    private int anio2;
    
    /**
    * Constructor por defecto
    */
    public Calculadoraedad(){
        anio1 = 2005;
        anio2 = 2025;
    }
    
    /**
     * Constructor
     * 
     * @param anio1 anio de nacimiento
     * @param anio2 anio actual
     */
    public Calculadoraedad(int anio1, int anio2) {
        this.anio1 = anio1;
        this.anio2 = anio2;
    }
    
    /**
    * Getter del anio de nacimiento
    * 
    *@return anio1
    */
    public int getAnio1() {
        return anio1;
    }
    /**
    * Setter del anio de nacimiento
    * 
    *@param anio1 anio de nacimiento
    */
    public void setAnio1(int anio1) {
        this.anio1 = anio1;
    }
    /**
    * Getter del anio actual
    * 
    *@return anio2
    */
    public int getAnio2() {
        return anio2;
    }
    /**
    * Setter del anio de nacimiento
    * 
    *@param anio2 anio actual
    */
    public void setAnio2(int anio2) {
        this.anio2 = anio2;
    }
    
}


