package Ejercicio88;

import Ejercicio87.*;

public class Carta {
    private int num;
    private String forma;

    public Carta(int num, String forma) {
        this.num = num;
        this.forma = forma;
    }
    
    public String toString(){
        return "["+this.num+ " - "+this.forma+"]";
    }
    
    public void setForma(String forma){
        this.forma = forma;
    }
    
    public void setNum(int num){
        this.num = num;
    }
    
}
