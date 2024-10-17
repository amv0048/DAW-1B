package merida_Alvaro.Problemas01;


import java.util.Scanner;


public class Ejercicio11 {
    public static void main(String[] args) {
        
        /*
            Megabits por segundo => Mbps
            Mebibytes por segundo => Mib
            
            1 Mbps = 0.11920928955078 Mib
        */
        Scanner entrada = new Scanner(System.in);
        double mbps, mib;
        
        System.out.println("Dime un numero de Mbps");
        mbps = entrada.nextDouble();
        
        mib = mbps * 0.11920928955078;
        
        System.out.println(mbps+" Mbps son: "+mib+" Mib");
        entrada.close();
    }
}
