package Problemas_03_Bucles;

import java.util.Scanner;

/*
    Diseña un algoritmo que pida dos 
    números por teclado (m y n) y calcule 
    el número combinatorio de ambos.
    El número combinatorio se calcula usando 
    la expresión: m! / (n!*(m-n)!)
    Importante: No hay dar por supuesto que m 
    es mayor que n . Hay que averiguar cuál es 
    el mayor y cuál es el menor.
 */

public class Ejercicio40 {
    public static void main(String[] args) {
        // Creo e inicializo variables
        Scanner entrada = new Scanner(System.in);
        int m = 0, n = 0, factorialM = 1, 
        numComb = 0, factorialN = 1, restaMN = 0,
        factorialMN = 1;

        // Pido datos al usuario
        System.out.println("Introduce un numero");
        m = entrada.nextInt();
        System.out.println("Introduce otro numero");
        n = entrada.nextInt();

        restaMN = m-n;
        
        // Un bucle para sacar cada factorial
        for (int i = 1; i <= m; i++) {
            factorialM *= i;
        }
        System.out.println("m: "+factorialM);
        for (int i = 1; i <= n; i++) {
            factorialN *= i;
        }
        System.out.println("n: "+factorialN);
        for (int i = 1; i <= restaMN; i++) {
            factorialM *= i;
        }
        // Muestro por pantalla los resultados
        System.out.println("mn: "+factorialMN);
        numComb = factorialM / (factorialN * factorialMN);
        System.out.println("El numero combinatorio de "
        +m+ " y " +n+ " es: "+numComb);
    }
}