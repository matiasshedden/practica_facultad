package practico8.Aseguradora;

import practico8.Aseguradora.Busquedas.CondicionBusqueda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SeguroIntegrador extends Componedor {

    private ArrayList<Componedor> seguros;
    private Comparator<Componedor> criterio;

    public SeguroIntegrador(int dni) {
        super.setDni_asegurado(dni);
        seguros = new ArrayList<Componedor>();
    }

    public void addSeguro(Componedor S) { seguros.add(S); }

    @Override
    public float get_monto() {
        float aux=0;
        for(Componedor S:seguros)
            aux += S.get_monto();
        return aux;
    }

    //En aux guardo cada objeto del arreglo mientras que resultado almacena el nro de poliza mayor
    @Override
    public int get_nro_poliza() {
        Componedor aux;
        int resultado = 0;
        for (int i = 0; i < seguros.size()-1; i++) {
            aux = seguros.get(i);
            if (aux.get_nro_poliza() < seguros.get(i+1).get_nro_poliza())
                resultado = aux.get_nro_poliza();
                aux= seguros.get(i+1);
        }
        return resultado;
    }

    @Override
    public void ordenarXCriterio(Comparator<Componedor> criterio) {
        this.criterio = criterio;
        Collections.sort(seguros, criterio);
    }

    public ArrayList<Seguro> buscar(CondicionBusqueda cond) {
        ArrayList resultado = new ArrayList<Seguro>();
        for (Componedor s:seguros) {
            if (cond.cumple((Seguro) s))
                    resultado.add(s);
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "{" + seguros + '}';
    }
}
