package Abstraccion.Ejercicio99;

public class Conjunto extends Coleccion {

    public Conjunto() {
        super();
    }
    
    public Conjunto(int num){
        super(num);
    }
    
    @Override
    public void aniadir(int elemento) {
        if (!contiene(elemento) && !lleno()){
            setElemento(elemento);
            this.contador++;
        }
        /*else {
            int nuevoArray[] = new int[this.array.length*2];
            setArray(nuevoArray);
            this.contador++;
        }*/
    }

    @Override
    public void eliminar(int elemento) {
        boolean eliminado = false;
        int i = 0;
        while (i < this.array.length && !eliminado){
            if (this.array[i] == elemento){
                this.array[i] = -1;
                eliminado = true;
                this.contador--;
            }
            i++;
        }
    }
    
    public Conjunto union(Conjunto a){
        int cont = 0;
        
        for (int i = 0; i <= a.getElementos(); i++) {
            if (!this.contiene(a.array[i]))
                cont++;
        }
        cont += this.getElementos();
        Conjunto result = new Conjunto(cont);
        
        for (int i = 0; i < result.array.length; i++) {
            result.aniadir(this.array[i]);
        }
        for (int i = 0; i < result.array.length; i++) {
            result.aniadir(a.array[i]);
        }
        System.out.println("cont: "+cont);
        System.out.println("a: "+a.getElementos());
        System.out.println("this: "+this.getElementos());
        System.out.println("result: "+result.array.length);

        return result;
    }
    
    public Conjunto interseccion(Conjunto a){
        int cont = 0;
        for (int i = 0; i <= this.getElementos(); i++) {
            if (a.contiene(this.array[i]))
                cont++;
        }
        Conjunto result = new Conjunto(cont);
        
        for (int i = 0; i < this.getElementos(); i++) {
            if (a.contiene(this.getArray()[i]))
                result.aniadir(this.getArray()[i]);
        }
        return result;
    }
}
