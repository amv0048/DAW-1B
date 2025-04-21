package Ejercicio96.Personaje;

public class Personaje {

    protected String nombre;
    protected int x;
    protected int y;
    protected double vida;
    protected double escudo;
    protected double ataque;

    public Personaje(String nombre, double vida, int x, int y,
            double escudo, double ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.escudo = escudo;
        this.ataque = ataque;
        this.x = x;
        this.y = 0;
    }
    
    public void atacar(Personaje enemigo){
        enemigo.escudo -= this.ataque;
        if (enemigo.escudo < 0)
            enemigo.vida += enemigo.escudo;
    }
    
    public void desplazarse(int x, int y){
        if (x < 0)
            x = 0;
        if (y < 0)
            y = 0;
        this.x += x;
        this.y += y;
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + 
                ", x=" + x + ", y=" + y + 
                ", vida=" + vida + 
                ", escudo=" + escudo + 
                ", ataque=" + ataque + '}';
    }    
}