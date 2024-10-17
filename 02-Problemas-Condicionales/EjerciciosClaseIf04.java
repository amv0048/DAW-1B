package merida_Alvaro.EjerciciosClase;
import java.util.Scanner;

public class EjerciciosClaseIf04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime un numero del 1 al 12");
        int num = entrada.nextInt();
        
        if (num >= 0 && num <= 12) {
            if ((num == 12) || (num >= 1 && num <= 2))
                System.out.println("invierno");
            else if (num >= 3 && num <= 5)
                System.out.println("primavera");
            else if (num >= 6 && num <= 8)
                System.out.println("verano");
            else if (num >= 9 && num <= 11)
                System.out.println("otoño");
        }
        else
            System.out.println("Error");
        entrada.close();
    }
}