package practico8.SitioDeNoticias;

import java.util.ArrayList;

public class Noticia extends repo {
    private String titulo;
    private ArrayList<String> palabrasClave;
    private String intro;
    private String texto;
    private String autor;
    private String link;

    public Noticia(String nombre, String titulo, String intro, String texto, String autor, String link) {
        super.setNombre(nombre);
        this.titulo = titulo;
        this.intro = intro;
        this.texto = texto;
        this.autor = autor;
        this.link = link;
    }

    public void addPalabraClave (String P) {
        palabrasClave.add(P);
    }

    public void removePalabraClave (String P) {
        palabrasClave.remove(P);
    }

    @Override
    public int getCantidad() {
        return 1 ;
    }

    @Override
    public String listar_sitio() {
        return "/" + link;
    }

    public String mostrarNombre() {
        return getNombre();
    }

}
