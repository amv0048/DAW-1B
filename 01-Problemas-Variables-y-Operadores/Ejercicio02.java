package merida_Alvaro.Problemas01;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        int counter = 0, suma, resta, mult, div, num1, num2;
        double pow;
        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Dime dos numeros");
        
        num1 = numberScanner.nextInt();
        counter++;
        System.out.println(counter+" de 2");
        num2 = numberScanner.nextInt();
        
        suma = num1 + num2;
        resta = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        pow = Math.pow(num1, num2);
        
        System.out.println("La suma de " +num1+ " y " +num2+ " es: " +suma);
        System.out.println("La resta de " +num1+ " y " +num2+ " es: " +resta);
        System.out.println("La multiplicacion de " +num1+ " y " +num2+ " es: " +mult);
        System.out.println("el cociente de " +num1+ " entre " +num2+ " da: " +div);
        System.out.println(+num1+ " elevado a  " +num2+ " da: " +pow);
        numberScanner.close();
    }
}
