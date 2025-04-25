package Abstraccion.Ejercicio102;


public abstract class Percusion extends Instrumento {
    private boolean usaBaquetas;// true si; false no;
    
    public Percusion(){
        super();
        usaBaquetas = true;
    }
    
    public Percusion(boolean usa){
        super();
        this.usaBaquetas = usa;
    }
    
    @Override
    public abstract void afinarse();
}
