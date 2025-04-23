package Abstraccion.Ejercicio99;

public class Conjunto extends Coleccion {
    private static final int TAM = 10;
    
    public Conjunto(){
        super();
    }
    
    public Conjunto(int num){
        super(num);
    }
    
    // Metodos abstractos
    @Override
    public void aniadir(int elemento) {
        if (!contiene(elemento) && !lleno()){
            setElemento(elemento);
        }
        else {
            
            
        }
    }

    @Override
    public void eliminar(int elemento) {
        boolean eliminado = false;
        int i = 0;
        while (i <= this.getElementos() && !eliminado){
            if (getArray()[i] == elemento){
                getArray()[i] = 0;
                eliminado = true;
            }
            i++;
        }
    }
    
    public Conjunto union(Conjunto a){
        int cont = 0;
        
        for (int i = 0; i < getElementos(); i++) {
            if (!contiene(a.array[i]))
                cont++;
        }
        cont += this.contador;
        
        Conjunto result = new Conjunto(cont);
        
        for (int i = 0; i < this.contador; i++) {
            result.aniadir(getArray()[i]);
        }
        for (int i = 0; i < this.contador; i++) {
            if (!result.contiene(a.array[i]))
                result.aniadir(a.array[i]);
        }
        System.out.println("cont: "+cont);
        System.out.println("a: "+this.contador);
        System.out.println("this: "+this.contador);
        System.out.println("result: "+result.array.length);
        
        return result;
    }
    
    public Conjunto interseccion(Conjunto a){
        int cont = 0;
        for (int i = 0; i < this.getElementos(); i++) {
            if (a.contiene(this.getArray()[i]))
                cont++;
        }
        Conjunto result = new Conjunto(cont);
        
        for (int i = 0; i < this.getElementos(); i++) {
            if (a.contiene(this.getArray()[i]))
                result.aniadir(this.getArray()[i]);
        }
        return result;
    }

    @Override
    public int getElementos() {
        return super.getElementos(); 
    }
    
    
    
    
    
    // Utils
    
    
}
