package practico2.Series;

import java.util.ArrayList;

public class Serie extends ElementoSerie {

    private ArrayList<Temporada> temporada;
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;

    public Serie(String titulo,String descripcion, String creador, String genero) {
        temporada = new ArrayList<>();
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
    }

    public void addTemporada(Temporada te){
        temporada.add(te);
    }
    public void deleteTemporada(Temporada te){
        temporada.remove(te);
    }
    public boolean hasTemporada(Temporada te){
        return temporada.contains(te);
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int totalVistos() {
        int total=0;
        for(int i=0;i<temporada.size();i++){
            total+=temporada.get(i).totalVistos();
        }
        return total;
    }

    @Override
    public int promedioCalificaciones() {
        int promedio=0;
        int total=0;
        for(int i=0;i<temporada.size();i++){
            total+=temporada.get(i).promedioCalificaciones();
        }
        promedio=(total/temporada.size());
        return promedio;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "temporada=" + temporada +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", creador='" + creador + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
