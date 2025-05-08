package Excepciones.Ejercicio107;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numA = (int)(Math.random() * 99 + 1);
        System.out.println(numA);
        int numU = 0;
        int intentos = 5;
        
        do {            
            System.out.println("Introduce un numero entre 1 y 100");
            try {
                numU = entrada.nextInt();
                intentos--;
                if (numA == numU){
                    intentos = 0;
                    System.out.println("Has ganado");
                }  
            } catch (Exception e) {
                System.out.println("ERROR, Introduce un numero");
                entrada.next();
                intentos--;
            }
        } while (intentos > 0);
    }
}