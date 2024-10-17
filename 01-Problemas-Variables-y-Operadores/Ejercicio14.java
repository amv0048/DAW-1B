package merida_Alvaro.Problemas01;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        
        try (Scanner numsec = new Scanner(System.in)) {
            System.out.println("Indique el numero de segundos transcurridos");
            int seconds = numsec.nextInt();
            int minutes = seconds / 60 + 1;
        
            System.out.println((minutes > 90 ? "Partido acabado" : "Minutos: "+minutes));
            numsec.close();
        }
    }
}
