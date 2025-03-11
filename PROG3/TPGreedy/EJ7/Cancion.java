package EJ7;

public class Cancion {

    private String nombre;
    private String genero;
    private int duracion;
    private int tamanio;

    public Cancion(String nombre, String genero, int duracion, int tamanio) {
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getTamanio() {
        return tamanio;
    }

    @Override
    public String toString() {
        return "Cancion: " + nombre + " " + genero + " " + duracion + " "
                + tamanio + '\n';
    }
}
