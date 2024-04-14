package practico8.wbe;

import java.util.Objects;

public class Recurso {
    //pueden ser materiales o personas
    private String descripcion;

    //puede ser "exclusivo" o "compartido"
    private String tipo;

    public Recurso (String desc, String type) {
        this.descripcion = desc;
        this.tipo = type;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "descripcion: " + descripcion + " tipo: " + tipo + '\n';
    }

    //para utilizar el contains los objetos deben poder redefinir el equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recurso recurso = (Recurso) o;
        return Objects.equals(descripcion, recurso.descripcion) && Objects.equals(tipo, recurso.tipo);
    }

}
