package practico9.FabricaDeMuebles;

import practico9.FabricaDeMuebles.Condiciones.condicionBusqueda;

import java.util.ArrayList;

public class Fabrica {
    private ColaDeEspera pedidos;

    //Constructor
    public Fabrica() { pedidos = new ColaDeEspera(); }

    public void agregarPedido(Mueble M) { pedidos.agregarElemento(M); }

    public void mostrarPedidos() {
        System.out.println(pedidos);
    }

    public ArrayList<Mueble> buscar(condicionBusqueda cond) {
        ArrayList<Mueble> aux = new ArrayList<>();
        for (int i = 0; i < pedidos.getTamanio(); i++) {
            if (cond.cumple((Mueble)pedidos.getPosicion(i)))
                aux.add((Mueble)pedidos.getPosicion(i));
        }
        return aux;
    }
}
