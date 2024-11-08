package Problemas_04_Arrays;
import java.util.Scanner;

public class Ejercicio57 {
/*
    - Crea dos arrays de enteros tamaño 5. A continuación:
• Rellena el primero con números aleatorios entre el 2 y el 50.
• Rellena el segundo con valores que introduzca el usuario por 
    teclado.
• Crea un tercer array cuyos valores en cada celda van a ser la 
suma de las celdas
correspondientes de los otros dos arrays. Es decir, para la 
celda 1: la suma de las
celdas 1 del 1er y del 2º array. Para la celda 2: la suma de 
las celdas 2 del 1er y del 2º
array y así sucesivamente.
• Muestra el tercer array por pantalla.
• Muestra la suma de todos los elementos del tercer array.
*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Creo los arrays de tamaño 5
        int arrayAleatorio[] = new int[5];
        int arrayUsuario[] = new int[5], arraySuma[] = new int[5];
        // c para aumentar los indices al sumar
        int c = 0, suma = 0;
        
        for (int i = 0; i < arrayAleatorio.length; i++) {
            arrayAleatorio[i] = (int)(Math.random() * 49 + 2);
            System.out.print("["+arrayAleatorio[i]+"]");
        }
        System.out.println("");
        for (int i = 0; i < arrayUsuario.length; i++) {
            System.out.println("introduce un numero");
            arrayUsuario[i] = entrada.nextInt();
        }
        for (int i = 0; i < arraySuma.length; i++) {
            arraySuma[i] = arrayAleatorio[c] + arrayUsuario[c];
            c++;
            System.out.print("["+arraySuma[i]+"]");
            suma += arraySuma[i];
        }
        System.out.println("");
        System.out.println("La suma de todas las celdas"
                + "del array es: "+suma);
    }
}