package practico9.FabricaDeMuebles;

import java.awt.*;
import java.util.ArrayList;

public class Fabrica {
    private ColaDeEspera pedidos;

    //Constructor
    public Fabrica() { pedidos = new ColaDeEspera(); }

    public void agregarPedido(Mueble M) { pedidos.agregarElemento(M); }

    public void mostrarPedidos() {
        System.out.println(pedidos);
    }

}
