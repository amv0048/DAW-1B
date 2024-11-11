package Problemas_05_Matrices;

import java.util.Scanner;

public class Ejercicio66 {
    /*
        Implementar el juego de Piedra-Papel-Tijeras 
        para dos jugadores humanos usando
        una matriz de comprobaciones: Cada fila corresponde 
        a uno de los tres elementos de
        juego. Igual para las columnas.  
        Las celdas de esa matriz tendrá algunos de los
        siguientes valores:
        • 0 : si el elemento de la fila y el de la columna 
           son el mismo (empate).
        • 1: si el elemento de la fila gana al elemento 
           de la columna.
 •      -1 : si el elemento de la fila pierde contra el 
           elemento de la columna. 
    */
    public static void main(String[] args) {
        int numPlayer1 = 0, numPlayer2 = 0;
        Scanner entrada = new Scanner(System.in);
        int optionPlayer1 = 0, optionPlayer2 = 0;
        int array[][] = {{0,-1,1}, // 0 = Empate
                         {1,0,-1}, // 1 = Gana Jugador1
                         {-1,1,0}}; // 2 = Gana Jugador2
        String opciones[] = {"Piedra", "Papel", "Tijeras"};
        
        do {
            System.out.println("BIENVENIDO AL JUEGO");
            System.out.println("Jugador 1");
            System.out.println("Introduce 0-piedra || 1-papel || 2-tijeras");
            optionPlayer1 = entrada.nextInt();
            System.out.println("Jugador 2");
            System.out.println("Introduce 0-piedra || 1-papel || 2-tijeras");
            optionPlayer2 = entrada.nextInt();
        } while (optionPlayer1 < 0 || optionPlayer1 > 2 ||
                optionPlayer2 < 0 || optionPlayer2 > 2);
        
        System.out.println("Eleccion Jugador1: "+opciones[optionPlayer1]);
        System.out.println("Eleccion Jugador2: "+opciones[optionPlayer2]);
        
        int result = array[optionPlayer1][optionPlayer2];
        
        if (result == 0)
            System.out.println("Empate");
        else if (result == 1)
            System.out.println("Gana el Jugador1");
        else
            System.out.println("Gana el jugador2");
    }
}