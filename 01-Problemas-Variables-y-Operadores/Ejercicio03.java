package merida_Alvaro.Problemas01;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        float num1, num2, num3, num4, num5;
        try (Scanner wordtracker = new Scanner(System.in)) {
            int counter = 1;
            System.out.println("Dame 5 numeros para hacer la media");
            num1 = wordtracker.nextInt();
            counter++;
            System.out.println(counter+" de 5");
            num2 = wordtracker.nextInt();
            counter++;
            System.out.println(counter+" de 5");
            num3 = wordtracker.nextInt();
            counter++;
            System.out.println(counter+" de 5");
            num4 = wordtracker.nextInt();
            counter++;
            System.out.println(counter+" de 5");
            num5 = wordtracker.nextInt();
            counter++;
            System.out.println(counter+" de 5");
        }
        float media = (num1 + num2 + num3 + num4 + num5) / 5;
        System.out.println("la media es de: "+media);
    }
}
