package EJ6_BusquedaLibros;

import java.util.Random;

public class Libro {

    private int ISBN;
    private String titulo;
    private String autor;
    private String genero;
    private int anioPublicacion;
    private int cant_ejemplares;

    public Libro(String titulo, String autor, String genero, int anioPublicacion, int cantidad) {
        this.ISBN = generarISBN();
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anioPublicacion = anioPublicacion;
        this.cant_ejemplares = cantidad;
    }

    //REGRESO UN NRO RANDOM ENTRE 1 Y 10
    private int generarISBN() {
        Random random = new Random();
        return random.nextInt(9) + 1;
    }
    public int getISBN() { return ISBN; }

    public String getTitulo() { return titulo; }

    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }

    public void setAutor(String autor) { this.autor = autor; }

    public String getGenero() { return genero; }

    public void setGenero(String genero) { this.genero = genero; }

    public int getAnioPublicacion() { return anioPublicacion; }

    public void setAnioPublicacion(int anioPublicacion) { this.anioPublicacion = anioPublicacion; }

    public int getCant_ejemplares() { return cant_ejemplares; }

    public void setCant_ejemplares(int cant_ejemplares) { this.cant_ejemplares = cant_ejemplares; }

    @Override
    public String toString() {
        return "Libro: " + ISBN + " " + titulo + " " + autor + " " + genero + " " + anioPublicacion +
                " " + cant_ejemplares +'\n';
    }
}
