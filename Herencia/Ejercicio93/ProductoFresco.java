package Ejercicio93;

public class ProductoFresco extends Producto {

    private String fechaEnv;
    private String PaisO;
    private String metodoC;

    public ProductoFresco(String fechaEnv, String PaisO, String metodoC, String fechaCad, int numLote) {
        super(fechaCad, numLote);
        this.fechaEnv = fechaEnv;
        this.PaisO = PaisO;
        this.metodoC = metodoC;
    }

    public String getFechaEnv() {
        return fechaEnv;
    }

    public void setFechaEnv(String fechaEnv) {
        this.fechaEnv = fechaEnv;
    }

    public String getPaisO() {
        return PaisO;
    }

    public void setPaisO(String PaisO) {
        this.PaisO = PaisO;
    }

    public String getMetodoC() {
        return metodoC;
    }

    public void setMetodoC(String metodoC) {
        this.metodoC = metodoC;
    }

    @Override
    public String toString() {
        return "ProductoFresco{" + "fechaEnv=" + fechaEnv 
                + ", PaisO=" + PaisO + ", metodoC=" 
                + metodoC + '}';
    }

}