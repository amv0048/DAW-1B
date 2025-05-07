package Excepciones.Ejercicio103;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean a = false;
        int num = 0;
           System.out.print("Introduce una cadena: ");
           String cad = entrada.nextLine();
           do {
               try {
                    System.out.print("Introduce un numero entero: ");
                    num = entrada.nextInt();
                    a = true;
                } catch (InputMismatchException e) {
                    System.out.println("Introduce un numero valido");
                    entrada.nextLine();
               } catch (Exception e){
                   System.out.println("Error desconocido");
                   entrada.nextLine();
               }
           } while (!a);
//           if (num > cad.length()){
//               System.out.println("No existe la posicion "+num+ " en la cadena");
//           }
//           else System.out.println(cad.charAt(num));
           try {
            System.out.println(cad.charAt(num));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No existe la posicion "+num+ " en la cadena");
        }
        catch (Exception e){
            System.out.println("Error desconocido");
        }
        entrada.close();
    }
}
