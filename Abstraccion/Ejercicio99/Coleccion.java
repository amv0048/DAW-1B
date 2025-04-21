package Abstraccion.Ejercicio99;

public class Coleccion {
    private int contador;
    private int[] array;
    private final int TAM;
    
    public Coleccion(){
        this.TAM = 10;
        this.array = new int[TAM];
        this.contador = array.length;
    }
    
    public Coleccion(int num){
        this.TAM = 10;
        if (num <= 0)
            this.array = new int[TAM];
        else
            this.array = new int[num];
        this.contador = array.length;
    }
    
    public int getElementos(){
        return this.contador;
    }
    
    public int getElementos(int pos){
        if (array[pos] <= 0 && array[pos] >= array.length)
            return -1;
        return array[pos];
    }
    
    public boolean sinElementos(){
        for (int i = 0; i < this.array.length; i++) {
            if (array[i] != 0)
                return false;
        }
        return true;
    }
    
    public void aniadir(int elemento){
        if (!lleno()){
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0)
                    elemento = array[i];
            }
        }   
    }
    
    public void eliminar(int elemento){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemento)
                array[i] = 0;
        }
    }
    
    public boolean contiene(int elemento){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemento)
                return true;
        }
        return false;
    }
    
    public String toString(){
        String res = "[";
        
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1)
                res += "]";
            res += array[i]+ " ";
        }
        return res;
    }
    
    // Utils
    
    public boolean lleno(){
        for (int i = 0; i < this.array.length; i++) {
            if (array[i] == 0)
                return false;
        }
        return true;
    }
    
}
