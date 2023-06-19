package puertoDeCereales;

import puertoDeCereales.Comparadores.*;
import java.util.ArrayList;
import java.util.Collections;

public class main2 {
    public static void main(String[] args) {
        ArrayList<Camion> Camiones = new ArrayList<>();
        Camion C1 = new Camion("Aaron");
        Camion C2 = new Camion("Benz");
        Camion C3 = new Camion("Mercedez");
        Camion C4 = new Camion("Chevrolet");
        C1.setFechaCarga(2000, 12, 1);
        C2.setFechaCarga(2019, 10, 4);
        C3.setFechaCarga(2022, 3, 3);
        C4.setFechaCarga(2012, 1,1);

        Camiones.add(C1);
        Camiones.add(C2);
        Camiones.add(C3);
        Camiones.add(C4);

        System.out.println("Orden de ingreso");
        for (Camion C:Camiones)
            System.out.println(C);

        Collections.sort(Camiones);

        System.out.println("Orden natural");
        for (Camion C:Camiones)
            System.out.println(C);

        Collections.sort(Camiones, new ComparadorCamionMarca());

        System.out.println("Orden por marca");
        for (Camion C:Camiones)
            System.out.println(C);

        Collections.sort(Camiones, new ComparadorCamionFechaCarga());

        System.out.println("Orden por fecha de carga");
        for (Camion C:Camiones)
            System.out.println(C);
    }
}
