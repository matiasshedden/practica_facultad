package practico3.encuestas;

import java.awt.desktop.SystemEventListener;

public class Main {
    public static void main(String[] args) {
        encuesta e1 = new encuesta("Preg1", "Juan");
        encuesta e2 = new encuesta("Preg2", "Jose", 26709681);
        Compania C = new Compania("Coca Cola");


        C.addEncuesta(e1);
        C.addEncuesta(e2);
        System.out.println(C.tieneEncuesta(e1));
        System.out.println(C.tieneEncuesta(e2));
    }

    //Como hago para preguntar si la encuesta esta realizada??
}