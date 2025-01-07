package Ejercicio70;

public class Hora {
    int segundos;
    int minutos;
    int horas;

    public Hora(int horas, int minutos, int segundos) {  
        this.segundos = segundos;
        this.minutos = minutos;
        this.horas = horas;
        while (segundos > 60) {            
            this.minutos++;
            segundos -= 60;
            this.segundos = segundos;
        }
        while (minutos > 60) {            
            this.horas++;
            minutos -= 60;
            this.minutos = minutos;
        } 
    }
    
    public Hora(int horas){
        this.horas = horas;
    }
    
    public Hora(int horas, int minutos){
        this.horas = horas;
        this.minutos = minutos;
        while (minutos > 60) {            
            this.horas++;
            minutos -= 60;
            this.minutos = minutos;
        } 
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "horas: " + horas + "\n"+
                "minutos: " + minutos + "\n"+
                "segundos: " + segundos + "\n";
    }

}
