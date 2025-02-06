package Ejercicio87;

public class Baraja {
    Carta[] mazo;

    public Baraja() {
        mazo = new Carta[48];
        rellenarBaraja();
    }
    
    private void rellenarBaraja(){
        int palo = 12, random;
        random = (int)(Math.random() * 11 + 1);
        System.out.println(palo*4);
        for (int i = 0; i < palo; i++) {
            random = (int)(Math.random() * 11 + 1);
            if (mazo[i] == null){
                mazo[i] = new Carta(random, "a");
            }
        }
        for (int i = 0; i <= palo*2; i++) {
            random = (int)(Math.random() * 11 + 1);
            if (mazo[i] == null){
                mazo[i] = new Carta(random, "b");
            }
        }
        for (int i = 0; i <= palo*3; i++) {
            random = (int)(Math.random() * 11 + 1);
            if (mazo[i] == null){
                mazo[i] = new Carta(random, "c");
            }
        }
        for (int i = 0; i < palo*4; i++) {
            random = (int)(Math.random() * 11 + 1);
            if (mazo[i] == null){
                mazo[i] = new Carta(random, "d");
            }
        }
    }
    
    public String mostrar(){
        String res = "";
        int palo = 12;
        for (int i = 0; i < palo; i++) {
            res += mazo[i];
        }
        res+= "\n";
        for (int i = palo; i <= palo*2; i++) {
            res += mazo[i];
        }
        res+= "\n";
        for (int i = palo*2; i <= palo*3; i++) {
            res += mazo[i];
        }
        res+= "\n";
        for (int i = palo*3; i < palo*4; i++) {
            res += mazo[i];
        }
        return res;
    }
    
    public void barajar(){
        Carta temp;
        for (int i = 0; i < mazo.length; i++) {
            int j = (int)(Math.random() * i + 1);
            temp = mazo[i];
            mazo[i] = mazo[j];
            mazo[j] = temp;
        }
    }
    
    
}
