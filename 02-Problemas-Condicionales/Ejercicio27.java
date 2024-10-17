package merida_Alvaro.Problemas02;
import java.util.Scanner;

public class Ejercicio27 {
/*
    Una empresa maneja números enteros positivos
    de 4 dígitos para controlar sus productos. 
    Estos números se denominan POOC:
    • P representa una de 8 provincias.
    • OO un tipo de operación.
    • C es un dígito de control
*/
    public static void main(String[] args) {
        // Creo e inicializo las variables
        Scanner entrada = new Scanner(System.in);
        int p, num, oo, c;
        double result;
        
        // Pido un numero de 4 cifras
        System.out.println("Introduce un numero "
                + "de 4 cifras");
        num = entrada.nextInt();
        
        // Compruebo que tenga 4 cifras
        result = num / 1000;
        if (result > 0)
            System.out.println("Tiene 4 cifras");
        else
            System.out.println("no tiene 4 cifras");
        
        // Compruebo si P es valido
        p = num / 1000;
        if (p >= 1 && p <= 8)
            System.out.println("P es valido");
        else
            System.out.println("P no es valido");
        
        oo = (num / 10) % 100;
        System.out.println(oo);
        
        c = num % 10;
        System.out.println("P: "+p);
        System.out.println("OO: "+oo);
        System.out.println("C: "+c);
    }
}
