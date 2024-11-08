package Problemas_04_Arrays;
import java.util.Scanner;

public class EjercicioClase4 {
/*
    Pide un numero positivo mayor a 3 (tam)
    Crea un array de tamaño tam y rellenalo 
    de valores aleatorios entre 5 y 50
    Pide otro numero positivo entre 1 y tam (cola)
    Crea un nuevo array con los colas ultimos valores
    del primero
*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tam = 0, cola = 0;
        do {            
            System.out.println("Introduce un numero mayor que 3");
            tam = entrada.nextInt();
        } while (tam < 3);

        int array[] = new int[tam];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100 + 1);
        }
        do {            
            System.out.println("Introduce otro numero entre 1 y el anterior");
            cola = entrada.nextInt();
        } while (cola < 1 || cola > tam);

        int arrayFinal[] = new int[tam];
        for (int i = arrayFinal.length - cola; i < arrayFinal.length; i++) {
            System.out.println(array[i]);
        }
    }
}