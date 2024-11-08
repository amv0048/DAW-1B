package Problemas_04_Arrays;

public class Ejercicio50 {
/*
    Crea un array de 100 Crea un array de 100 elementos 
    dónde cada elemento sea un número aleatorio entre 
    1 y 100. A continuación muestra por pantalla el mayor y el
    menor elemento de ese array. 
*/
    public static void main(String[] args) {
        int array[] = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100 + 1);
            if (i < array.length - 1)
                System.out.print(array[i]+ ", ");
            else System.out.println(array[i] + "");
        }
    }
}