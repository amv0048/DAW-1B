package Problemas_03_Bucles;
import java.util.Scanner;

public class Ejercicio36 {
/*
    Desarrolla un algoritmo que pida 5 elementos por teclado 
    y continuación muestre la suma de todos los elementos, 
    la suma de aquellos números mayores a 36 y la suma de 
    aquellos números menores a 10. Nota: no puedes usar 
    5 variables.
*/
    public static void main(String[] args) {
        // Creo e inicializo variables
        Scanner entrada = new Scanner(System.in);
        int num = 0, sumaMayoresDe36 = 0, sumaMenoresDe10 = 0;
        
        // Bucle que pide 1 numero 5 veces
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce 5 numeros");
            num = entrada.nextInt();
            
            if (num > 36) sumaMayoresDe36 += num;
            else if (num < 10) sumaMenoresDe10 += num;
        }
        System.out.println("Suma mayores de 36: "+sumaMayoresDe36);
        System.out.println("Suma menores de 10: "+sumaMenoresDe10);
        
    }
}
