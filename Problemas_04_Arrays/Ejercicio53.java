package Problemas_04_Arrays;

public class Ejercicio53 {
/*
    Haz un programa que dados dos arrays 
    (tamaño y tipo los que tu quieras) diga sin
    esos arrays son iguales o no. Dos arrays son 
    iguales si sus elementos son iguales y están
    en la misma posición.
*/
    public static void main(String[] args) {
        int array1[] = {1,2,3,4,5,6,7,8,9,10};
        int array2[] = {1,2,3,4,5,6,7,8,9,10};
        boolean noIguales = false;
        int i = 0;
        
        // Compruebo que tengan el mismo tamaño
        if (array1.length != array2.length)
            System.out.println("El tamano es diferente");

        // Si algun numero es diferente el booleano se 
        //actualiza para salir del bucle
        while ( i < array1.length && !noIguales) {
            if (array1[i] != array2[i])
                noIguales = true;
            i++;
        }
        if (noIguales)
            System.out.println("Los arrays NO son iguales");
        else
            System.out.println("Los arrays son iguales");
        
    }
}