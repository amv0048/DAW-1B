package merida_Alvaro.Problemas02;
import java.util.Scanner;
public class Ejercicio23 {
/*
    Completa el ejercicio 10 de esta 
    relación (ecuaciones de segundo grado)
    contemplando la posibilidad de que a,b 
    o c puedan ser cero
*/
    public static void main(String[] args) {
        // Formula: (-b±√(b²-4ac))/(2a)
        // Inicio variables
        Scanner numbers = new Scanner(System.in);
        double a, b, c;
        int counter = 0;
        double ecuacionSegundoGradoC1;
        double ecuacionSegundoGradoC2;
        double discriminante;
        
        // Pido datos al usuario
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
        
        // Algoritmo
        
        // a, b y c = 0   0x^2 + 0x + 0 = 0
        if (a == 0 && b == 0 && c == 0)
            System.out.println("La ecuacion tiene infinitas soluciones");
        
        //  a y b = 0   0x^2 + 0x + c = 0
        if (a == 0 && b == 0 && c != 0)
            System.out.println("La ecuacion no tiene solucion");
        
        // c = 0    ax^2 + bx + 0 = 0
        if (a != 0 && b != 0 && c == 0) {
            System.out.println("x1 = 0");
            System.out.println("x2 = "+ (-b / a));
        }
        
        // a = 0    0x^2 + bx + c = 0
        if (a == 0 && b != 0 && c != 0)
            System.out.println("x1 == x2 "+ (-c / b));
        
        // Completa     ax^2 + bx + c = 0
        if (a != 0 && b!= 0 && c != 0) {
            discriminante = b * b - (4 * a * c);
            if (discriminante < 0){
                System.out.println("La ecuacion no tiene soluciones reales");
            }
            else {
                ecuacionSegundoGradoC1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                ecuacionSegundoGradoC2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            // Muestro por pantalla las dos soluciones
                System.out.println("x1 = "+ecuacionSegundoGradoC1);
                System.out.println("x2 = "+ecuacionSegundoGradoC2);
            }
        }
    }
}
