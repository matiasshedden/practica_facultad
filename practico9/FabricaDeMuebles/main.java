package practico9.FabricaDeMuebles;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        Fabrica F1 = new Fabrica();
        LocalDate fechalimite1 = LocalDate.parse("2023-07-06");
        LocalDate fechalimite2 = LocalDate.parse("2023-07-01");
        LocalDate fechalimite3 = LocalDate.parse("2023-06-29");

        Mueble m1 = new Mueble("pino", fechalimite1, 500, 1000);//ganancia 500
        Mueble m2 = new Mueble("cedro", fechalimite1, 900, 1000);//ganancia 100
        Mueble m3 = new Mueble("arce", fechalimite2, 800, 1000);//ganancia 200
        Mueble m4 = new Mueble("haya", fechalimite3, 100, 1000);//ganancia 900

        F1.agregarPedido(m1);
        F1.agregarPedido(m2);
        F1.agregarPedido(m3);
        F1.agregarPedido(m4);

        //System.out.println("Pedido en orden de menor a mayor");
        //F1.mostrarPedidos();

        ArrayList<Mueble> pedido1 = new ArrayList<>();
        pedido1.add(m1);
        pedido1.add(m2);
        pedido1.add(m3);
        pedido1.add(m4);
        System.out.println("Orden de ingreso");
        System.out.println(pedido1);
        System.out.println("orden natural");
        Collections.sort(pedido1);
        System.out.println(pedido1);
    }
}
