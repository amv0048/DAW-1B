package Problemas_05_Matrices;

public class Ejercicio65 {
    /*
        Se dice que una matriz M es simétrica 
        perfecta si tiene el mismo número de filas y
        de columnas (MxM) y si todos sus elementos 
        cumplen que el elemento de la posición [i]
        [j] es el mismo que el de la posición [j][i].
        Implementa un programa que analice una matriz
        (creala y ponle valores tú) e indique si
        es simétrica perfecta o no
     */
    public static void main(String[] args) {
        int array[][] = {{0,11,0,11}
                        ,{11,0,0,0},
                         {0,0,0,0},
                         {11,0,0,0}};
        boolean diferente = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print("["+array[i][j]+"]");
            }
            System.out.println();
        }
 
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i].length != array[j].length) {
                    diferente = true;
                }
                else if (array[i][j] != array[j][i])
                    diferente = true;
            }
        }
        if (diferente)
            System.out.println("La matriz No es simetrica");
        else    System.out.println("La matriz es simetrica");
    }
}