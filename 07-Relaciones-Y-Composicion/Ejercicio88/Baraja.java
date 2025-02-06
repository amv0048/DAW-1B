package Ejercicio88;

public class Baraja {
    Carta[] mazo;
    Carta[] usadas;

    public Baraja() {
        mazo = new Carta[48];
        rellenarMazo();
        usadas = new Carta[48];
    }
    
    private void rellenarMazo(){
        int palo = 12, random;
        random = (int)(Math.random() * 11 + 1);
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
        for (int i = 0; i < mazo.length; i++) {
            if (i == 11 || i == 23 || 
                   i == 35 || i == 47)
                res+= "\n";
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
    
    /*-----------------------------------------------------------*/
    
    public int cartasDisponibles(){
        int cont = 0;
        for (int i = 0; i < usadas.length; i++) {
            if (usadas[i] != null)
                cont++;
        }
        return usadas.length - cont;
    }
    
    public String siguienteCarta(){
        String res = "No hay mas cartas";
        for (int i = 0; i < mazo.length; i++) {
            if (mazo[i] != null){
                res = mazo[i].toString();//Guarda la carta
                usadas[i] = mazo[i];// La manda al mazo de usadas
                mazo[i] = null; // La borra del mazo principal
                return res;
            }
        }
        return res;
    }
    
    public String darCartas(int num){
        String res = "";
        while (num > 0 && num <= cartasDisponibles()){
            res += siguienteCarta();
            num--;
        }
        return res;
    }
    
    public void reiniciar(){
        String res = "No hay mas cartas";
        int num = mazo.length;
        while (num > 0 && num >= cartasDisponibles()){
            for (int i = 0; i < mazo.length; i++) {
                if (usadas[i] != null){
                    res = usadas[i].toString();
                    mazo[i] = usadas[i];
                    usadas[i] = null;
                }
            }
            num--;
        }
    }
    
    public void cartasUsadas(){
        String res = "";
        int cont = 0; 
        for (int i = 0; i < usadas.length; i++) {
            if (usadas[i] != null){
                res += usadas[i];
                cont++;
            }
        }
        if (cont == 0)
            res = "Aun no hay cartas usadas";
        System.out.println(res);
    }
}