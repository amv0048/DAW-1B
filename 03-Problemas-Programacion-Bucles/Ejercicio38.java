package Problemas_03_Bucles;
import java.util.Scanner;

public class Ejercicio38 {
/*
    Queremos realizar un algoritmo que vaya pidiendo 
    una sucesión de notas por teclado hasta que se 
    introduzca el valor -1. Tras eso se mostrará la media 
    aritmética de las notas introducidas. 
    Importante: Hay que controlar que los valores de las 
    notas introducidas sea el correcto (entre 0 y 10).
    
    b) Realiza una variante del ejercicio anterior donde 
    el primer valor que se solicita indica el número total 
    de calificaciones que se deben introducir.
*/
    public static void main(String[] args) {
        // Creo e inicializo variables
        Scanner entrada = new Scanner(System.in);
        int numTotalNotas = 0, counter = 0;
        double nota = 0, suma = 0, media = 0;
        
        // Pido un numero total de notas a introducir
        System.out.println("Introduce el numero total de calificaciones");
        numTotalNotas = entrada.nextInt();
        
        // Ejercicio con while
        while (counter < numTotalNotas) {
            System.out.print("Introduce una nota (entre 0 y 10): ");
            nota = entrada.nextDouble();
            if (nota >= 0 && nota <= 10) {
                suma += nota;
                counter++;
            }
            else System.out.println("ERROR. Nota fuera de rango");
        }
        
        // Ejercicio con for
        for (int i = 0; i < numTotalNotas; i++) {
            System.out.print("Introduce una nota (entre 0 y 10): ");
            nota = entrada.nextDouble();
            if (nota >= 0 && nota <= 10) {
                suma += nota;
                counter++;
            }
            else System.out.println("ERROR. Nota fuera de rango");
        }
        if (nota > 0) {
            media = suma / numTotalNotas;
            System.out.println("La media aritmetica es de: "+media);
        }
    }
}