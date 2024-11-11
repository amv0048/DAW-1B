package Problemas_05_Matrices;

public class EjercicioClase1 {
/*
    Matriz de 6x6
    Rellenar de valores aleatorios entre
    -5 y 5
    Contar cuantos son positivos y cuantos negativos
*/
    public static void main(String[] args) {
        int min = -5, max = 5, negativos = 0, positivos = 0;
        int array[][] = new int[6][6];
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int)(Math.random() * max * 2 + min);
                if (array[i][j] < 0) negativos++;
                else if (array[i][j] > 0) positivos++;
                System.out.print("["+array[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("negativos: "+negativos);
        System.out.println("positivos: "+positivos);
    }
}
