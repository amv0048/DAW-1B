package merida_Alvaro.Problemas01;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe un numero de 4 cifras");
        int number = entrada.nextInt();
        
        int millares = number / 1000;
        int centenas = (number / 100) % 10;
        int decenas = (number / 10) % 10;
        int unidades = number % 10;
        
        System.out.println();
        System.out.println(millares);
        System.out.println(centenas);
        System.out.println(decenas);
        System.out.println(unidades);
        
        System.out.println();
        System.out.println("Numero inverso");
        System.out.println(unidades);
        System.out.println(decenas);
        System.out.println(centenas);
        System.out.println(millares);
    }
}
