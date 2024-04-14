package practico8.SitioDeNoticias;

import java.util.ArrayList;

public class compuesto extends repo {
    //Puede ser una categoria, seccion o sub-seccion
    private String descripcion;
    private String imagenAsociada;
     private ArrayList<repo> noticias;

    public compuesto(String nombre, String descripcion, String imagenAsociada) {
        super.setNombre(nombre);
        this.descripcion = descripcion;
        this.imagenAsociada = imagenAsociada;
        noticias = new ArrayList<repo>();
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

    public void addElemento (repo R) {
        noticias.add(R);
    }

    public void removeNoticia (Noticia N) {
        noticias.remove(N);
    }

    public repo getNoticia(int pos) {
        return noticias.get(pos);
    }

    @Override
    public int getCantidad() {
        int resultado = 0;
        for (repo noti:noticias) {
            resultado += noti.getCantidad();//llama a getCantidad de cada objeto repo
        }
        return resultado;
    }

    @Override
    public String listar_sitio() {
        String S=" ";
        for (repo noti:noticias)
            S += noti.listar_sitio();//llama a cada listar_sitio de cada objeto repo
        return this.getNombre() + S;
    }

    public String mostrarNombre() {
        return ("/" + this.getNombre());
    }
}
