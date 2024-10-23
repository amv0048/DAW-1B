package Problemas_03_Bucles;
import java.util.Scanner;

public class Ejercicio31 {
/*
    Realizar un algoritmo que pida por teclado
    un numero entero y a continuación muestre 
    todos los divisores de ese número.
*/
    public static void main(String[] args) {
        // Creo e inicializo variables
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime un numero entero");
        String lista = "";
        int num = entrada.nextInt();
        
        // Ejercicio con While
        while (num >= 0) {
            if (num % num == 0)
                lista += num+ " ";
            num--;
        }
        System.out.println(lista);
        
        // Ejercicio con for
        for (int i = num; i <= 0; i--) {
            if (num % num == 0)
                    lista += i+ " ";
        }
        System.out.println(lista);
    }
}
