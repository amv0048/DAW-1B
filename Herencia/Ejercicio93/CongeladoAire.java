package Ejercicio93;


public class CongeladoAire extends ProductoCongelado {

    private double nitrogeno;
    private double oxigeno;
    private double dioxidoDeCarbono;
    private double vaporDeAgua;

    public CongeladoAire(double nitrogeno, double oxigeno, double dioxidoDeCarbono, double vaporDeAgua, String fechaEnv, String paisO, double tempRecomd, String fechaCad, int numLote) {
        super(fechaEnv, paisO, tempRecomd, fechaCad, numLote);
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.dioxidoDeCarbono = dioxidoDeCarbono;
        this.vaporDeAgua = vaporDeAgua;
    }

    public double getNitrogeno() {
        return nitrogeno;
    }

    public void setNitrogeno(double nitrogeno) {
        this.nitrogeno = nitrogeno;
    }

    public double getOxigeno() {
        return oxigeno;
    }

    public void setOxigeno(double oxigeno) {
        this.oxigeno = oxigeno;
    }

    public double getDioxidoDeCarbono() {
        return dioxidoDeCarbono;
    }

    public void setDioxidoDeCarbono(double dioxidoDeCarbono) {
        this.dioxidoDeCarbono = dioxidoDeCarbono;
    }

    public double getVaporDeAgua() {
        return vaporDeAgua;
    }

    public void setVaporDeAgua(double vaporDeAgua) {
        this.vaporDeAgua = vaporDeAgua;
    }

    @Override
    public String toString() {
        return "CongeladoAire{" + "nitrogeno=" + nitrogeno + ", oxigeno=" + oxigeno + ", dioxidoDeCarbono=" + dioxidoDeCarbono + ", vaporDeAgua=" + vaporDeAgua + '}';
    }
    
    
}
