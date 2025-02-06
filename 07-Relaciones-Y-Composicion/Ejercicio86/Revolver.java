package Ejercicio86;


public class Revolver {
    private String marca;
    private String modelo;
    private Bala tambor[];
    private int martillo;
    
    public Revolver(String marca, String modelo, int tamanio){
         this.marca = marca;
         this.modelo = modelo;
         tambor = new Bala[tamanio];
         this.martillo = 0;
         recargar();
    }
    
    /**
     * Añade balas de tanaño aleatorio al 
     * tambor del revolver
     */
    public void recargar(){
        for (int i = 0; i < tambor.length; i++) {
            int rC = (int)(Math.random() * (20-5) + 5);
            int rL = (int)(Math.random() * (70-20) + 20);
            tambor[i] = new Bala(rC, rL);
        }
    }
    
    /**
     * Recarga el recolver pero solo los huecos vacios
     * @param numBalas = numero de balas a añadir
     */
    public void recargar(int numBalas){
        while (numBalas > 0){
            for (int i = 0; i < tambor.length; i++) {
                if (tambor[i] == null){
                    tambor[i] = new Bala();
                    numBalas--;
                }
            }
            numBalas = 0;
        }
    }
    
    /**
     * Dispara el revolver mostrando la informacion de la bala disparada
     * una vez disparada elimina la bala del tambor,
     * Si el revolver llega a la ultima bala vuelve al principio
     */
    public String disparar(){
        String res = "";
        if (tambor[martillo] != null){
            res += this.tambor[martillo].getInfo();
            this.tambor[martillo] = null;
        }
        else
            res += "No hay bala en este hueco";
        this.martillo++;
        if (this.martillo >= tambor.length)
            this.martillo = 0;
        return res;
    }
    
    @Override
    public String toString(){
        String res = "";
        res = "Modelo: "+this.modelo+"\n"+
        "Marca: "+this.marca+"\n"+
        "Tamanio tambor: "+this.tambor.length+"\n";
        for (int i = 0; i < tambor.length; i++) {
            if (tambor[i] != null)
                res += tambor[i].getInfo()+"\n";
            else
                res += "No hay bala\n";
        }
        return res;
    }
}