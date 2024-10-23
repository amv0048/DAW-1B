package Problemas_03_Bucles;

import java.util.Scanner;

public class Ejercicio43 {
    public static void main(String[] args) {
    /*
    Escribe un algoritmo que lea por teclado un número N 
    entero positivo y dibuje un triangulo de asteriscos 
    con base y altura N. Pej, Si el número es 5 se obtiene:
                 *
                * *
               * * *
              * * * *
             * * * * *
    */
        // Creo e inicializo variables
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();

        // Imprimo columnas
        for (int i = 0; i < num; i++) {
            // Imprimo filas
            for (int j = 0; j < num; j++) {
                // Solo imprimo un * si la posicion es 
                // mayor que 0 y menor que el final
                if (j <= num - 1 + i && j >= num - 1 - i)
                    System.out.print("* ");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
