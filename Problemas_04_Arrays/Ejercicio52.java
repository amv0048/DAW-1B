package Problemas_04_Arrays;
import java.util.Scanner;

public class Ejercicio52 {
/*
    Crea un array de tamaño 10 que sirva para almacenar 
    colores y pide al usuario que rellene cada posición
    del array con un color. A continuación indica cuantas 
    veces aparece el color “rojo” y el color “azul” usando
    la siguiente salida:
    El color 'rojo' aparece X veces en el array.
    El color 'azul' aparece Y veces en el array.
    Siendo X el número de veces que aparece el rojo en el 
    array e Y el número de veces que aparece el azul en el
    array).
*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String array[] = new String[10];
        int contadorRojo = 0, contadorAzul = 0;
        
        // Bucle para pedir color
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce un color : rojo o azul");
            array[i] = entrada.nextLine();
        }
        // bucle para aumentar contadores
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase("rojo"))
                contadorRojo++;
            else contadorAzul++;
        }
        System.out.println("El color rojo aparece "
                +contadorRojo+ 
                (contadorRojo == 1 ? " vez" : " veces") 
                +" en el array");
        System.out.println("El color azul aparece "
                +contadorAzul+ 
                (contadorAzul == 1 ? " vez" : " veces") 
                +" en el array");
    }
}