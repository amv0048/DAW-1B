package Abstraccion.Ejercicio102;


public abstract class Viento extends Instrumento {
    private boolean tipo; // true metal; false madera;
    
    
    public Viento(){
        super();
        this.tipo = true;
    }
    
    public Viento(boolean tipo){
        super();
        this.tipo = tipo;
    }

    @Override
    public abstract void afinarse();
    
    
}
