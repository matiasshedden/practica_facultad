package practico8.SitioDeNoticias;

public abstract class repo {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract int getCantidad();

    public abstract String listar_sitio();
    
    @Override
    public String toString() {
        return "{/" + nombre + "}";
    }
}
