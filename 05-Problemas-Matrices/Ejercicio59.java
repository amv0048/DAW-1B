package Problemas_05_Matrices;
import java.util.Scanner;

public class Ejercicio59 {
/*
    Realizar un programa que pida al usuario un 
    numero N entre 3 y 5 y, a continuación, cree 
    una matriz NxN (N filas, N columnas) cuyos elementos
    se le van a ir pidiendo al usuario.
*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        String lista = "";
        do {
            System.out.println("Introduce un numero entre 3 y 5");
            num = entrada.nextInt();
        } while (num > 5 || num < 3);
        
        int array[][] = new int[num][num];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println("introduce un numero");
                array[i][j] = entrada.nextInt();
                lista += "["+array[i][j]+"]"; 
            }
        }
        System.out.println(lista);
    }
}