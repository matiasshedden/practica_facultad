package practico8.Aseguradora;

import java.util.Comparator;

//Cada seguro tiene que tener un valor declarado para poder calcular su poliza??
public class Seguro extends Componedor {
    private int nro_poliza;
    private String descripcion;
    private TipoSeguro tipo;
    //private float monto_seguro;??

    public Seguro(int dni, int np, String desc, TipoSeguro tipos) {
        super.setDni_asegurado(dni);
        this.nro_poliza = np;
        this.descripcion = desc;
        this.tipo = tipos;
    }

    public String getDescripcion() { return descripcion; }

    public TipoSeguro getTipo() { return tipo; }

    @Override
    public float get_monto() {
        return tipo.get_monto();
    }

    @Override
    public int get_nro_poliza() {
        return nro_poliza;
    }

    @Override
    public void ordenarXCriterio(Comparator<Componedor> criterio) { }

    @Override
    public String toString() {
        return '\n' + "nro_poliza=" + nro_poliza + ", descripcion='" + descripcion + "Monto: " + get_monto();
    }
}
