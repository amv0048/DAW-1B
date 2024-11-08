package Problemas_04_Arrays;
public class Ejercicio48 {
/*
   Sea el array relleno con las notas: 6,3,9,7,5,8,10,2,4 y 5
   Crea un programa que, a partir de ese array, muestre por pantalla la media aritmética de
   las notas
*/
    public static void main(String[] args) {
        int suma = 0, media = 0;
        int array[] = {6,3,9,7,5,8,10,2,4,5};
        
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        media = suma / array.length;
        System.out.println("La media es de: "+media);
    }
}