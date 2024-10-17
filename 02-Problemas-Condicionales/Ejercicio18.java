package merida_Alvaro.Problemas02;

import java.util.Scanner;

public class Ejercicio18 {
/*
    Realizar un algoritmo que pida por 
    teclado dos números. Si el primero 
    es mayor alsegundo, mostrar la resta
    y la división de ambos. Si el segundo 
    es mayor o igual alprimero, mostrar la 
    suma y el producto de ambos.
*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe 2 numeros");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        int sum = num1 + num2;
        int rest = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;
        
        if (num1 > num2) {
            System.out.println("La resta es: "+rest);
            System.out.println("La division es: "+div);
        }
        else {
            System.out.println("La suma es: "+sum);
            System.out.println("El producto es: "+mult);
        }
            
    }
}
