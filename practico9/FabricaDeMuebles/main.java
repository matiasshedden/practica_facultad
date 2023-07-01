package practico9.FabricaDeMuebles;

import practico9.FabricaDeMuebles.CondicionesBusqueda.*;
import practico9.FabricaDeMuebles.CriteriosOrdenamiento.GananciaEsperada;
import practico9.FabricaDeMuebles.CriteriosOrdenamiento.MenorFechaDeEntrega;

import java.time.LocalDate;

/*
Profesores:
Dr. MARCELO ARMENTANO
Dr. LUIS BERDUN

Alumno:
LUIS MATIAS SHEDDEN
 */
public class main {
    public static void main(String[] args) {
        condicionBusqueda material = new BusquedaPorMaterial("pino");
        Fabrica F1 = new Fabrica(material, new GananciaEsperada());
        LocalDate fechalimite1 = LocalDate.parse("2023-07-06");//tercera
        LocalDate fechalimite2 = LocalDate.parse("2023-07-01");//segunda
        LocalDate fechalimite3 = LocalDate.parse("2023-06-29");//primera

        Mueble m1 = new Mueble("pino", fechalimite1, 500, 1000);//ganancia 500
        Mueble m2 = new Mueble("cedro", fechalimite1, 900, 1000);//ganancia 100
        Mueble m3 = new Mueble("arce", fechalimite2, 800, 1000);//ganancia 200
        Mueble m4 = new Mueble("haya", fechalimite3, 100, 1000);//ganancia 900
        Mueble m5 = new Mueble("pino", fechalimite3, 1000, 1100);//ganancia 100

        F1.agregarPedido(m1);
        F1.agregarPedido(m2);
        F1.agregarPedido(m3);
        F1.agregarPedido(m4);
        F1.agregarPedido(m5);

        F1.mostrarPedidos();
        F1.setOrden(new MenorFechaDeEntrega());
        F1.mostrarPedidos();
        System.out.println("La ganancia de la Fabrica es: ");
        System.out.println(F1.gananciaEsperada());
    }
}
