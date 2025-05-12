package CadenasDeCaracteres;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String word = entrada.next();
        System.out.println("Longitud: "+word.length());
        System.out.println(word.charAt(0)+ " - "+word.charAt(word.length()-1));
    }
}