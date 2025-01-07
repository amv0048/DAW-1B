package Ejercicio69;

public class Cafetera {
    private final int capacidadMaxima = 1000;
    private int capacidadActual;
    
    public Cafetera(){
        this.capacidadActual = 0;
    }
    
    public void echarCafe(int cc){
        if (cc <= capacidadMaxima){
            this.capacidadActual += cc;
            if (this.capacidadActual > this.capacidadMaxima)
                this.capacidadActual = this.capacidadMaxima;
        }
    }
    
    public void llenarCafetera(){
        this.capacidadActual = this.capacidadMaxima;
    }
    
    public void vaciarCafetera(){
        this.capacidadActual = 0;
    }
    
    public void servirTaza(int cc){
        if (this.capacidadActual >= cc)
            this.capacidadActual -= cc;
    }
    
    public int getCafe(){
        return this.capacidadActual;
    }
    
    public void cantidadCafe(){
        System.out.println("Queda "+getCafe()+ " cc de cafe "
                + "en la cafetera");
    }
}