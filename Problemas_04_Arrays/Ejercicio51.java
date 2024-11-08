package Problemas_04_Arrays;

public class Ejercicio51 {
/*
    Crea un array de 100 elementos dónde cada elemento
    sea un número aleatorio entre 1 y 100. Realiza los
    siguientes apartados:
    a) Haz un programa que muestre los valores múltiplos de 5.
    b) Otro que sólo muestre los números pares.
    c) Otro que muestre el mayor de todos los elementos 
        del array y su posición (si hay varios iguales, 
        muestra el primero)
*/
    public static void main(String[] args) {
        int array[] = new int[100];

        // Array aleatorio
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100 + 1);
            System.out.println(array[i]);
        }
        // Multiplos de 5
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0)
                System.out.println("Multiplos de 5: "+array[i]);
        }
        // Pares
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                System.out.println("Pares: " + array[i]);
        }

        // Numero mayor y su posición
        int max = array[0];
        String posicion = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                posicion = i + "";
            } 
        }
        System.out.println("Mayor: "+max+ "Posicion: "+posicion);
    }
}