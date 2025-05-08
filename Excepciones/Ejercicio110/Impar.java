package Excepciones.Ejercicio110;

import java.util.InputMismatchException;


public class Impar {
    int numero;
    
    public Impar(int num) throws Exception{
        if (num % 2 == 0){
            throw new InputMismatchException("El numero no es impar");
        }
         else
            this.numero = num;
    }
    
    public String toString(){
        return this.numero+"";
    }
}