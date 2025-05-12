package CadenasDeCaracteres;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.println("Introduce una frase");
       String frase = entrada.next();
       
       int count = 0;
       for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a'|| frase.charAt(i) == 'e' || frase.charAt(i) == 'i'
                    || frase.charAt(i) == 'o'|| frase.charAt(i) == 'u')
                count++;
       }
        System.out.println(count);
    }
}