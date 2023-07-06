package prefinal2022;

import java.time.LocalDate;
import java.util.ArrayList;

public class Tema extends ElementoT {

    private String titulo;
    private String descripcion;
    private ArrayList<String> palabrasClave;
    private String ejeTematico;
    private String autor;
    private ArrayList<Comentario> comentarios=null;
    private Tema asociado=null;
    private LocalDate fechaCaducidad=null;

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
    }

    public Tema(String titulo, String descripcion, String ejeTematico, String autor) {
        //Genera tema completo, el resto se genera con los setters
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.ejeTematico = ejeTematico;
        this.autor = autor;
        palabrasClave = new ArrayList<>();
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

    @Override
    public String getejeTematico() {
        return this.ejeTematico;
    }
}
