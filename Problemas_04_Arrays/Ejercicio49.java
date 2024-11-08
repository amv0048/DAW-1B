package Problemas_04_Arrays;
public class Ejercicio49 {
/*
    Sea el array flags con los valores: 
    0,1,0,-1,0,-1,-1,-1,0,0,-1. Crea un
    nuevo array llamado tivic que sea copia del anterior.
    A continuación recorre el primer array (flags) y 
    cambia todos los valores negativos por el valor 8.
*/
    public static void main(String[] args) {
       int flags[] = {0,1,0,-1,0,-1,-1,-1,0,0,-1};
       int tivic[] = new int [flags.length];

       for (int i = 0; i < tivic.length; i++) {
           tivic[i] = flags[i];
       }
       for (int i = 0; i < flags.length; i++) {
            if (flags[i] < 0){
                flags[i] = 8;
            }
            System.out.print(flags[i]+ ", ");
        }
        System.out.println();
        for (int j = 0; j < tivic.length; j++) {
            System.out.print(tivic[j]+ ", ");
        }
    }
}