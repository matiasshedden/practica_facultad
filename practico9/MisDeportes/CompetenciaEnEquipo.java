package practico9.MisDeportes;

import java.util.ArrayList;

public class CompetenciaEnEquipo extends Competencia {

    private ArrayList<Evento> eventos;

    public CompetenciaEnEquipo(String name) {
        super(name);
        eventos = new ArrayList<Evento>();
    }

    @Override
    public int getDuracion() {
        int resultado = 0;
        int i = 0;
        while (i<eventos.size()) {
            if (eventos.get(i).getDuracion() > resultado)
                resultado = eventos.get(i).getDuracion();
            i++;}
        return resultado;
    }
}
