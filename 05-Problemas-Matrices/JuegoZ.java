package Problemas_05_Matrices;
import java.util.Scanner;

// NO TERMINADO
public class JuegoZ {

    public static void main(String[] args) {
        mostrarMenu();
        char tablero[][] = new char[10][10];
        game(crearTablero(), distanciaManhattan(tablero, 0, 0, 0, 0));
    }

    public static void mostrarMenu(){
        System.out.println("BIENVENIDO AL JUEGO");
        System.out.println("""
                Pulse 1-Para moverte Arriba
                Pulse 2-Para moverte Abajo
                Pulse 3-Para moverte Izquierda
                Pulse 4-Para moverte Derecha
                """);
    }
    
    public static char[][] crearTablero() {
        char tablero[][] = new char[10][10];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (i == 0 || i == 9)
                    tablero[i][j] = '_';
                else if (j == 0 || j == 9)
                    tablero[i][j] = '|';
                else 
                    tablero[i][j] = '-';
                //System.out.print(tablero[i][j] + "  ");
            }
            //System.out.println();
        }
        return tablero;
    }

    public static void mostrarTablero(char tablero[][]){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j] + "  ");
            }
            System.out.println();
        }
    }
    
    public static int distanciaManhattan(char tablero[][], int iActual, int jActual,
                                          int zombieI, int zombieJ){
       int resultJ = (zombieI - iActual) + (zombieI - jActual);
       return resultJ;
    }

    

    public static void game(char tablero[][], int resultJ){
        int iActual = 4, jActual = 4;
        char alberto = 'A';
        char zombie = 'Z';
        int zombieI = (int)(Math.random() * 7 + 1);
        int zombieJ = (int)(Math.random() * 7 + 1);

        tablero[iActual][jActual] = alberto;

        if (tablero[zombieI][zombieJ] != tablero[iActual][jActual])
            tablero[zombieI][zombieJ] = zombie;
        else
            zombieI = (int)(Math.random() * 9 + 1);
        mostrarTablero(tablero);
        Scanner entrada = new Scanner(System.in);
        int c = 100;

        while (c >= 0) {
            c--;
            int r = (int)(Math.random() * 1 + 1);
            int opcion = entrada.nextInt();
            switch (opcion) { 
                case 1 -> {
                    if (iActual != 0 && jActual != 0 &&
                            iActual != 8 && jActual != 8) {
                        tablero[iActual - 1][jActual] = alberto;
                        if (iActual == 0 || iActual == 9)
                            tablero[iActual][jActual] = '_';
                        else if (jActual == 0 || jActual == 9)
                            tablero[iActual][jActual] = '|';
                        tablero[iActual][jActual] = '-';
                        iActual = iActual - 1;
                    }
                    else {
                        tablero[iActual + 1][jActual] = alberto;
                        if (iActual == 0 || iActual == 9)
                            tablero[iActual][jActual] = '_';
                        else if (jActual == 0 || jActual == 9)
                            tablero[iActual][jActual] = '|';
                        tablero[iActual][jActual] = '-';
                        iActual = iActual + 1;
                    }
                    distanciaManhattan(tablero, iActual, jActual, zombieI, zombieJ);
                    tablero[zombieI][zombieJ] = tablero[zombieI][zombieJ - resultJ];
                    tablero[zombieI][zombieJ] = zombie;
                    zombieJ = zombieJ - resultJ;
                }
                case 2 -> {
                    if (iActual != 0 && jActual != 0 &&
                            iActual != 8 && jActual != 8) {
                        tablero[iActual + 1][jActual] = alberto;
                        if (iActual == 0 || iActual == 9)
                            tablero[iActual][jActual] = '_';
                        else if (jActual == 0 || jActual == 9)
                            tablero[iActual][jActual] = '|';
                        tablero[iActual][jActual] = '-';
                        iActual = iActual + 1;
                    }
                    else {
                        tablero[iActual - 1][jActual] = alberto;
                        if (iActual == 0 || iActual == 9)
                            tablero[iActual][jActual] = '_';
                        else if (jActual == 0 || jActual == 9)
                            tablero[iActual][jActual] = '|';
                        tablero[iActual][jActual] = '-';
                        iActual = iActual - 1;
                    }
                    tablero[zombieI][zombieJ - resultJ] = zombie;
                }
                case 3 -> {
                    if (iActual != 0 && jActual != 0 &&
                            iActual != 8 && jActual != 8) {
                        tablero[iActual][jActual - 1] = alberto;
                        if (iActual == 0 || iActual == 8)
                            tablero[iActual][jActual] = '_';
                        else if (jActual == 0 || jActual == 9)
                            tablero[iActual][jActual] = '|';
                        tablero[iActual][jActual] = '-';
                        jActual = jActual - 1;
                    }
                    else {
                        tablero[iActual][jActual + 1] = alberto;
                        if (iActual == 0 || iActual == 9)
                            tablero[iActual][jActual] = '_';
                        else if (jActual == 0 || jActual == 9)
                            tablero[iActual][jActual] = '|';
                        tablero[iActual][jActual] = '-';
                        jActual = jActual + 1;
                    }
                    tablero[zombieI][zombieJ] = zombie;
                }
                case 4 -> {
                    if (iActual != 0 && jActual != 0 &&
                            iActual != 8 && jActual != 8) {
                        tablero[iActual][jActual + 1] = alberto;
                        if (iActual == 0 || iActual == 9)
                            tablero[iActual][jActual] = '_';
                        else if (jActual == 0 || jActual == 9)
                            tablero[iActual][jActual] = '|';
                        tablero[iActual][jActual] = '-';
                        jActual = jActual + 1;
                    }
                   else {
                        tablero[iActual][jActual - 1] = alberto;
                        if (iActual == 0 || iActual == 9)
                            tablero[iActual][jActual] = '_';
                        else if (jActual == 0 || jActual == 9)
                            tablero[iActual][jActual] = '|';
                        tablero[iActual][jActual] = '-';
                        jActual = jActual - 1;
                    }
                    tablero[zombieI][zombieJ] = zombie;
                }
                default -> System.out.println("Hola capullo");
            }
            mostrarMenu();
            mostrarTablero(tablero);
            distanciaManhattan(tablero, iActual, jActual, zombieI, zombieJ);
        }
    }
}