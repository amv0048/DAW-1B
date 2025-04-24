package Abstraccion.Ejercicio99;

public abstract class Coleccion {
    protected int contador;
    protected int[] array;
    protected static final int TAM = 10;
    
    public Coleccion(){
        this.array = new int[TAM];
        this.contador = 0;
        inicializar();
    }
    
    public Coleccion(int num){
        if (num <= 0)
            this.array = new int[TAM];
        this.array = new int[num];
        this.contador = 0;
        inicializar();
    }
    
    public int getElementos(){
        return this.contador;
    }
    
    public int getElemento(int pos){
        if (pos < 0 || pos >= array.length)
            return -1;
        return this.array[pos];
    }
    
    public boolean sinElementos(){
        return this.contador <= 0;
    }
    
    public void aniadir(int elemento){
        int i = 0;
        boolean seteado = false;
        while (i < this.array.length && !seteado) {            
            if (this.array[i] == -1){
                this.array[i] = elemento;
                seteado = true;
            }
            i++;
        }
    }
    
    public void eliminar(int elemento){
        boolean eliminado = false;
        int i = 0;
        while (i < this.array.length && !eliminado){
            if (this.array[i] == elemento){
                this.array[i] = -1;
                eliminado = true;
            }
            i++;
            this.contador--;
        }
    }
    
    public boolean contiene(int elemento){
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] == elemento)
                return true;
        }
        return false;
    }
    
    public String toString(){
        boolean primero = false;
        String res = "[";
        
        for (int i = 0; i < this.array.length; i++) {
            if (this.getElemento(i) > -1){
                if (!primero){
                    res += getElemento(i);
                    primero = true;
                }
                else
                    res += "," + getElemento(i);
            }
        }
        res+= "]";
        return res;
    }

    // Utils
    
    public int[] getArray(){
        return this.array;
    }
    
    public void setArray(int[] nuevo){
        for (int i = 0; i < this.array.length; i++) {
            nuevo[i] = this.array[i];
        }
        
    }
    
    private void inicializar(){
        for (int i = 0; i < array.length; i++) {
            array[i] = -1; // indica hueco vacio
            
        }
    }
    
    public boolean lleno(){
        return this.getElementos() == this.array.length;
    }
}
