package CadenasDeCaracteres;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        int cont = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String cad = entrada.next();

        for (int i = 0; i < cad.length(); i++) {
           if (cad.equals(" "));
                cont++;
        }
        
        System.out.println("Numero de palabras: "+cont);
        
       System.out.println("Numero de palabras: "+cad.split("").length);
   }
}
