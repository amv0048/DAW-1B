package Abstraccion.Ejercicio102;

public class Nota {
    protected int duracion; // Segundos
    protected String tipo;

    public Nota(String tipo, int duracion) {
        if (duracion >= 1 && duracion <= 10)
            this.duracion = duracion;
        else this.duracion = 1;
        
        this.tipo = tipo;
    }
    
    public Nota() {
        this.tipo = "do";
        this.duracion = 1;
    }
    
    @Override
    public String toString(){
        return "["+this.tipo+","+this.duracion+"]";
    }
}