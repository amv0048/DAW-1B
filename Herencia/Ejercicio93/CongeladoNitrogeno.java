package Ejercicio93;

public class CongeladoNitrogeno extends ProductoCongelado {

    private String metodoC;
    private int exposicionN;

    public CongeladoNitrogeno(String metodoC, int exposicionN, String fechaEnv, String paisO, double tempRecomd, String fechaCad, int numLote) {
        super(fechaEnv, paisO, tempRecomd, fechaCad, numLote);
        this.metodoC = metodoC;
        this.exposicionN = exposicionN;
    }

    public String getMetodoC() {
        return metodoC;
    }

    public void setMetodoC(String metodoC) {
        this.metodoC = metodoC;
    }

    public int getExposicionN() {
        return exposicionN;
    }

    public void setExposicionN(int exposicionN) {
        this.exposicionN = exposicionN;
    }

    @Override
    public String toString() {
        return "CongeladoNitrogeno{" + "metodoC=" + metodoC + ", exposicionN=" + exposicionN + '}';
    }   
}