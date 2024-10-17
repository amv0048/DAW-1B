package merida_Alvaro.Problemas02;
import java.util.Scanner;

public class Ejercicio25 {
/*
    Realiza un programa que indique si un numero 
    introducido por teclado es de 5 cifras y además
    es par
*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num = entrada.nextInt();
        if (num % 2 == 0) {
            double result = num / 10000;
            if (result > 0)
                System.out.println("Tiene 5 cifras");
            else
                System.out.println("no tiene 5 cifras");
        }
        else
            System.out.println("Es impar");
    }
}
