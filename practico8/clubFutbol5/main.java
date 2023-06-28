package practico8.clubFutbol5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class main {
    public static void main(String[] args) {
        Alquiler A1 = new Alquiler(1, 1000);
        Alquiler A2 = new Alquiler(13, 1000);
        Alquiler A3 = new Alquiler(13, 1000);
        Alquiler A4 = new Alquiler(10, 1000);

        socio S1 = new socio("Juan", "Perez", 13, true);
        socio S2 = new socio("Pedro", "Rodriguez", 15, false);
        socio S3 = new socio("Juan", "Pablo", 18, true);
        socio S4 = new socio("Jose", "Marmol", 21, false);
        socio S5 = new socio("Don", "Ramon", 19, true);
        socio S6 = new socio("El", "Zorro", 25, true);

        Club Boca = new Club();

        S1.addAlquiler(A1);
        S2.addAlquiler(A2);
        S2.addAlquiler(A3);
        S3.addAlquiler(A4);
        S4.addAlquiler(A1);
        S5.addAlquiler(A2);
        S6.addAlquiler(A4);

        Boca.addSocio(S1);
        Boca.addSocio(S2);
        Boca.addSocio(S3);
        Boca.addSocio(S4);
        Boca.addSocio(S5);
        Boca.addSocio(S6);

        ArrayList<socio> ElTablon = new ArrayList<>();
        ElTablon.add(S1);
        ElTablon.add(S2);
        ElTablon.add(S3);
        ElTablon.add(S4);
        ElTablon.add(S5);
        ElTablon.add(S6);

        System.out.println("Los socios por nombre son: ");
        Comparator nombremenor = new ComparadorPorNombre();
        Collections.sort(ElTablon, nombremenor);
        System.out.println(ElTablon);

        System.out.println("Los socios por edad son: ");
        Comparator edadmenor = new ComparadorEdad();
        Collections.sort(ElTablon, edadmenor);
        System.out.println(ElTablon);
        //condicion Cond1 = new condicionNOT(new MenordeEdad());
        //System.out.println(Boca.BuscarSocio(Cond1));
    }
}
