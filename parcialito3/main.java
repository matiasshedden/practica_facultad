package parcialito3;

import java.util.Collections;

public class main {
    public static void main(String[] args) {
        asociacion TA = new asociacion("TSAS");
        corredor C1 = new corredor(1983, "Juan", "Perez", 5);
        corredor C2 = new corredor(1993, "Pablo", "Perez", 4);
        corredor C3 = new corredor(2003, "Pedro", "Perez", 1);
        corredor C4 = new corredor(2013, "Mateo", "Perez", 10);

        condicionBusqueda cond1 = new BusquedaPorEdad(30);
        condicionBusqueda cond2 = new BusquedaNot(cond1);

        TA.addCorredor(C1);
        TA.addCorredor(C2);
        TA.addCorredor(C3);
        TA.addCorredor(C4);

        System.out.println("Los corredores son: ");
        TA.mostrarCorredores();
        System.out.println("------------------------");
        System.out.println("Los menores de 30 años son");
        System.out.println(TA.menoresDe(cond1));
        System.out.println("Los mayores de 30 son");
        System.out.println(TA.menoresDe(cond2));


    }
}
