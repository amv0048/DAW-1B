package Ejercicio76;

public class Cuenta {
    private String titular;
    private int cantidad;
    
    public Cuenta(String titular){
        this.titular = titular;
    }
    
    public Cuenta(String titular, int cantidad){
        this.titular = titular;
        if (cantidad < 1)
            System.out.println("ERROR");
        else
            this.cantidad = cantidad;
    }

    public void ingresar(int cantidad){
        if (cantidad < 1)
            System.out.println("ERROR, inferior "
                    + "a la cantidad minima para ingresar");
        else
            this.cantidad += cantidad; 
    }
    
    public void retirar(int cantidad){
        if (this.cantidad > cantidad)
            this.cantidad = cantidad;
        else
            System.out.println("ERROR, no "
                    + "hay suficiente dinero en la cuenta");
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular= " + titular + "\n "
                + "cantidad= " + cantidad;
    }
    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int Cantidad) {
        if (cantidad < 1)
            System.out.println("ERROR");
        else
            this.cantidad = Cantidad;
    }  
}
