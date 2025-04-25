package Abstraccion.Ejercicio102;


public abstract class Cuerda extends Instrumento {
    private int numCuerdas;
    private boolean tipoCuerda;// true pulsadas; false percutidas;
    
    public Cuerda(){
        super();
        this.numCuerdas = 4;
        this.tipoCuerda = false;
    }
    
    public Cuerda(int num, boolean tipo){
        super();
        this.numCuerdas = num;
        this.tipoCuerda = tipo;
    }
    
    @Override
    public abstract void afinarse();
}
