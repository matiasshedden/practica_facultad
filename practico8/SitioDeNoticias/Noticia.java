package practico8.SitioDeNoticias;

import java.util.ArrayList;

public class Noticia extends repo {
    private String titulo;
    private ArrayList<String> palabrasClave;
    private String intro;
    private String texto;
    private String autor;
    private String link;

    public Noticia(String titulo, String intro, String texto, String autor, String link) {
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
        return 1;
    }
}
