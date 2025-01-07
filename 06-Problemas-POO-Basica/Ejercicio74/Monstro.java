package Ejercicio74;

public class Monstro {
    private String nombre, comidaFav;
    private int puntosEsfuerzo, puntosHambre, vidas;
    private final int MAX_VIDAS, MAX_ESFUERZO, MAX_HAMBRE;
    private boolean vivo;
    
    public Monstro(String nombre){
        this.nombre = nombre;
        this.vidas = 7;
        this.puntosEsfuerzo = 10;
        this.puntosHambre = 3;
        this.MAX_ESFUERZO = puntosEsfuerzo;
        this.MAX_HAMBRE = puntosHambre;
        this.MAX_VIDAS = vidas;
        this.vivo = true;
        this.comidaFav = "albondigas";
    }
    
    public void comer(String comida){
        if (checkVidas()){
            puntosEsfuerzo -= 2;
            puntosHambre += 2;
            if (comida == this.comidaFav)
                puntosHambre++;
        } else muerte();
    }
    
    public void comunicarse(){
        if (checkVidas()){
            puntosEsfuerzo--;
            checkEsfuerzo();
        }
        else muerte();
    }
    
    public void jugar(){
        if (checkVidas()){
            puntosEsfuerzo -= 3;
            puntosHambre--;
            checkEsfuerzo();
                checkHambre();
        }
        else muerte();
    }
    
    public void dormir(){
        if (checkVidas()){
            this.puntosEsfuerzo+=5;
        }
        else muerte();
    }
    
    public boolean checkVidas(){
        if (vidas > 0 && vivo){
            return true;
        }
        return false;
        
    }
    
    public void muerte(){
        if (this.vidas <= 0){
            this.puntosEsfuerzo = -1;
            this.puntosHambre = -1;
            vivo = false;
        }
    }
    
    public void checkEsfuerzo(){
        if (this.vidas < 1){
            this.vidas--;
            this.vidas = MAX_ESFUERZO;
        }
    }
    
    public void checkHambre(){
        if (this.vidas < 1){
            this.vidas--;
            this.vidas = MAX_HAMBRE;
        }
    }
}
