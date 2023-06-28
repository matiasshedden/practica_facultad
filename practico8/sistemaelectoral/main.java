package practico8.sistemaelectoral;
import practico8.sistemaelectoral.Condiciones.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        candidato ca1 = new candidato("milei", "La libertad avanza", "Unidos");
        candidato ca2 = new candidato("milei", "La libertad avanza", "libres");
        candidato ca3 = new candidato("grabois", "La libertad avanza", "libres");
        candidato ca4 = new candidato("grabois", "La libertad avanza", "libres");
        candidato ca5 = new candidato("milei", "La libertad avanza", "Peronismo");

        voto v1 = new voto(ca1);
        voto v2 = new voto(ca2);
        voto v3 = new voto();
        voto v4 = new voto(ca3);
        voto v5 = new voto(ca4);

        mesa m1 = new mesa();
        m1.addvoto(v1);
        m1.addvoto(v2);
        m1.addvoto(v3);
        m1.addvoto(v4);
        m1.addvoto(v5);

        /*
        LocalTime horaminima = LocalTime.of(17,00);
        LocalTime horamaxima = LocalTime.of(18, 00);
        condicionBusqueda cond1 = new BusquedaXHorario(horaminima, horamaxima);
        //condicionBusqueda cond2 = new CondicionNOT(cond1);
        System.out.println(v1.getEmitido());
        System.out.println(v5.getEmitido());
        System.out.println(cond1);
        ArrayList<candidato> candidatos = new ArrayList<>();
        candidatos.add(ca1);
        candidatos.add(ca2);
        candidatos.add(ca3);
        candidatos.add(ca4);
        candidatos.add(ca5);
        Collections.sort(candidatos);
        System.out.println(candidatos);*/
        condicionBusqueda cond1 = new BuscaXCandidato("");
        System.out.println(m1.buscar(cond1));
    }
}
