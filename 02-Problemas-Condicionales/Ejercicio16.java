package merida_Alvaro.Problemas02;
import java.util.Scanner;

public class Ejercicio16 {
/*
    Se necesita un algoritmo que calcule la media
    de de tres notas introducidas porteclado y en 
    caso de que esa media sea superior a 6.5, se 
    muestre por pantalla.‘Promocionado con una media 
    de XX’. En caso contrario, mostrar ‘No promocionas’.
    21,22,24
*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num1, num2, num3;
        int counter = 0;
        
        System.out.println("dime 3 numeros");
        num1 = entrada.nextDouble();
        counter++;
        System.out.println(counter+" de 3");
        num2 = entrada.nextDouble();
        counter++;
        System.out.println(counter+" de 3");
        num3 = entrada.nextDouble();
        counter++;
        System.out.println(counter+" de 3");
        
        double media = (num1 + num2 + num3) / 3;
        if (media > 6.5)
            System.out.println("Promocionado con una media de XX");
        else
            System.out.println("No promocionas");
        
    }
}
