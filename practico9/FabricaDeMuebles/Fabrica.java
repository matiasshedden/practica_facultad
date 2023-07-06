package practico9.FabricaDeMuebles;

import practico9.FabricaDeMuebles.CondicionesBusqueda.condicionBusqueda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Fabrica {
    private ArrayList<Mueble> pedidos;
    private condicionBusqueda PoliticaAceptacion;
    private Comparator<Mueble> orden;

    //Constructor
    public Fabrica(condicionBusqueda Criterio, Comparator<Mueble> orden) {
        pedidos = new ArrayList<>();
        this.PoliticaAceptacion = Criterio;
        this.orden = orden;
    }

    public void agregarPedido(Mueble M) {
        if (PoliticaAceptacion.cumple(M))
            this.agregarMueble(M);
    }

    //Con el comparador puedo definir la forma de ordenamiento
    private void agregarMueble(Mueble nuevo){
        boolean inserto = false;
        int i = 0;
        while (!inserto && i<pedidos.size()) {
            if (orden.compare(pedidos.get(i), nuevo) > 0)
                i++;
            else
                inserto = true;
        }
        if (!inserto)
            pedidos.add(nuevo);
        else
            pedidos.add(i, nuevo);
    }

    public void removeMueble(Mueble M) {
        pedidos.remove(M);
    }

    public void mostrarPedidos() {
        System.out.println(pedidos);
    }

    public ArrayList<Mueble> buscar(condicionBusqueda cond) {
        ArrayList<Mueble> aux = new ArrayList<>();
        for (int i = 0; i < pedidos.size(); i++) {
            if (cond.cumple(pedidos.get(i)))
                aux.add(pedidos.get(i)); }
        return aux;
    }

    public condicionBusqueda getPoliticaAceptacion() {
        return PoliticaAceptacion;
    }

    public void setPoliticaAceptacion(condicionBusqueda politicaAceptacion) {
        PoliticaAceptacion = politicaAceptacion;
    }

    public Comparator<Mueble> getOrden() {
        return orden;
    }

    //Al setear una nueva forma de ordenamiento, ordeno los pedidos
    public void setOrden(Comparator<Mueble> orden) {
        this.orden = orden;
        Collections.sort(pedidos, orden);
    }

    public double gananciaEsperada() {
        double total=0;
        for (Mueble M:pedidos)
            total += M.getGanancia();
        return total;
    }
}
