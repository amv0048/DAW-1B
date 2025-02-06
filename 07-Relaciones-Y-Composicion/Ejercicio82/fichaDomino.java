package Ejercicio82;

public class fichaDomino {
    private int[] ficha;
    private int left, right;
    
    public fichaDomino(int right, int left){
        this.ficha = new int[2];
        if (checkNumbers()){
            this.right = right;
            this.left = left;
            ficha[1] = this.right;
            ficha[0] = this.left;
        }      
    }
    
    public Boolean encaja(fichaDomino a){
        if (a.checkNumbers() && checkLados(a))
            return true;
        return false;
    }
    
    public boolean checkNumbers(){
        if (right >= 0 && left >= 0)
            return true;
        return false;
    }
    
    public boolean checkLados(fichaDomino a){
        if (a.left == this.right || a.right == this.left)
            return true;
        return false;
    }
    
    public void voltear(){
        int aux = this.right;
        this.right = this.left;
        this.left = aux;
        
    }
    
    @Override
    public String toString(){
        String res = "["+this.left+" - "+this.right+"]";
        return res;
    }
}
