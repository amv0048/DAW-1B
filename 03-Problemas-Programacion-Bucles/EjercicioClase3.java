package Problemas_03_Bucles;

import java.util.Scanner;

public class EjercicioClase3 {
/*
    Pido numeros al usuario
    hasta que meta un numero
    mayor a 150
    Para cada numero:
    Si es par--> Verde
    Si es impar --> Rojo
*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Dime un numero");
        num = entrada.nextInt();
        while (num <= 150){
            if (num % 2 == 0){
                System.out.println("VERDE");
                System.out.println("Dime otro");
                num = entrada.nextInt();
            }
            else{
                System.out.println("ROJO");
                System.out.println("Dime otro");
                num = entrada.nextInt();
            }
        }
        System.out.println("Mayor a 150");
    }
}
