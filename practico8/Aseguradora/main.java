package practico8.Aseguradora;

import practico8.Aseguradora.Busquedas.BusquedaXDescripcion;
import practico8.Aseguradora.Busquedas.CondicionBusqueda;
import practico8.Aseguradora.Orden.ordenarxMonto;
import practico8.Aseguradora.Orden.ordenxNroPoliza;

import java.util.Collections;

public class main {
    public static void main(String[] args) {
        Seguro S1 = new Seguro(10, 001, "Vida", new PorcValorAsegurado(100, 30));
        Seguro S2 = new Seguro(11, 002, "Hogar", new Combinado(new MontoFijo(100, 50),
                                new PorcValorAsegurado(100, 10)));
        Seguro S3 = new Seguro(12, 003, "Auto Fijo", new MontoFijo(200, 10));
        Seguro S4 = new Seguro(13, 004, "Auto a porcentaje", new PorcValorAsegurado(200, 10));
        Seguro S5 = new Seguro(10, 005, "Vida", new PorcValorAsegurado(100, 50));
        Seguro S6 = new Seguro(10, 006, "Vida", new PorcValorAsegurado(100, 75));

        /*
        System.out.println("El seguro de " + S1.getDescripcion() + " es de: " + S1.get_monto());
        System.out.println("El seguro de " + S2.getDescripcion() + " es de: " + S2.get_monto());
        System.out.println("El seguro de " + S3.getDescripcion() + " es de: " + S3.get_monto());
        System.out.println("El seguro de " + S4.getDescripcion() + " es de: " + S4.get_monto());
        */

        SeguroIntegrador SI = new SeguroIntegrador(9);
        SI.addSeguro(S1);
        SI.addSeguro(S2);
        SI.addSeguro(S3);
        SI.addSeguro(S4);
        SI.addSeguro(S5);
        SI.addSeguro(S6);
        System.out.println("El seguro integrador es de: " + SI.get_monto());
        System.out.println("El seguro integrador esta compuesto por " + SI);
        CondicionBusqueda XDesc = new BusquedaXDescripcion("Vida");
        System.out.println("Ordenado por monto seria: ");
        SI.ordenarXCriterio(new ordenxNroPoliza());
        System.out.println(SI);

        
        //Si .isEmpty retorna false, es que hay conincidencia con la busqueda
        //System.out.println(SI.buscar(XDesc).isEmpty());
    }
}
