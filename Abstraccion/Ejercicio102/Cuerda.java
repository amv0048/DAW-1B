package Abstraccion.Ejercicio102;


public abstract class Cuerda extends Instrumento {
    private int numCuerdas;
    private boolean tipoCuerda;// true pulsadas; false percutidas;

    public Cuerda(int numCuerdas, 
            boolean tipoCuerda, String marca, String fecha, Partitura musica) {
        super(marca, fecha, musica);
        this.numCuerdas = numCuerdas;
        this.tipoCuerda = tipoCuerda;
    }

    public Cuerda(int numCuerdas, boolean tipoCuerda) {
        this.numCuerdas = numCuerdas;
        this.tipoCuerda = tipoCuerda;
    }

    public int getNumCuerdas() {
        return this.numCuerdas;
    }
    
    
    
    @Override
    public abstract void afinar();
}
