package merida_Alvaro.Problemas01;

import java.util.Scanner;


public class Ejercicio12 {
    public static void main(String[] args) {
        /*
            Mb => MegaBytes
            MiB => Mebibytes
            Mb => Megabits
        
            a) Conversión MB a MiB
            b) Conversión MiB a Mb
        */
        Scanner num = new Scanner(System.in);
        
        System.out.println("Dime un numero de MegaBytes");
        Double mb = num.nextDouble();
        
        System.out.println("Dime un numero de MiB");
        Double mib = num.nextDouble();
        
        double mbToMib = mb * 0.95367431640625;
        double mibToMb = mib * 1.048576;
        
        System.out.println(mbToMib);
        System.out.println(mibToMb);
        
    }

}
