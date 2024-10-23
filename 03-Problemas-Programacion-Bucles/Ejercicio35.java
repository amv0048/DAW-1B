package Problemas_03_Bucles;
import java.util.Scanner;

public class Ejercicio35 {
/*
    Implementa un programa que solicite al usuario
    dos números: n y m. A continuación debe mostrar
    todos los múltiplos de n, entre n y m*n. Ejemplo:
        Introduce primer número: 4
        Introduce segundo número: 10
        Los múltiplos de 4 entre 4 y 40 son: 
            8,12,16,20,24,28,32,36,40
*/
    public static void main(String[] args) {
        // Creo variables y pido 2 numeros al usuario
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce primer numero");
        int num1 = entrada.nextInt();
        System.out.println("Introduce segundo numero");
        int num2 = entrada.nextInt();
        String lista = "";
        
        // Bucle desde n hasta n*m
        for (int i = num1; i <= num1*num2; i++) {
            if (i % num1 == 0) {
                // Evitar la ultima coma
                if (i < num1*num2) lista += i + ", ";
                else lista += i + ". ";
            }
        }
        // Muestro por pantalla el resultado
        System.out.print("Los multiplos entre "+num1+ " y "
                +num1*num2+ " son: "+lista);
    }
}
