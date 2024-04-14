package practico9.MisDeportes;

import practico9.MisDeportes.Condiciones.Buscar;

import java.util.ArrayList;

public abstract class Compositor {

    public abstract ArrayList<Participante> getParticipantes(Buscar cond);

    public abstract ArrayList<Participante> getParticipantes();

    public abstract int getDuracion();

    public abstract int getPuntuacion();

}
