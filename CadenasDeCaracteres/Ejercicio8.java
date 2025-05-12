package CadenasDeCaracteres;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un nombre y un apellido: ");
        String cad = entrada.nextLine();
        
        
        cad = cad.toLowerCase();
        cad = cad.trim();
        String res ="";
        String trozos[] = cad.split("");
        for (int i = 0; i < trozos.length; i++) {
            if (trozos[i].equals(" ")){
                trozos[i+1] = trozos[i+1].toUpperCase();
            }
            res += trozos[i];
        }
        System.out.println(res);  
        }
}