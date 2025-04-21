package Ejercicio94;

public class Profesor{
    private String nombre;
    protected Asignatura asignaturas[];
    protected int cantidadAsig;
protected boolean enClase;
    protected int horasTotales;

    public Profesor(String nombre, int numAsignaturas) {
        this.nombre = nombre;   
        cantidadAsig = (int)(Math.random() * numAsignaturas + 1);
        rellenarArray(numAsignaturas);
        enClase = false;
        
        for (int i = 0; i < asignaturas.length; i++){
            if (asignaturas[i] != null)
                horasTotales += asignaturas[i].getNumHoras();
        }
    }
    
    protected void empezarClase(){
        enClase = true;
        int numNull = 0;
        
        for (int i = 0; i < asignaturas.length; i++) {
            if (asignaturas[i] == null)
                numNull++;
        }
        System.out.println(numNull);
        int asigAleatoria = (int)(Math.random() * 
                (this.asignaturas.length - numNull) + numNull);
        
        Asignatura clase = asignaturas[asigAleatoria];
        System.out.println(this.nombre +" esta dando clase de "+
                clase.getCodigo());
    }
    
    protected void parar(){
        if (enClase)
            System.out.println(this.nombre + 
                    " ha finalizado de dar clase");
    }

    @Override
    public String toString() {
        String asig = "";
        
        for (int i = 0; i < asignaturas.length; i++) {
            if (asignaturas[i] != null)
                asig = asignaturas[i].toString() + "\n";
            
        }
        return "Profesor{" + "nombre=" + nombre +
                ", cantidadAsig=" + cantidadAsig +
                ", enClase=" + enClase + 
                ", horasTotales=" + horasTotales +
                asig;
    }
    
    // Utils
    
    protected Asignatura[] rellenarArray(int numAsignaturas){
        asignaturas = new Asignatura[numAsignaturas];
       
        for (int i = 0; i < numAsignaturas; i++) {
           int codigoAleatorio = (int)(Math.random() * 100 + 100);
           int horasAleatorias = (int)(Math.random() * (8-3) + 3);
           asignaturas[i] = new Asignatura(codigoAleatorio, 
                   horasAleatorias);
        }
        return asignaturas;
    }
}