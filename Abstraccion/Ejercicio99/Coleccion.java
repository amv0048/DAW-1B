package Abstraccion.Ejercicio99;

public abstract class Coleccion {
    private int contador;
    private int[] array;
    protected static final int TAM = 10;
    
    public Coleccion(){
        this.array = new int[TAM];
        this.contador = 0;
    }
    
    public Coleccion(int num){
        if (num <= 0)
            this.array = new int[TAM];
        else
            this.array = new int[num];
        this.contador = 0;
    }
    
    public int getElementos(){
        return this.contador;
    }
    
    public int getElemento(int pos){
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
    
    public abstract void aniadir(int elemento);
    
    public abstract void eliminar(int elemento);
    
    public boolean contiene(int elemento){
        for (int i = 0; i < this.contador; i++) {
            if (this.array[i] == elemento)
                return true;
        }
        return false;
    }
    
    public String toString(){
        String res = "[";
        
        for (int i = 0; i < contador; i++) {
            if (i < contador-1)
                res += array[i]+ " ";
            else res+= array[i]+"]";
        }
        return res;
    }

    public int getContador() {
        return this.contador;
    }  
}
