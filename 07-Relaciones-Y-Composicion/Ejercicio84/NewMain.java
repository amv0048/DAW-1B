package Ejercicio84;

public class NewMain {

    public static void main(String[] args) {
        Arma arma1 = new Arma("pistola", 100, 10);
        Guerrero defensor = new Guerrero("juan", 100, 20, 40, arma1);
        
        Guerrero joel = new Guerrero("Joel", 100, 20, 50, 
                arma1);
        
        System.out.println(defensor.toString());
        System.out.println(joel.atacar(defensor));
        System.out.println(defensor.toString());
        System.out.println(defensor.atacar(joel));
        System.out.println(joel);
        
        
    }
}
