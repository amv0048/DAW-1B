package merida_Alvaro.Problemas01;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        // (-b±√(b²-4ac))/(2a)
        Scanner numbers = new Scanner(System.in);
        double a, b, c;
        int counter = 0;
        
        System.out.println("Indique un numero");
        a = numbers.nextDouble();
        counter++;
        System.out.println(counter +" de 3");
        
        System.out.println("Indique otro numero");
        b = numbers.nextDouble();
        counter++;
        System.out.println(counter + " de 3");
        
        System.out.println("Indique otro numero");
        c = numbers.nextDouble();
        counter++;
        System.out.println(counter + " de 3");
        
        double ecuacionSegundoGrado1 = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
         double ecuacionSegundoGrado2 = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        System.out.println("x = "+ecuacionSegundoGrado1);
        System.out.println("x = "+ecuacionSegundoGrado2);
    }
}
