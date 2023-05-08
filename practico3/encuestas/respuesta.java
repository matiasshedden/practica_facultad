package practico3.encuestas;

import java.util.ArrayList;

public class respuesta {
    private int DNI; //persona encuestada
    private ArrayList <String> respuestas;
    private String Empleado;

    //Constructor
    public respuesta (int dni, String Emp) {
        this.respuestas = new ArrayList<>();
        this.DNI = dni;
        this.Empleado = Emp;
    }

    public void addRespuestas (String Res) {
        respuestas.add(Res);
    }

    //Getter and setters
    public int getDNI() {
        return DNI;
    }

    public String getEmpleado() { return Empleado; }
}
