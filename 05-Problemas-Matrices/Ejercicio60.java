package Problemas_05_Matrices;
import java.util.Scanner;

public class Ejercicio60 {
/*
    Crea un programa que cree una matriz de tamaño 
    5x5 que almacene los números del 1 al 25 y luego
    muestre la matriz por pantalla (en forma de matriz).
*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int array[][] = new int[5][5];
        int contador = 1;
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = contador;
                contador++;
                System.out.print("["+array[i][j]+"]");
            }
            System.out.println("");
        }
    }
}