package CadenasDeCaracteres;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String cad = "Yo tengo un coco";
        System.out.println("Introduce un caracter");
        String caracter = entrada.next();
        String change = "";
        String trozos[] = cad.split("");

        for (int i = 0; i < trozos.length; i++) {
            switch (trozos[i]) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    trozos[i] = caracter;
                    break;
            }
            change += trozos[i];

        }
        System.out.println(change);
    }
}
