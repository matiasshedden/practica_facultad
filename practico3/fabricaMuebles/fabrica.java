package practico3.fabricaMuebles;

import java.util.ArrayList;

public class fabrica {
    final int recargo = 35;
    ArrayList <producto> P;

    //double precio_venta; Este va?

    public fabrica() {
        this.P = new ArrayList<>();
    }

    public void addProductos(producto Prod) {
        P.add(Prod);
    }
    public int getRecargo() {
        return recargo;
    }

    public double getPrecioCostodeVenta() {
        double aux=0;
        for(int i=0;i< P.size();i++)
            aux+=P.get(i).costo_fab;
        return aux;
    }

}
