package Problemas_03_Bucles;
import java.util.Scanner;

public class Ejercicio39 {
/*
    Diseña un algoritmo que calcule el factorial 
    de un número pedido por teclado.
    El factorial de un numero es la multiplicación desde 
    el 1 hasta ese número. Pej 5! = 1*2*3*4*5 = 120
        Ejemplo de ejecución:
            Dame un número: 5
            El factorial de 5 es 120
*/
    public static void main(String[] args) {
        // Creo variables y pido un numero al usuario
        Scanner entrada = new Scanner(System.in);
        int num = 0, factorial = 1;
        System.out.println("Introduce un numero");
        num = entrada.nextInt();
        
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de "+num+
        " es "+factorial);
    }
}
