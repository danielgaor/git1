package git1java1;

import java.util.Scanner;

public class Git1java1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        System.out.print("Mi nombre es ");
        nombre = teclado.next();
        System.out.println("Te llamas: "+nombre);
    }
}