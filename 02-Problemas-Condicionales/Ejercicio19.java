package merida_Alvaro.Problemas02;

import java.util.Scanner;

public class Ejercicio19 {
/*
    Diseña un algoritmo que calcule el
    mayor de 5 números introducidos por 
    el usuario.Utiliza la versión de el
    “candidato” para resolverlo. Hay que
    controlar además, que los valores de 
    introducidos sean correctos: números 
    positivos
*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escribe 5 numeros enteros");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        int num3 = entrada.nextInt();
        int num4 = entrada.nextInt();
        int num5 = entrada.nextInt();
        
        int max = num1;
        if (num2 > max)
            max = num2;
        if (num3 > max)
            max = num3;
        if (num4 > max)
            max = num4;
        if (num5 > max) {
            max = num5;
            System.out.println("El numero mayor es: "+max);
        }
    }
}
