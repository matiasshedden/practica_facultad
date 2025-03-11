package EJ3;

public class Actividad {

    private String nombre;
    private int comienzo;
    private int fin;

    public Actividad(String nombre, int comienzo, int fin) {
        this.nombre = nombre;
        this.comienzo = comienzo;
        this.fin = fin;
    }

    public String getNombre() {
        return nombre;
    }

    public int getComienzo() {
        return comienzo;
    }

    public int getFin() {
        return fin;
    }

    @Override
    public String toString() {
        return nombre + " " + comienzo + " " + fin + '\'';
    }
}
