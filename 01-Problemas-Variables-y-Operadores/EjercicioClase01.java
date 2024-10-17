package merida_Alvaro.EjerciciosClase;
import java.util.Scanner;

public class EjercicioClase01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*
            Crea un programa que pase de pulgadas
            a centímetros y viceversa
            
            1 pulgada => 2.54cm
        */
        final double VALOR_PULGADAS = 2.54; // final === const
        System.out.println("Numero de pulgadas a convertir");
        double pulgadas = entrada.nextDouble();
        double pulgadasToCm = pulgadas * VALOR_PULGADAS;
        
        System.out.println("Numero de cm a convertir");
        double cm = entrada.nextDouble();
        double cmToPulgadas = cm / VALOR_PULGADAS;
        
        System.out.println(pulgadas+" a centimetros son: "+pulgadasToCm+" pulgadas");
        System.out.println(cm+" a pulgadas son: "+cmToPulgadas+ " centimetros");
    }
}