package Abstraccion.Ejercicio99;

public class Conjunto extends Coleccion {
    private int contador;
    private int[] array;
    private static final int TAM = 10;
    
    public Conjunto(){
        this.array = new int[TAM];
        this.contador = 0;
    }
    
    public Conjunto(int num){
        if (num <= 0)
            this.array = new int[TAM];
        else
            this.array = new int[num];
        this.contador = 0;
    }
    
    // Metodos abstractos
    @Override
    public void aniadir(int elemento) {
        if (!contiene(elemento) && !lleno()){
            this.array[this.contador++] = elemento;
        }
        else System.out.println("No se ha podido aniadir el elemento: "+elemento);
    }

    @Override
    public void eliminar(int elemento) {
        boolean eliminado = false;
        int i = 0;
        while (i <= this.contador && !eliminado){
            if (array[i] == elemento){
                array[i] = 0;
                eliminado = true;
            }
            i++;
        }
    }
    
    
    public Conjunto union(Conjunto a){
        Conjunto result = new Conjunto(this.contador + a.getContador());
        for (int i = 0; i < this.contador; i++) {
            result.aniadir(this.array[i]);
        }
        for (int i = a.getContador(); i < result.getContador(); i++) {
            result.aniadir(a.array[i]);
        }
        return result;
    }
    
    public Conjunto interseccion(Conjunto a){
        int cont = 0;
        for (int i = 0; i < this.contador; i++) {
            if (a.contiene(this.array[i]))
                cont++;
        }
        Conjunto result = new Conjunto(cont);
        
        for (int i = 0; i < this.contador; i++) {
            if (a.contiene(this.array[i]))
                result.aniadir(this.array[i]);
        }
        return result;
    }
    
    // Metodos concretos
    
    @Override
    public String toString(){
        String res = "[";
        
        for (int i = 0; i < contador; i++) {
            if (i < contador-1)
                res += array[i]+ " ";
            else res+= array[i]+"]";
        }
        return res;
    }

    @Override
    public boolean contiene(int elemento) {
        for (int i = 0; i < this.contador; i++) {
            if (this.array[i] == elemento)
                return true;
        }
        return false;
    }

    @Override
    public boolean sinElementos() {
        return super.sinElementos();
    }

    @Override
    public int getElemento(int pos) {
        return super.getElemento(pos);
    }

    @Override
    public int getElementos() {
        return super.getElementos();
    }
    
    @Override
    public int getContador() {
        return super.getContador();
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    // Utils
    
    public boolean lleno(){
        return contador == array.length;
    }
}
