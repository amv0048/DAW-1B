package CadenasDeCaracteres;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = entrada.nextLine();
        System.out.print("Introduce una palabra: ");
        String word = entrada.next();
        System.out.println(frase.contains(word) ? "si" : "no");
    }
}