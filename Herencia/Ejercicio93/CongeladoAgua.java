package Ejercicio93;


public class CongeladoAgua extends ProductoCongelado {

    private double salinidad;

    public CongeladoAgua(double salinidad, String fechaEnv, String paisO, double tempRecomd, String fechaCad, int numLote) {
        super(fechaEnv, paisO, tempRecomd, fechaCad, numLote);
        this.salinidad = salinidad;
    }

    public double getSalinidad() {
        return salinidad;
    }

    public void setSalinidad(double salinidad) {
        this.salinidad = salinidad;
    }

    @Override
    public String toString() {
        return "CongeladoAgua{" + "salinidad=" + salinidad + '}';
    }
}