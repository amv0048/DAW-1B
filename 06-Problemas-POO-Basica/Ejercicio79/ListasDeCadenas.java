package Ejercicio79;

public class ListasDeCadenas {
    String lista[];
    
    public ListasDeCadenas(int n){
        this.lista = new String[n];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = "";
        }
    }
    
    public void aniadir(String elemento){
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == "")
                lista[i] = elemento;
            else
                System.out.println("Error");
        }
    }
    
    public void aniadir(String elemento, int pos){
        if (lista[pos] == "")
            lista[pos] = elemento;
        else
            System.out.println("Error");
    }
    
    public int tamanio(){
        return lista.length;
    }
    
    public boolean llena(){
        boolean llena = false;
        int i = 0;
        while (i < lista.length && llena) {            
            if (lista[i] == "")
                llena = false;
            else
                llena = true;
            i++;
        }
        return llena;
    }
    
    public boolean vacia(){
        boolean vacia = true;
        int i = 0;
        while (i < lista.length && vacia) {            
            if (lista[i] == "")
                vacia = true;
            else
                vacia = false;
            i++;
        }
        return vacia;
    }
    
    public String obtener(int pos){
        if (lista[pos] != "")
            return lista[pos];
        else
            return "ERROR";
    }
    
    public int buscar(String elemento){
        boolean encontrado = false;
        int i = 0;
        while (i < lista.length && encontrado) {
            if (lista[i].equals(elemento))
                encontrado = true;
        }
        if (encontrado)
            return i;
        else return -1;
    }
    
    public void borrar(){
        for (int i = 0; i < this.lista.length; i++) {
            this.lista[i] = "";
        }
    }
    
    public String borrar(int pos){
        if (pos > 0 && pos < lista.length) {
            lista[pos] = "";
            return lista[pos] + " borrado de la posicion: "+pos;
        }
        else
            return "Error";
    }
    
    public String borrar(String elemento){
        int i = 0;
        boolean borrado = false;
        while (i < lista.length && !borrado){
            if (lista[i] == elemento)
                lista[i] = "";
            i++;
        }
        if (borrado)
            return elemento + " borrado en la posicion "+ i;
        else
            return "elemento no encontrado";
    }
    
    public String[] trozo(int pos1, int pos2){
        String array[] = new String[pos2 - pos1 + 1];
        if (pos1 < 0 || pos2 < 0 ||
                pos1 < lista.length || pos2 < lista.length)
            return new String[0];
        for (int i = pos1, j = 0; i <= pos2; i++, j++) {
            array[j] = lista[i];
        }
        return array;
    }
}