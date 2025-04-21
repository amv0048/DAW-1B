package Ejercicio94;

public class ProfesorUniversidad extends Profesor {
    private boolean investigar;
    private int horasInvestigacion;
    String nombre;

    public ProfesorUniversidad(String nombre, int numAsignaturas, int num) {
        super(nombre, numAsignaturas);
        this.nombre = nombre;
        cantidadAsig = (int)(Math.random() * numAsignaturas + 1);
        rellenarArray(numAsignaturas);
        enClase = false;
        
        for (int i = 0; i < asignaturas.length; i++){
            if (asignaturas[i] != null)
                this.horasTotales += asignaturas[i].getNumHoras();
        }
    }
    
    protected void investigar(int horasTotales){
        if (this.horasTotales >= 8 && !this.enClase){
            investigar = true;
            System.out.println(this.nombre +" esta investigando");
        }
        else System.out.println(this.nombre+" no puede investigar");
            
    }
    
    protected void pararDeInvestigar(){
        if (investigar)
            investigar = false;
    }
    
    protected void cogerAsignatura(Asignatura nueva){
        int cont = 0, i = 0;
        if (hueco() && this.horasTotales <= 25){
            while (cont == 0){
                if (this.asignaturas[cont] == null){
                    this.asignaturas[cont] = nueva;
                    cont++;
                }
                i++;
            }
        }
    }
    
    protected void abandonarAsignatura(){
        this.horasTotales = 0;
        for (int i = asignaturas.length; i < 0; i--) {
            if (asignaturas[i] != null){
                asignaturas[i] = null;
            }
            this.horasTotales += asignaturas[i].getNumHoras();
            
        }
    }

    @Override
    public String toString() {
        return "ProfesorDeUniversidad{" + "investigar="
                + investigar + ", horasInvestigacion="
                + horasInvestigacion + ", nombre=" + this.nombre
                + '}';
    }
    
    @Override
    protected void parar() {
        super.parar();
    }

    @Override
    protected void empezarClase() {
        if (!investigar && !this.enClase)
            super.empezarClase();
        else if (!this.enClase){
            this.parar();
            super.empezarClase();
        }
        else{
            pararDeInvestigar();
            super.empezarClase();
        }
    }

    // Utils
    
    private boolean hueco(){
        for (int i = 0; i < asignaturas.length; i++) {
            if (asignaturas[i] == null)
                return true;
        }
        return false;
    }

    @Override
    protected Asignatura[] rellenarArray(int numAsignaturas) {
        return super.rellenarArray(numAsignaturas);
    }
}