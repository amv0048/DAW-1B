package merida_Alvaro.Problemas01;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        
    Scanner keyword = new Scanner (System.in);
    double num1, minutos, horas, segundos;
    System.out.println("Dime un tiempo expresado en segundos");
    num1 = keyword.nextInt();
    minutos = num1/60;
    horas = (num1/60)/60;
    segundos = num1/1;
    System.out.println("Los horas son " + horas);
    System.out.println("Los minutos son " + minutos);
    System.out.println("Los segundos son " + segundos);
       
    keyword.close();
    }
}
