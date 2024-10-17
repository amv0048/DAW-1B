package merida_Alvaro.Problemas01;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
            // Área cuadrado => l*l
        double anchoHab, largoHab, lBald, precioBald;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Indique el ancho de la habitacion");
        anchoHab = entrada.nextDouble();
        
        System.out.println("Indique el largo de la habitacion");
        largoHab = entrada.nextDouble();
        
        System.out.println("Indique la medida del lado de la baldosa en cm");
        lBald = entrada.nextDouble();
        
        System.out.println("Indique el precio de cada baldosa");
        precioBald = entrada.nextDouble();
        
        double areaHab = (anchoHab * largoHab) * 1000;
        System.out.println(areaHab);
        double areaBald = (lBald * lBald);
        System.out.println(areaBald);
        
        long total = Math.round(areaHab / areaBald);
        double precioTotal = total * precioBald;
        
        System.out.println("El numero de baldosas necesarias sera de: "+total);
        System.out.println("El costo sera de: "+precioTotal);
    }
}
