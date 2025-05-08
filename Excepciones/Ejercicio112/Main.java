package Excepciones.Ejercicio112;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try {
             Gato michi = new Gato("123", 15);
             Gato pelusa = new Gato("1234", -1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}