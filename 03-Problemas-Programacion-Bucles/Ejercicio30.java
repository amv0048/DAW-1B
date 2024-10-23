package Problemas_03_Bucles;
import java.util.Scanner;

public class Ejercicio30 {
/*
    Escribe un programa que lea de teclado 2 
    números enteros y saque en pantalla todos
    los números que estén entre ellos. Ejemplo:
    Introduce primer número: 4
    Introduce segundo número: 10
    4,5,6,7,8,9,10
    
    b) Modifica el programa para que solo
    escriba en pantalla los numeros pares de
    intervalo.
*/
    public static void main(String[] args) {
        // Creo variables y pido numeros al usuario
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int num1 = entrada.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = entrada.nextInt();
        int max = 0, min = 0;
        String lista = "";
        
        // Algoritmo Técnica del candidato
        if (num1 > num2) {
            max = num1;
            min = num2;
        }
        else {
            max = num2;
            min = num1;
        }
        // Ejercicio con while
        while (min < max) {
            min++;
            if (min % 2 == 0)
                lista += min+ ",";
        }
        System.out.println(lista);
        
        // Ejercicio con for
        for (int i = min; i < max; i++) {
            if (min % 2 ==0)
                lista += i+ ",";
        }
        System.out.println(lista);
    }
}