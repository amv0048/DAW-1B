package Abstraccion.Ejercicio102;


public abstract class Viento extends Instrumento {
    private boolean tipo; // true metal; false madera;

    public Viento(boolean tipo, 
            String marca, String fecha, Partitura musica) {
        super(marca, fecha, musica);
        this.tipo = tipo;
    }

    public Viento(boolean tipo) {
        this.tipo = tipo;
    }

    @Override
    public abstract void afinar();
    
    
}
