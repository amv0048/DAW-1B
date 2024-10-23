package Problemas_03_Bucles;
import java.util.Scanner;

public class Ejercicio44 {
/*
    44. Igual que en el ejercicio 
    anterior pero además, ahora el usuario 
    introduce el carácter a dibujar:
        Tamaño? 5
        Caracter? e
            e
           e e
          e e e
         e e e e
        e e e e e
*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Pido al usuario el tamaño
        System.out.print("Size? ");
        int num = entrada.nextInt();
        // Pido al usuario que caracter imprimir
        System.out.println("Caracter: ");
        char letra = entrada.next().charAt(0);
        // Imprimo columnas
        for (int i = 0; i < num; i++) {
            // Imprimo filas
            for (int j = 0; j < num; j++) {
                if (j <= num - 1 + i && j >= num - 1 - i)
                    System.out.print(letra+" ");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
