package Problemas_05_Matrices;

public class Ejercicio63 {
/*
    Crea un programa que encuentre el elemento de mayor 
    valor de una matriz y…
    a) muestre la posición de su primera aparición.
    b) muestre una lista con las posiciones de todas sus apariciones.
*/
    public static void main(String[] args) {
        int array[][] = new int[4][4];
        // Array para rellenarlo de numeros aleatorios
        for (int i = 0; i < array.length; i++) {
             for (int j = 0; j < array.length; j++) {
                array[i][j] = (int)(Math.random() * 100 + 1);
                 System.out.print("["+array[i][j]+"]");
            }
            System.out.println("");
        }

        // Bucle para encontrar el máximo
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }           
            }
        }

        // Bucle que guarda las posiciones
        String lista = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] == max)
                    lista += i + " " + j +" ";
            }
        }
        System.out.println("Maximo: "+max);
        System.out.println("Lista de posiciones: "+lista);
    }
}