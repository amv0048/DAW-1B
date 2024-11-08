package Problemas_04_Arrays;
import java.util.Scanner;

public class EjercicioClaseArray2 {
/*
    Pido 2 numeros al usuario 'ini' y 'fini'
    Ambos deben ser positivos, mayores a 1 y
    el 2º debe ser mayor que el 1º
    (Si no es asi, vuelve a pedir)
    Rellena un array con todos los numeros
    entre 'ini' y 'fini'
*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ini = 0, fini = 0; 
        do {
            System.out.println("Introduce un numero positivo, mayor que 1");
            ini = entrada.nextInt();
            if (ini < 2) System.out.println("Error");
            System.out.println("Introduce otro numero positivo, mayor que 1");
            fini = entrada.nextInt();
            if (fini < 2) System.out.println("Error");
        } while (ini < 2 || fini < 2 || ini >= fini);
        
        int size = (fini - ini) + 1;
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = ini + i;
            System.out.print("["+array[i]+"]");
        }
    }
}