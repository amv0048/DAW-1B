package Excepciones.Ejercicio111;

public class Main {

    public static void main(String[] args) {
        
        int valor = (int)(Math.random() * 100 + 1);
        Piscina p = new Piscina(valor);
        for (int i = 0; i < 5; i++) {
            int ale = (int)(Math.random() * 25 + 1);
            try {
                p.ponerAgua(ale);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}