package Ejercicio78;


public class Estudiante {
    private String nombre;
    private String apellidos;
    private double listaNotas[];
    
    public Estudiante(String nombre, String apellidos,
            int n){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.listaNotas = new double[n];
        for (int i = 0; i < listaNotas.length; i++) {
            this.listaNotas[i] = -1;
        }
    }
    
    public void insertarNota(double nota){
        int i = 0;
        boolean notaPuesta = false;
        while (i < listaNotas.length
                && !notaPuesta) {            
            if (listaNotas[i] == -1){
                listaNotas[i] = nota;
                notaPuesta = true;
            }
            i++;
        }
    }
    
    public String mostrarNotas(){
        String lista = "";
        for(int i = 0; i < this.listaNotas.length; i++){
            if (listaNotas[i] != -1)
                lista += listaNotas[i] + "\n";
        }
        return lista;
    }
    
    public double calcularMedia(){
        double suma = 0;
        for (int i = 0; i < listaNotas.length; i++) {
            if (listaNotas[i] != -1)
                suma += listaNotas[i];
        }
        return suma/listaNotas.length;
    }
    
    public String indicarRangos(){
        int insuficientes = 0, suficientes = 0, 
                notables = 0, sobresalientes = 0;
        for (int i = 0; i < listaNotas.length; i++) {
            switch ((int)listaNotas[i]) {
                case 0,1,2,3,4:
                    insuficientes++;
                    break;
                case 5,6:
                    suficientes++;
                    break;
                case 7,8:
                    notables++;
                    break;
                case 9,10:
                    sobresalientes++;
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }
        }
        return "Insuficientes: "+ insuficientes + "\n"
                + "Suficientes: "+ suficientes + "\n"
                + "Notables: "+ notables + "\n"
                + "Sobresalientes: "+ sobresalientes + "\n";
    }

    @Override
    public String toString() {
        String lista = "";
        for (int i = 0; i < listaNotas.length; i++) {
            lista += listaNotas[i] + ", ";
            
        }
        return "Nombre: " + nombre + 
                ", Apellidos: " + apellidos 
                + ", Notas: " + lista +
                "\nRangos: " +indicarRangos()+
                "\nMedia: " +calcularMedia();
                       
    }
}