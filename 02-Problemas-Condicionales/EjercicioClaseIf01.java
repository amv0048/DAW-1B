package merida_Alvaro.EjerciciosClase;
import java.util.Scanner;
/*
    Pide un numero entero e 
    indica si es par o impar
*/
public class EjercicioClaseIf01 {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)) {
            System.out.println("Dime un numero entero");
            int num = entrada.nextInt();
            
            if (num % 2 == 0) 
                System.out.println("es par");
            else
                System.out.println("es impar");
        }
    }
}
