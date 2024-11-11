package Problemas_05_Matrices;

public class EjercicioClase2 {
/*
    Matriz de 3x4
    Inicializala con valores del 1 al 100
    Indica si tiene algun valor repetido o no
    
    Se queda para más adelante, habria que escojer
    un elemento y buscar si se repite en todo el
    array
*/
    public static void main(String[] args) {
        int array[][] = new int[3][4];
        int min = 1, max = 100;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int)(Math.random() * max + min);
                System.out.println(array[i][j]);
            }
        }
        
        
    }
}
