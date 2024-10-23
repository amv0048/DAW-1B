package Problemas_03_Bucles;

import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) {
        
    /*
        Realiza un programa que pida al usuario un número 
        entero mayor N mayor a 10. A continuación, haz que
        muestre la lista de números del 1 al N sustituyendo los
        múltiplos de 3 por la palabra FIZZ y los múltiplos de 5 
        por la palabra BUZZ. Además,también deben sustituirse 
        los múltiplos de 3 y 5 por la palabra FIZZBUZZ.
        a) Muestra la lista de números en vertical.
        b) Muestra la lista de números en horizontal separados por espacio.
        c) Muestra la lista de números en horizontal separado por coma (,).
        Obviamente, el último valor no debe llevar coma detrás.

    */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = entrada.nextInt();

        System.out.println();
        System.out.println();
        
        // a)
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) System.out.println("FIZZ");
            else if (i % 5 == 0) System.out.println("BUZZ");
            else if (i % 3 == 0 && num % 5 == 0) 
                System.out.println("FIZZBUZZ");
            else System.out.println(i);
        }
        System.out.println();
        System.out.println();

        // b)
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) System.out.print("FIZZ ");
            else if (i % 5 == 0) System.out.print("BUZZ ");
            else if (i % 3 == 0 && num % 5 == 0) 
                System.out.print("FIZZBUZZ ");
            else System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println();

        // c)
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) System.out.print("FIZZ");
            else if (i % 5 == 0) System.out.print("BUZZ");
            else if (i % 3 == 0 && num % 5 == 0) 
                System.out.print("FIZZBUZZ");
            else System.out.print(i);
            
            if (i < num) System.out.print(", ");
        }
        System.out.println();
    }
}
