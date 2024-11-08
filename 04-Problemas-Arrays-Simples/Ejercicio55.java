package Problemas_04_Arrays;
import java.util.Scanner;

public class Ejercicio55 {
/*
    Haz un programa que dado un array valores que 
    posea una serie de números pej
    2,4,6,8,1,3,5,7, y un numero que se pida por 
    teclado, indique si ese número está
    en el array o no lo está.
*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        boolean encontrado = false;
        int array[] = {1,4,12,9,10,7};

        // Pido al usuario un numero
        System.out.println("Indique un numero");
        int n = entrada.nextInt();
        // Si el numero coincide con alguno del array el bucle para
        while (contador < array.length && !encontrado) {
            if (array[contador] == n) encontrado = true;
            else contador++;
        }
        if (encontrado) System.out.println("El numero esta en el array en la posicion: " +contador);
        else System.out.println("El numero no esta en el array");

        entrada.close();
    }
}