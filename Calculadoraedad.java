
package calculadoraedad;

import java.util.Scanner;

public class Calculadoraedad {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dime en que año naciste: ");
        int num1 = teclado.nextInt();
        System.out.print("Dime en que año estas: ");
        int num2 = teclado.nextInt();
        
        int operacion = num2 - num1;
        
        System.out.println("Tienes: "+operacion+" años");
    }
    
}
