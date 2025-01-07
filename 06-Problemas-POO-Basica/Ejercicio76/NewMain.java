package Ejercicio76;

public class NewMain {

    public static void main(String[] args) {
        Cuenta messi = new Cuenta("Messi", 5000);
        Cuenta cr7 = new Cuenta("Cristiano Ronaldo", 3000);
        
        messi.ingresar(-2000);
        System.out.println(messi);
        System.out.println(cr7);
    }
}
