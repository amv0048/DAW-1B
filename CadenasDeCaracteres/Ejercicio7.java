package CadenasDeCaracteres;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una contrasenia");
        String pass = entrada.next();
        
        if (pass.length() > 8 &&
                pass.contains("@") &&
                pass.contains(".") &&
                !pass.contains(" ")
                )
            System.out.println("Contrasenia valida");
        else
            System.out.println("Contrasenia no valida");
        
        if (pass.length() < 8){
            int posA = pass.indexOf("@");
            int posP = pass.indexOf(".");
            if ((posA > -1) && (posP > -1) && (posA < posP))
                if (!pass.contains(" "))
                    System.out.println("OK");
        }
    }
}