package practico7.plataformaPeliculas;

public class pelicula {
    private String titulo;
    private String genero;
    private String director;
    private String actor;
    private int anio;
    private int duracion;
    private int edad_minima;

    public pelicula(String titulo, String genero, String director, String actor, int anio, int duracion, int edad_minima) {
        this.titulo = titulo;
        this.genero = genero;
        this.director = director;
        this.actor = actor;
        this.anio = anio;
        this.duracion = duracion;
        this.edad_minima = edad_minima;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdad_minima() {
        return edad_minima;
    }

    public void setEdad_minima(int edad_minima) {
        this.edad_minima = edad_minima;
    }

    @Override
    public String toString() {
        return "pelicula{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", director='" + director + '\'' +
                ", actor='" + actor + '\'' +
                ", anio=" + anio +
                ", duracion=" + duracion +
                ", edad_minima=" + edad_minima +
                "}´\n´";
    }
}
