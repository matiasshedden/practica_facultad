package practico3.encuestas;

import java.awt.desktop.SystemEventListener;

public class Main {
    public static void main(String[] args) {
    encuesta E1 = new encuesta(1);
    E1.addPreguntas("Como se llama?");
    E1.addPreguntas("Cual es su edad?");

    respuesta R1 = new respuesta(26709681);
    R1.addRespuestas("Me llamo Pedro");
    R1.addRespuestas("Tengo 20 anios");

    E1.addRespuestas(R1);

    }

    //Como hago para preguntar si la encuesta esta realizada??
}