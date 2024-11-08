package Problemas_04_Arrays;

public class EjercicioClaseArray {
/*
    Array con numeros enteros, crear otro array con
    los pares, el tamaño debe ser el exacto
*/
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,8,10};
        int contador = 1, c = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0)
                contador++;
        }
        int arrayPares[] = new int[contador];
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayPares[c] = array[i];
                System.out.print("["+arrayPares[c]+"]");
                c++;    
            }
        }
    }
}
