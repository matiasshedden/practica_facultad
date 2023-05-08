package practico3.encuestas;

import java.util.ArrayList;

public class respuesta {
    private int DNI;
    private ArrayList <String> respuestas;

    //Constructor
    public respuesta (int dni) {
        this.respuestas = new ArrayList<>();
        this.DNI = dni;
    }

    public void addRespuestas (String Res) {
        respuestas.add(Res);
    }

    //Getter and setters
    public int getDNI() {
        return DNI;
    }
}
