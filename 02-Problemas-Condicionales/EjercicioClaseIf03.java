package merida_Alvaro.EjerciciosClase;
import java.util.Scanner;
/*
    Pide tres numeros y di cual es el mayor
    indica el mayor y menor
*/
public class EjercicioClaseIf03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("dime 3 numeros");
        
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        int num3 = entrada.nextInt();
        int min = 0, max = 0;
        
        if ((num1 > num2) && (num1 > num3))
            max = num1;
        else if ((num2 > num1) && (num2 > num3))
            max = num2;
        else if ((num3 > num1) && (num3 > num2))
            max = num3;
        else
            System.out.println("Son iguales");
        System.out.println("El numero mayor es: "+max);
        
        if ((num1 < num2) && (num1 < num3))
            min = num1;
        else if ((num2 < num1) && (num2 < num3))
            min = num2;
        else if ((num3 < num1) && (num3 < num2))
            min = num3;
        else
            System.out.println("son iguales");
        System.out.println("El numero menor es: "+min);
        
        // Forma mas eficiente (Tecnica del candidato)
        int mayor = num2;
        if (num1 > mayor)
            mayor = num1;
        if (num3 > mayor)
            mayor = num3;
        
        int menor = num2;
        if (num1 < mayor)
            menor = num1;
        if (num3 < mayor)
            menor = num3;
    }
}
