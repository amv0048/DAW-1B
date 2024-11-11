package Problemas_05_Matrices;
public class Ejercicio61 {
    /*
        Crea un programa que cree una matriz de 10x10
        e introduzca los resultados de las tablas de
        multiplicar del 1 al 10. Luego muestra la matriz por
        pantalla en forma de matriz    
        
    */
    public static void main(String[] args) {
        int array[][] = new int[10][10];
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                array[i][j] = i * j;
                System.out.print("["+array[i][j] + "]");
            }
            System.out.println();
        }
    }
}