package practico9.MisDeportes;

import practico9.MisDeportes.Condiciones.Buscar;
import practico9.MisDeportes.Condiciones.OrigenIgualA;

public class Compania {
    public static void main(String[] args) {
        Participante martin = new Participante("martin", "lopez", "Tandil", 100);
        Participante john = new Participante("john", "connor", "Detroit", 150);
        Participante ricardo = new Participante("ricardo", "francella", "Tandil", 10);
        Participante matias = new Participante("matias", "shedden", "Tres Arroyos", 145);

        Buscar cond = new OrigenIgualA("Tandil");

        Deporte futbol = new Deporte("Corto", 30, 50);
        Deporte basquet = new Deporte("extremo", 180, 100);
        Deporte AltoRiesgo = new Deporte("AR", 60, 200, cond);

        Evento Ev1 = new Evento(25, 30);
        Evento Ev2 = new Evento(100, 60);

        Ev1.addParticipante(martin);
        Ev1.addParticipante(john);
        Ev1.addParticipante(ricardo);
        Ev1.addParticipante(matias);
        Ev2.addParticipante(martin);
        Ev2.addParticipante(matias);

        Competencia tandilia = new Competencia("tandilia");
        tandilia.addEventos(Ev1);
        tandilia.addEventos(Ev2);

        System.out.println("La duracion de " + tandilia.getNombre() + " es de: " + tandilia.getDuracion());
        System.out.println("La puntuacion de "+ tandilia.getNombre() + " es de: " + tandilia.getPuntuacion());
        System.out.println("Los participantes de tandil del evento son: " + Ev1.getParticipantes(cond));
        System.out.println("Los participantes de tandil de la competencia son: " + tandilia.getParticipantes(cond));
    }
}
