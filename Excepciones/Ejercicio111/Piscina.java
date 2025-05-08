package Excepciones.Ejercicio111;

public class Piscina {

    public final int MAXNIVEL;
    private int nivel;

    public Piscina(int tope) {
        if (tope < 0) {
            tope = 0;
        }
        this.MAXNIVEL = tope;
        this.nivel = 0;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void quitarAgua(int cantidad) throws Exception {
        if (this.nivel - cantidad < 0)
            throw new Exception("No se puede quitar tanta agua");
        this.nivel -= cantidad;
    }

    public void ponerAgua(int cantidad) throws Exception{
        if (this.nivel + cantidad > this.MAXNIVEL)
            throw new Exception("No se puede echar mas agua");
        this.nivel += cantidad;
    }
}
