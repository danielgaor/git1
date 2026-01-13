package paragit;

import java.util.Scanner;

public class ParaGit {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        
        System.out.println("Dime tu nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Tu nombre es "+nombre);
    } 
}