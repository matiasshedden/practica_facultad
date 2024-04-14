package practico8.wbe;

import java.time.LocalDate;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        Recurso r1 = new Recurso("pintura asfaltica", "compartido");
        Recurso r2 = new Recurso("martin", "exclusivo");
        Recurso r3 = new Recurso("tela", "compartido");
        //Fechas
        LocalDate init = LocalDate.of(24, 02, 02);
        LocalDate fin = LocalDate.of(24, 02, 24);
        LocalDate inite = LocalDate.of(24, 02, 12);
        LocalDate fine = LocalDate.of(24, 02, 28);
        LocalDate init2 = LocalDate.of(24, 02, 04);
        LocalDate fin2 = LocalDate.of(24, 02, 26);
        LocalDate inite2 = LocalDate.of(24, 02, 14);
        LocalDate fine2 = LocalDate.of(24, 03, 04);
        //Tareas finales
        Compositor Arreglo1 = new TFinal("cerrar chapas","en espera", init, fin, inite, fine);
        Compositor Arreglo2 = new TFinal("pintar techo","en espera", init2, fin2, inite2, fine2);
        Arreglo1.addRecurso(r1);
        Arreglo1.addRecurso(r2);
        Arreglo2.addRecurso(r2);
        Arreglo2.addRecurso(r3);
        //Tarea compuesta
        TCompuesto TC = new TCompuesto("Arreglo techo Irma", "en espera");
        TC.addTareas(Arreglo1);
        TC.addTareas(Arreglo2);

        System.out.println(TC);
        System.out.println("la fecha inicio de " + TC.getNombre() + " es " + TC.getFechaInicio());
        System.out.println("La fecha final de " + TC.getNombre() + " es " + TC.getFechaFinal());
        System.out.println("Las siguientes tareas estan atrasadas: " + TC.ListaDeTareasAtrasadas());
        System.out.println("Duration arreglo 1: " + Arreglo1.getDuration() + " dias");
        System.out.println("Duracion tareas totales: " + TC.getDuration() + " dias");

        System.out.println(Arreglo1.getNombre() + Arreglo1.getRecursosInvolucrados());
        System.out.println(TC.getNombre() + TC.getRecursosInvolucrados());
    }
}
