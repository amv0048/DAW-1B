package Ejercicio80;

public class Pila {
    private int array[];
    private int indice = 0;
    
    public Pila(int n){
        this.array = new int[n];
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = 0;
        }
    }
    
    public int insertar(int elemento){
        if (indice < this.array.length){
            this.array[indice] = elemento;
            indice++;
            return 0;
        }
        else
            System.out.println("Error");
            return -1;     
    }
    
    public int cima(){
        return this.array[0];
    }
    
    public int extraer(){
        int cima = cima();
        for (int i = 0; i < array.length - 1; i++) {
            this.array[i] = this.array[i + 1];
        }
        array[array.length -1 ] = 0;
        return cima;
    }
    
    public boolean vacia(){
        int i = 0;
        boolean vacia = true;
        while (i < this.array.length && vacia) {            
            if (this.array[i] == 0)
                i++;
            else return false;
        }
        return true;
    }
    
    public boolean llena(){
        int i = 0;
        boolean llena = true;
        while (i < array.length && llena) {            
            if (array[i] != 0)
                i++;
            else return false;
        }
        return true;
    }
    
    public void vaciar(){
        for (int i = 0; i < array.length; i++){
            array[i] = 0;
        }
    }

    @Override
    public String toString() {
        String listaArray = "";
        for (int i = 0; i < array.length; i++) {
            listaArray += "["+array[i] + "]";
        }
        return "Pila \n"
                +"array: "+listaArray;
    }
}