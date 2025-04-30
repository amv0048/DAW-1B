package Abstraccion.Ejercicio102;

public class Main {

    public static void main(String[] args) {
        Partitura p = new Partitura("Jaime", "Navarta", 30);
        for (int i = 0; i < 20; i++) {
            p.addNota(new Nota());
        }
        System.out.println(p);
        
        Instrumento i = new Instrumento();
        System.out.println(i.tocarPartitura());
        
        
    }
}