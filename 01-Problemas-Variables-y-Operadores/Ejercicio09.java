package merida_Alvaro.Problemas01;


import java.util.Scanner;


public class Ejercicio09 {
    public static void main(String[] args) {
        int a, b, x;
        Scanner numbers = new Scanner(System.in);
        
        System.out.println("Indique un numero");
        a = numbers.nextInt();
        System.out.println("Dime otro");
        b = numbers.nextInt();
        
        //ax + b = 0
        
        x = -b / a;
        System.out.println(x);
        numbers.close();
    }

}
