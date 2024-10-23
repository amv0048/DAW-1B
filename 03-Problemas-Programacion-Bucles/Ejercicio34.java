package Problemas_03_Bucles;

public class Ejercicio34 {
/*
    Crea un programa que muestre todos los 
    múltiplos de 6 entre 6 y 200, ambosinclusive.
*/
    public static void main(String[] args) {
        String lista = "";
        for (int i = 6; i <= 200; i++) {
            if (i % 6 == 0)
                lista += i + ", ";
        }
        System.out.println(lista);
    }
}
