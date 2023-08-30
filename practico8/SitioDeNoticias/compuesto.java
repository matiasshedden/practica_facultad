package practico8.SitioDeNoticias;

import java.util.ArrayList;

public class compuesto extends repo {
    //Puede ser una categoria, seccion o sub-seccion
    private String descripcion;
    private String imagenAsociada;
     private ArrayList<Noticia> noticias;

    public compuesto(String descripcion, String imagenAsociada) {
        this.descripcion = descripcion;
        this.imagenAsociada = imagenAsociada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagenAsociada() {
        return imagenAsociada;
    }

    public void setImagenAsociada(String imagenAsociada) {
        this.imagenAsociada = imagenAsociada;
    }

    public void addNoticia (Noticia N) {
        noticias.add(N);
    }

    public void removeNoticia (Noticia N) {
        noticias.remove(N);
    }

    public Noticia getNoticia(int pos) {
        return noticias.get(pos);
    }

    @Override
    public int getCantidad() {
        int resultado = 0;
        for (Noticia noti:noticias) {
            resultado += getCantidad();
        }
        return resultado;
    }
}
