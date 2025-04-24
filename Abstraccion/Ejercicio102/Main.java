package Abstraccion.Ejercicio102;

public class Main {

    public static void main(String[] args) {
        Partitura p = new Partitura("Jaime", "Navarta");
        for (int i = 0; i < 20; i++) {
            p.addNota(new Nota());
        }
        System.out.println(p);
    }
}
