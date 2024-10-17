package merida_Alvaro.Problemas01;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner keyword = new Scanner(System.in);
        
        System.out.println("Dime un numero de caras");
        int numeroDeCaras = keyword.nextInt();
        
        int result = (int)(Math.random() * (numeroDeCaras + 1));
        System.out.println("Ha salido la cara: " +result);
        keyword.close();
    }
}