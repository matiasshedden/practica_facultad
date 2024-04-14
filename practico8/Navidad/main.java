package practico8.Navidad;
/*
* IMPLEMENTE LOS SIGUIENTES SERVICIOS:
        * 1- Dado un BPP, conocer el porcentaje de cartas recibidas que piden un determinado regalo
        * 2- Dado un BPP, conocer la cantidad de cartas recibidas que piden un determinado regalo
        * 3- Dado un BPP, conocer la cantidad de niños malos que enviaron una carta
        * 4- Dado un BPP, conocer la cantidad de total de cartas recibidas
 */

import practico8.Navidad.Busquedas.BusquedaxRegalo;
import practico8.Navidad.Busquedas.condBusqueda;

public class main {
    public static void main(String[] args) {
        Carta C1 = new Carta(18);
        Carta C2 = new Carta(15);
        Carta C3 = new Carta(16);
        Carta C4 = new Carta(17);
        C1.addregalo("robot");
        C2.addregalo("robot");
        C3.addregalo("pelota");
        C4.addregalo("robot");
        BuzonPP B1 = new BuzonPP();
        BuzonPP B2 = new BuzonPP();

        B1.addnino_bueno(14);
        B1.addnino_bueno(15);
        B1.addnino_bueno(16);
        B1.addcarta(C1);
        B1.addcarta(C2);
        B1.addcarta(C3);
        B1.addcarta(C4);
        B1.addContenedor(B2);
        //Si cumple con la condicion de busqueda
        condBusqueda cond = new BusquedaxRegalo("robot");
        System.out.println("El porcentaje de cartas con condicion es: " + B1.porcentaje_cartas(cond));//*1
        System.out.println("La cantidad de cartas total es: " + B1.cant_cartas());//*4
        System.out.println("La cantidad de cartas con regalo son: " + B1.CartasConRegalo("pelota"));//*2
        System.out.println("La cantidad de niños malos son: " + B1.getCant_ninos_malos());
    }
}
