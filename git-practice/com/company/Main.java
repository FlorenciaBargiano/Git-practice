import Model.Persona;

import java.util.Arrays;

public class Main {

    static Persona personas[] = new Persona[5];

    public static void main(String[] args) {
        System.out.println("cualquier cosa");
        initializeArray();
        System.out.println("Nombre: " + esNombre("Carolina"));
        System.out.println("Promedio edades: " + obtenerPromedioEdades());
        System.out.println("Menor: " + obtenerMenorEdad());
        System.out.println("Menores o iguales a 10: " + obtenerCantidadMenoresOIgualesA10());
    }

    public static void initializeArray() {
        Persona persona = new Persona("Marcela", "Rivadavia", 17961711, 17);
        personas[0] = persona;
        Persona persona1 = new Persona("Marcos", "Carrafero", 17962711, 13);
        personas[1] = persona1;
        Persona persona2 = new Persona("Carolina", "Pedraza", 17961721, 14);
        personas[2] = persona2;
        Persona persona3 = new Persona("Camila", "Peroni", 15961723, 10);
        personas[3] = persona3;
        Persona persona4 = new Persona("Florencia", "Bertotti", 39543537, 7);
        personas[4] = persona4;
    }

    public static Persona esNombre(String nombre) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].nombre == nombre) {
                return personas[i];
            }
        }
        return null;
    }

    public static double obtenerPromedioEdades() {
        long suma = 0;
        double promedio = 0;

        for (int i = 0; i < personas.length; i++) {
            suma = suma + personas[i].edad;
        }

        promedio = suma / personas.length;
        return promedio;
    }

    public static long obtenerMenorEdad() {
        long menorEdad = personas[0].edad;
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].edad < menorEdad)
                menorEdad = personas[i].edad;
        }

        return menorEdad;
    }

    public static long obtenerCantidadMenoresOIgualesA10() {

        long menoresDe10Años = 0;
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].edad <= 10)
                menoresDe10Años =menoresDe10Años+1;
        }
        return menoresDe10Años;
    }
}
