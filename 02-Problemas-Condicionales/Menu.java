package merida_Alvaro.Problemas02;
import java.util.Scanner;

public class Menu {
/*
    Pide dos numeros al usuario 1 y 2
    muestra el menu y pide una opcion
    opcion 1: a suma
    opcion 2: b resta
    opcion 3: c division
    opcion 4: salir
    si no es valida: error
*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        char op = 0;
        while (op != 'd') {
            
            System.out.println("Dime dos numeros");
            int num1 = entrada.nextInt();
            int num2 = entrada.nextInt();
            
            System.out.println("Introduce una opcion:");
            System.out.println("A. Suma");
            System.out.println("B. Resta");
            System.out.println("C. Division");
            System.out.println("D. Salir");
            
            op = entrada.next().charAt(0);
            
            int sum = num1 + num2;
            int resta = num1 - num2;
            int div = num1 / num2;
        
            switch (op) {
                case 'a':
                    System.out.println(sum);
                     break;
                case 'b':
                   System.out.println(resta);
                   break;
                case 'c':
                  System.out.println(div);
                  break;
               default:
                   System.out.println("Error, opcion no valida");;
            }
        }
        System.out.println("Adios");
    }
}