package practico3.encuestas;

import java.awt.desktop.SystemEventListener;

public class Main {
    public static void main(String[] args) {

    encuesta E1 = new encuesta(1);
    E1.addPreguntas("Como se llama?");
    E1.addPreguntas("Cual es su edad?");
    respuesta R1 = new respuesta(26709681, "Juancito");
    R1.addRespuestas("Me llamo Pedro");
    R1.addRespuestas("Tengo 20 anios");
    E1.addRespuestas(R1);

    encuesta E2 = new encuesta(2);
    E1.addPreguntas("Como se llama?");
    E1.addPreguntas("Cual es su edad?");
    respuesta R2 = new respuesta(26000007, "Juancito");
    R1.addRespuestas("Me llamo Chongo");
    R1.addRespuestas("Tengo 25 anios");
    E2.addRespuestas(R2);

    compania C = new compania("Coca");
    C.addEncuesta(E1);
    C.addEncuesta(E2);
    }

}