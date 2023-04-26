package practico2.Series;

public class Episodio {

    private String titulo;
    private String descripcion;
    private boolean visto;
    private int calificacion;
    private int maxCalificacion=5;
    private int minCalificacion=1;
    private int calificacionNegativa=-1;

    public Episodio(String titulo, String descripcion, boolean visto, int calificacion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.visto = visto;
        this.calificacion = calificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public boolean isVisto() {
        return visto;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        if((calificacion>=minCalificacion)&&(calificacion<=maxCalificacion))
            this.calificacion = calificacion;
        else
            this.calificacion=calificacionNegativa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    @Override
    public String toString() {
        return "Episodio{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", visto=" + visto +
                ", calificacion=" + calificacion +
                '}';
    }
}
