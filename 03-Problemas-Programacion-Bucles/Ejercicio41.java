package Problemas_03_Bucles;
import java.util.Scanner;

/*
    Algoritmo que solicite al usuario un numero 
    entero y a continuación muestre la tabla
    de multiplicar de ese número hasta el 10. Pej:
    Tabla de multiplicar de? 3
    3x1=3
    3x2=6
    3x3=9
    3x4=12
    3x5=15
    3x6=18
    3x7=21
    3x8=24
    3x9=27
    3x10=30
 */

public class Ejercicio41 {
    public static void main(String[] args) {
        // Creo variables y pido 1 numero al usuario
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = entrada.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num+"x"+i+"="+(num*i));
        }
    }
}
