package Problemas_05_Matrices;

public class Ejercicio64 {

    /*
        Dada una matriz MxM, crear un programa que muestre:
            a) El mayor elemento de la diagonal principal.
            b) La media de los valores de la diagonal principal
     */
    public static void main(String[] args) {
        int arr[][] = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int)(Math.random() * 100 + 1);
                System.out.print("["+arr[i][j]+"]");
            }
            System.out.println();
        }
        int max = arr[0][0], suma = 0, numInDiagonal = 0;
        double media = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    if (arr[i][j] > max)
                        max = arr[i][j];
                    suma += arr[i][j];
                    numInDiagonal++;
                }
            }
        }
        media = suma / numInDiagonal;
        System.out.println("El valor máximo es: "+max);
        System.out.println("La media es de: "+media);
    }
}
