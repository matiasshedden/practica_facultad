package prefinal2022;

import java.time.LocalDate;
import java.util.ArrayList;

import prefinal2022.condicionesBusqueda.busqueda;

public class Tema extends ElementoT {

    private String titulo;
    private String descripcion;
    private ArrayList<String> palabrasClave;
    private String ejeTematico;
    private String autor;
    private ArrayList<Comentario> comentarios;
    private Tema asociado;
    private LocalDate fechaCaducidad;

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getAutor() {
        return autor;
    }

    public Tema getAsociado() {
        return asociado;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public Tema(String titulo, String descripcion) {
        //Genera Tema especial
        this.titulo = titulo;
        this.descripcion = descripcion;
        palabrasClave = new ArrayList<>();
        comentarios = new ArrayList<>();
    }

    public Tema(String titulo, String descripcion, String ejeTematico, String autor) {
        //Genera tema completo, el resto se genera con los setters
        this(titulo, descripcion);
        this.ejeTematico = ejeTematico;
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEjeTematico(String ejeTematico) {
        this.ejeTematico = ejeTematico;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAsociado(Tema asociado) {
        this.asociado = asociado;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getEjeTematico() {
        return ejeTematico;
    }

    public ArrayList<Comentario> getComentarios() {
        ArrayList<Comentario> aux = null;
        if (comentarios.size() > 0)
            aux = new ArrayList<Comentario>(comentarios);
        return aux;
    }

    public void agregarComentario(Comentario C) {
        comentarios.add(C);
    }
    public void addpalabraClave(String palabra) {
        //Controla que no haya repetidos
        if (!palabrasClave.contains(palabra))
                palabrasClave.add(palabra);
    }
    @Override
    public ArrayList<String> getpalabrasClaves() {
        ArrayList<String> aux = new ArrayList<>();
        for (int i = 0; i < palabrasClave.size(); i++) {
            aux.add(i, palabrasClave.get(i));
        }
        return aux;
    }

    public boolean contienePalabraClave(String palabra) {
        return palabrasClave.contains(palabra);
    }


    @Override
    public String getejeTematico() {
        return this.ejeTematico;
    }

    public boolean contieneComentarioAutor(String autorComentario) {
        //Busco en la lista de comentarios si existe el autor del mismo y devuelvo true
        for (int i = 0; i < comentarios.size(); i++) {
            Comentario comen = comentarios.get(i);
            if (comen.getAutor().equals(autorComentario))
                return true;
        }
        return false;
    }

    public boolean contieneComentarioTexto(String texto) {
        //Busco en la lista de comentarios si existe el texto ingresado y devuelvo true
        for (int i = 0; i < comentarios.size(); i++) {
            Comentario comen = comentarios.get(i);
            if (comen.getTexto().equals(texto))
                return true;
        }
        return false;
    }

    public ArrayList<Tema> buscarTema(busqueda condicion) {
        ArrayList<Tema> aux = new ArrayList<>();
        if (condicion.cumple(this))
            aux.add(this);
        return aux;
    }

}
