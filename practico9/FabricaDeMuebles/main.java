package practico9.FabricaDeMuebles;

import practico9.FabricaDeMuebles.Criterios.MenorCostoFabricacion;
import practico9.FabricaDeMuebles.Criterios.MenorFechaDeEntrega;
import practico9.FabricaDeMuebles.Condiciones.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/*
En este main se muestran todas las opciones de Criterios de ordenamiento (en paquete Criterios) y las condiciones de busqueda (en paquete Condiciones) del
ejercicio 3 del TP N° 9 de la catedra PROGRAMACION 2 de TUDAI (UNICEN)

Profesores:
Dr. MARCELO ARMENTANO
Dr. LUIS BERDUN

Alumno:
LUIS MATIAS SHEDDEN
 */
public class main {
    public static void main(String[] args) {
        Fabrica F1 = new Fabrica();
        LocalDate fechalimite1 = LocalDate.parse("2023-07-06");//tercera
        LocalDate fechalimite2 = LocalDate.parse("2023-07-01");//segunda
        LocalDate fechalimite3 = LocalDate.parse("2023-06-29");//primera

        Mueble m1 = new Mueble("pino", fechalimite1, 500, 1000);//ganancia 500
        Mueble m2 = new Mueble("cedro", fechalimite1, 900, 1000);//ganancia 100
        Mueble m3 = new Mueble("arce", fechalimite2, 800, 1000);//ganancia 200
        Mueble m4 = new Mueble("haya", fechalimite3, 100, 1000);//ganancia 900

        F1.agregarPedido(m1);
        F1.agregarPedido(m2);
        F1.agregarPedido(m3);
        F1.agregarPedido(m4);


        ArrayList<Mueble> pedido1 = new ArrayList<>();
        pedido1.add(m1);
        pedido1.add(m2);
        pedido1.add(m3);
        pedido1.add(m4);
        /*
        System.out.println("Orden de ingreso");
        System.out.println(pedido1);
        System.out.println("orden natural");
        Collections.sort(pedido1);
        System.out.println(pedido1);
        System.out.println("orden por costo de fabricacion");
        Comparator menorcosto = new MenorCostoFabricacion();
        Collections.sort(pedido1, menorcosto);
        System.out.println(pedido1);
        System.out.println("orden por fecha de entrega");
        Comparator menorfecha = new MenorFechaDeEntrega();
        Collections.sort(pedido1, menorfecha);
        System.out.println(pedido1);
        */
        System.out.println("Busqueda por ganancia mayor");
        condicionBusqueda Ganancia = new BusquedaGananciaMayor(200);
        System.out.println(F1.buscar(Ganancia));
        System.out.println("Busqueda por material");
        condicionBusqueda material = new BusquedaPorMaterial("");
        System.out.println(F1.buscar(material));
    }
}
