package Ejercicio86;

public class Bala {
    private int calibre; // En milimetros
    private int longitud; // En milimetros

    public Bala(int calibre, int longitud) {
        if (calibre <= 0){
            this.calibre = 5;
        }
        if (longitud <= 0 ){
            this.longitud = 17;
        }
        else{
            this.calibre = calibre;
            this.longitud = longitud;
        }
    }
    
    /**
     * Constructor con calibre y longitud por defecto
     */
    public Bala(){
        this.calibre = 9;
        this.longitud = 40;
    }
    
    @Override
    public String toString(){
        String res = "";
        res = "Bala de calibre "
                +this.calibre+"mm y longitud "
                +this.longitud+"mm";
        return res;
    }
    
    public String getInfo(){
        return "Calibre: "+this.calibre+ " Length: "+this.longitud;
    }
}
