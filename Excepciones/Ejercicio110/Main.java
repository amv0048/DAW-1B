package Excepciones.Ejercicio110;

import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args){

        try {
            System.out.println(new Impar(24));
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println("Error general");
        }     
    }
}