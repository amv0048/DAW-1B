package Problemas_03_Bucles;
import java.util.Scanner;

public class Ejercicio33 {
/*
    Realizar un programa que calcule el resultado 
    de elevar un número a otro. Para ello,leerá dos
    números enteros, la base y el exponente, y 
    calculará el resultado, mostrándoloen pantalla. 
    No se pueden utilizar las funciones que te calculen 
    automáticamente el resultado como, por ejemplo, 
    la función Math.pow.
*/
    public static void main(String[] args) {
        // Creo variables y pido datos al usuario
        Scanner entrada = new Scanner(System.in);
        int num1 = 0, num2 = 0, result = 1;
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        
        // Algoritmo de potencia con while
        while (num2 > 0) {
            result *= num1;
            num2--;
        }
        System.out.println(result);
        
        // Ejercicio con for
        for (int i = num2; i >= 0; i--) {
            result *= num1;
        }
        System.out.println(result);
    }
}
