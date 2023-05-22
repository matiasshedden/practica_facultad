package practico5.SombreroSeleccionador;



public class Main {
    public static void main(String[] args) {

        Alumno A1 = new Alumno("pepe");
        Alumno A2 = new Alumno("Juancito");
        Alumno A3 = new Alumno("Roberto");
        A1.addcualidad("valentia");
        A1.addcualidad("gentileza");
        A2.addcualidad("valentia");
        A2.addcualidad("bondad");
        A3.addcualidad("valentia");
        A3.addcualidad("gentileza");
        Casa C1 = new Casa("Slithering");
        C1.addcualidad("valentia");
        C1.addcualidad("gentileza");

        Sombrero S1 = new Sombrero();
        if (S1.aceptaAlumno(C1, A1))
            System.out.println("Alumno " + A1.getNombre() + " fue aceptado en " + C1.getNombre());
        else
            System.out.println("Alumno " + A1.getNombre() + " NO fue aceptado en " + C1.getNombre());
        if (S1.aceptaAlumno(C1, A3))
            System.out.println("Alumno " + A3.getNombre() + " fue aceptado en " + C1.getNombre());
        else
            System.out.println("Alumno " + A3.getNombre() + " NO fue aceptado en " + C1.getNombre());
        System.out.println("Cantidad alumnos: " + C1.getCant_alumnos());
    }
}