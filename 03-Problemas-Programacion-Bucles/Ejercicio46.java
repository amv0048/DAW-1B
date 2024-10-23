package Problemas_03_Bucles;
import java.util.Scanner;

public class Ejercicio46 {
/*
    Humano vs Maquina
    1) La maquina "piensa" un numero entre 1 y 100
    2) Pido un numero al usuario
    3) Mientras el usuario no acierte el numero
    Si el numero del usuario es menor "Tu numero es menor"
    Si es mayor "Tu numero es mayor"
    Y vuelve a pedir numero
    Version 2.0
    No dejar que el usuario meta numeros fuera de rango
    4) En el caso de que los numeros sean iguales "Has ganado"
    5) Contar el numero de intentos Y cuando el usuario gane
    mostrarlo.
    
*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime un numero del 1 al 100 payaso");
        int counter = 0;
        final int MIN = 1;
        final int MAX = 100;
        int num = entrada.nextInt();
        int numReal = (int)(Math.random() * MAX + MIN);
        
        
        while (num < MIN || num > MAX) {
            System.out.println("Entre 1 y 100 paleto");
            num = entrada.nextInt();
        }
        while (num > MIN && num <= MAX) {
            if (num == numReal) {
                System.out.println("Has ganado en: "+counter+ " intentos");
                num = entrada.nextInt();
            }
            else if (num < numReal) {
                System.out.println("Tu numero es menor");
                counter++;
                num = entrada.nextInt();
            }
            else if (num > numReal) {
                System.out.println("Tu numero es mayor");
                counter++;
                num = entrada.nextInt();
            }
        }
        
        do {
            if (num == numReal) {
                System.out.println("Has ganado en: "+counter+ " intentos");
                num = entrada.nextInt();
            }
            else if (num < numReal) {
                System.out.println("Tu numero es menor");
                counter++;
                num = entrada.nextInt();
            }
            else if (num > numReal) {
                System.out.println("Tu numero es mayor");
                counter++;
                num = entrada.nextInt();
            }
        }while (num >= MIN && num <= MAX);
    }
}
