package practico8.Aseguradora;

import java.util.Comparator;

public abstract class Componedor {

    private int dni_asegurado;

    public int getDni_asegurado() { return dni_asegurado;
    }

    public void setDni_asegurado(int dni_asegurado) { this.dni_asegurado = dni_asegurado; }

    public abstract float get_monto();

    public abstract int get_nro_poliza();

    public abstract void ordenarXCriterio(Comparator<Componedor> criterio);

}
