package Problemas_03_Bucles;

import java.util.Scanner;
/*
    Escribe un algoritmo que lea por teclado 
    un número N entero positivo y dibuje un
    cuadrado de asteriscos de lado N. 
    Pej: Si el número es 4, se obtiene:

    * * * *
    * * * *
    * * * *
    * * * *
 */

public class Ejercicio42 {
    public static void main(String[] args) {
        // Creo e inicializo variables
        Scanner entrada = new Scanner(System.in);
        // Pido un numero al usuario
        System.out.println("Tamaño de cuadrado a crear");
        int num = entrada.nextInt();

        // Imprimo columnas
        for (int i = 1; i < num; i++) {
            // Imprimo filas
            for (int j = 1; j < num; j++) {
                System.out.print("* ");
            }
            System.out.println("* ");
        }
        System.out.println("");
    }
}