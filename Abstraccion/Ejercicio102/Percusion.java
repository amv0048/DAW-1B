package Abstraccion.Ejercicio102;


public abstract class Percusion extends Instrumento {
    private boolean usaBaquetas;// true si; false no;

    public Percusion(boolean usaBaquetas, 
            String marca, String fecha, Partitura musica) {
        super(marca, fecha, musica);
        this.usaBaquetas = usaBaquetas;
    }

    public Percusion(boolean usaBaquetas) {
        this.usaBaquetas = usaBaquetas;
    }
    
    
    
    @Override
    public abstract void afinar();
}
