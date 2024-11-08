package Problemas_04_Arrays;
import java.util.Scanner;

public class EjercicioClase2 {
/*
    Encontrar un numero en un array con while
    y que cuando encuentre el numero salga del bucle
*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0, n = 7;
        boolean encontrado = false;
        int array[] = {1,4,2,12,9,10,7};
        
        while (contador < array.length && !encontrado) {
            if (array[contador] == n) encontrado = true;
            else contador++;
        }
        if (encontrado) System.out.println("El numero esta en"
                + " el array en la posicion: " +contador);
        else System.out.println("El numero no esta en el array");
    }
}