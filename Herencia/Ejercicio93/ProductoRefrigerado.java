package Ejercicio93;

public class ProductoRefrigerado extends Producto {

    private int codigoOrg;
    private String fechaEnv;
    private double temperaturaRecom;
    private String paisO;

    public ProductoRefrigerado(int codigoOrg, String fechaEnv,
            double temperaturaRecom, String paisO, 
            String fechaCad, int numLote) {
        super(fechaCad, numLote);
        this.codigoOrg = codigoOrg;
        this.fechaEnv = fechaEnv;
        this.temperaturaRecom = temperaturaRecom;
        this.paisO = paisO;
    }

    public int getCodigoOrg() {
        return codigoOrg;
    }

    public void setCodigoOrg(int codigoOrg) {
        this.codigoOrg = codigoOrg;
    }

    public String getFechaEnv() {
        return fechaEnv;
    }

    public void setFechaEnv(String fechaEnv) {
        this.fechaEnv = fechaEnv;
    }

    public double getTemperaturaRecom() {
        return temperaturaRecom;
    }

    public void setTemperaturaRecom(double temperaturaRecom) {
        this.temperaturaRecom = temperaturaRecom;
    }

    public String getPaisO() {
        return paisO;
    }

    public void setPaisO(String paisO) {
        this.paisO = paisO;
    }

    @Override
    public String toString() {
        return "ProductoRefrigerado{" + "codigoOrg=" + codigoOrg + ", fechaEnv=" + fechaEnv + ", temperaturaRecom=" + temperaturaRecom + ", paisO=" + paisO + '}';
    }
}