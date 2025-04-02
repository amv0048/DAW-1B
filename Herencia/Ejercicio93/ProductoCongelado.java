package Ejercicio93;

public class ProductoCongelado extends Producto {

    private String fechaEnv;
    private String paisO;
    private double tempRecomd;

    public ProductoCongelado(String fechaEnv, String paisO, double tempRecomd, String fechaCad, int numLote) {
        super(fechaCad, numLote);
        this.fechaEnv = fechaEnv;
        this.paisO = paisO;
        this.tempRecomd = tempRecomd;
    }

    public String getFechaEnv() {
        return fechaEnv;
    }

    public void setFechaEnv(String fechaEnv) {
        this.fechaEnv = fechaEnv;
    }

    public String getPaisO() {
        return paisO;
    }

    public void setPaisO(String paisO) {
        this.paisO = paisO;
    }

    public double getTempRecomd() {
        return tempRecomd;
    }

    public void setTempRecomd(double tempRecomd) {
        this.tempRecomd = tempRecomd;
    }

    @Override
    public String toString() {
        return "ProductoCongelado{" + "fechaEnv=" 
                + fechaEnv + ", paisO=" + paisO + 
                ", tempRecomd=" + tempRecomd + '}';
    }
}