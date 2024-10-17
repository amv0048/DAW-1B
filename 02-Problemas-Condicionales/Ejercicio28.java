package merida_Alvaro.Problemas02;
import java.util.Scanner;

public class Ejercicio28 {
/*
    Realiza un programa que dada una cantidad 
    de dinero en Euros, realice un desglose en 
    billetes y monedas. Ej:
    Introduce cantidad a desglosar: 434
    El desglose obtenido es...
    2 billetes de 200€
    1 billete de 20€
    1 billete de 10€
    2 monedas de 2€
    Los billetes disponibles son de 500,200,10,50,
    20,10 y 5€ y las monedas de 2 y 1€.
*/
    public static void main(String[] args) {
        // Creo e inicializo variables
        Scanner entrada = new Scanner(System.in);
        int quinientos = 0, doscientos = 0, cien = 0, 
                cincuenta = 0, veinte = 0, diez = 0, 
                cinco = 0, dos = 0, uno = 0;
        
        //Pido datos por pantalla
        System.out.println("Introduzca cantidad a desglosar");
        int num = entrada.nextInt();
        
        // Algoritmo
        if (num / 500 > 0) {
            quinientos += 1;
            num -= 500;
        }
        if (num / 200 > 0){
            doscientos+=1;
            num -= 200;
        }
        if (num / 100 > 0){
            cien += 1;
            num -= 100;
        }
        if (num / 50 > 0){
            cincuenta+=1;
            num -= 50;
        }
        if (num / 20 > 0){
            veinte += 1;
            num -= 20;
        }
        if (num / 10 > 0){
            diez += 1;
            num -= 10;
        }
        if (num / 5 > 0){
            cinco += 1;
            num -= 5;
        }
        if (num / 2 > 0){
            dos += 1;
            num -= 2;
        }
        if (num / 1 > 0){
            uno += 1;
            num -= 1;
        }
        
        // Muestro el resultado por pantalla
        System.out.println(quinientos+" 500");
        System.out.println(doscientos+" 200");
        System.out.println(cien+" 100");
        System.out.println(cincuenta+" 50");
        System.out.println(veinte+" 20");
        System.out.println(diez+" 10");
        System.out.println(cinco+" 5");
        System.out.println(dos+" 2");
        System.out.println(uno+" 1");
        System.out.println(num);
    }
}
