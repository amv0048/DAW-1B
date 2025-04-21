package Ejercicio94;


public class Main {
    public static void main(String[] args) {
        // Crear un profesor normal
        Profesor profesor1 = new Profesor("Juan Pérez", 5);
        System.out.println(profesor1); // Mostrar los detalles del profesor
        profesor1.empezarClase(); // El profesor empieza a dar clase
        profesor1.parar(); // El profesor para de dar clase

        // Crear un profesor universitario con más horas de investigación
        ProfesorUniversidad profesor2 = new ProfesorUniversidad("Ana García", 5, 15);
        System.out.println(profesor2); // Mostrar los detalles del profesor universitario
        profesor2.empezarClase(); // El profesor universitario empieza a dar clase
        profesor2.parar(); // El profesor universitario para de dar clase

        // Probar el comportamiento de investigación
        System.out.println();
        profesor2.investigar(9); // El profesor universitario empieza a investigar
        profesor2.parar();// El profesor universitario para de investigar

        // Añadir y eliminar asignaturas
        Asignatura nuevaAsignatura = new Asignatura(120, 5);
        profesor2.cogerAsignatura(nuevaAsignatura); // El profesor universitario coge una nueva asignatura
        profesor2.abandonarAsignatura(); // El profesor universitario abandona una asignatura

        // Mostrar el estado final del profesor
        System.out.println(profesor2);
    }
}

