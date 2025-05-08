package Excepciones.Ejercicio106;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
/*
    
*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean correct = false;
        int num = 0;
        int den = 0;
        
        do {
            System.out.print("Introduce un numero: ");
           try {
                num = entrada.nextInt();
                if (num < -5 || num > 100 || num == 0){
                        try {
                               throw new InputMismatchException();
                         } catch (InputMismatchException e) {
                             System.out.println("Numero no valido");
                             num = 0;
                        }
                }
                correct = true;
            } catch (Exception e) {
                System.out.println("Error, introduzca un numero entero");
                entrada.nextLine();
            }
           
        } while (!correct);
        // Actualizo el booleano a false de nuevo
        correct = false;
        
        do {
            System.out.print("Introduce un numero: ");
           try {
                den = entrada.nextInt();
                if (den < -5 || den > 100 || den == 0){
                        try {
                              throw new InputMismatchException();
                         } catch (InputMismatchException e) {
                             System.out.println("Numero no valido");
                             den = 1;
                        }
                }
                correct = true;
            } catch (Exception e) {
                System.out.println("Error, introduzca un numero entero");
                
                entrada.nextLine();
            }
        } while (!correct);
        
        System.out.println("Cociente: "+num/den);
    }

}