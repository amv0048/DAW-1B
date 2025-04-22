package Ejercicio96.Personaje;

public class Minion extends Personaje{
    protected String tipo;

    public Minion(String tipo, String nombre, 
            int x, int y, int escudo, int ataque, int vida) {
        super(nombre, vida, x, y, escudo, ataque);
        this.nombre = "minion";
        this.x = (int)(Math.random() * (400-1) + 1);
        this.y = (int)(Math.random() * (1520-1) + 1);
        
        if (tipo.equals("Cannon")){
            this.vida = 50;
            this.escudo = 10;
            this.ataque = 10;
        }
        else if(tipo.equals("Mago")){
            this.vida = 12;
            this.escudo = 40;
            this.ataque = 30;
        }
        else{
            this.tipo = "Melee";
            this.vida = 75;
            this.escudo = 5;
            this.ataque = 25;
        }  
    }
}
