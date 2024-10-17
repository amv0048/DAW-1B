package merida_Alvaro.EjerciciosClase;
import java.util.Scanner;
/*
    Pide 2 edades e indica quien
    es mas joven o si son iguales
*/
public class EjercicioClaseIf02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad1 = entrada.nextInt();
        int edad2 = entrada.nextInt();
        
        if (edad1 > edad2) 
            System.out.println("edad2 es mas joven");
        else if (edad2 > edad1)
            System.out.println("edad1 es mas joven");
        else
            System.out.println("las edades son iguales");
    }
}
