package merida_Alvaro.Problemas02;

import java.util.Scanner;

public class Ejercicio20 {
/*
   Se pide realizar un algoritmo que solicite 
   por teclado tres números. Si todos los
   valores ingresados son menores a 0, se mostrará por pantalla:
    Los números son: números introducidos
    a) El mayor es: el número mayor
    b) El menor es: el número meno
*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce 3 numeros");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        int num3 = entrada.nextInt();
        
        
        if (num1 < 0 && num2 < 0 && num3 < 0) {
            int max = num1;
            int min = num1;
            if (num2 > max)
                max = num2;
            if (num3 > max) 
                max = num3;
            System.out.println("El mayor es: "+max);
            
            if (num2 < min)
                min = num2;
            if (num3 < min) 
                min = num3;
            System.out.println("El menor es: "+min);
        }
    }
}
