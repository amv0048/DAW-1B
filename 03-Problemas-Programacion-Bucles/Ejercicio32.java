package Problemas_03_Bucles;
import java.util.Scanner;

public class Ejercicio32 {
/*
    Escriba un programa que pida un número al usuario.
    Si el número introducido no es divisible por 2 y 3 
    entonces el programa mostrará un mensaje de error y 
    volverá a pedir un número al usuario. En caso de que 
    el número sea divisible por dichos números se mostrará 
    el resultado de dividirlo por ellos y se terminará el programa.
*/
    public static void main(String[] args) {
        // Creo e inicializo variables
        Scanner entrada = new Scanner(System.in);
        int num = 0;
        // Pido datos al usuario
        System.out.println("Introduce un numero "
                + "divisible por 2 y 3");
        num = entrada.nextInt();
        
        // Compruebo que sea divisible por 2 y 3
        while (num % 2 != 0 && num % 3 != 0) {
            System.out.println("ERROR");
            num = entrada.nextInt();
        }
        // Solo si el numero es divisible por 2 y 3
        if (num % 2 == 0 && num % 3 == 0){
            System.out.println(num+" / 2 = "+num / 2);
            System.out.println(num+" / 3 = "+num / 3);
        }
    }
}
