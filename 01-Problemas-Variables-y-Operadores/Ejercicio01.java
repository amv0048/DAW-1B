package merida_Alvaro.Problemas01;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        try (Scanner wordScanner = new Scanner(System.in)) {
            String nombre, dni, fecha;
            System.out.println("Escribe tu nombre");
            nombre = wordScanner.nextLine();
            
            System.out.println("Escribe tu DNI");
            dni = wordScanner.nextLine();
            
            System.out.println("Escribe tu fecha de nacimiento");
            fecha = wordScanner.nextLine();
            
            System.out.println("Nombre................."+nombre);
            System.out.println("DNI...................."+dni);
            System.out.println("Fecha de nacimiento...."+fecha);
        }
    }
}
