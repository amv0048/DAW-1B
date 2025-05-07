package Excepciones.Ejercicio105;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean correctNum = false;
        int tam = 0, num = 0;
        do{
                try {
                     System.out.print("Introduce el tamanio del array: ");
                     tam = entrada.nextInt();
                     correctNum = true;
                } catch (InputMismatchException e) {
                    System.out.println("Introduce un numero entero");
                    entrada.nextLine();
                }
        }while(!correctNum);
        
        correctNum = false;
        
        double lista[] = new double[tam];
        for (int i = 0; i < lista.length; i++) {
            do {                
                try {
                    System.out.println("Introduce un double");
                    lista[i] = entrada.nextDouble();
                    correctNum = true;
                } catch (InputMismatchException e) {
                    System.out.println("ERROR. Introduce un numero correcto");
                    entrada.nextLine();
                }
            } while (!correctNum);
        }
    }
}