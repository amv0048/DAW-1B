package CadenasDeCaracteres;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String cad = entrada.next();
        
        String fiveFirst = cad.substring(0, 5);
        
        System.out.println(fiveFirst);
        String lastThree = cad.substring(cad.length() - 3);
        System.out.println(lastThree);
    }
}