package practico3.encuestas;

import java.util.ArrayList;

public class encuesta {

	private String pregunta; // ArrayList de String??
	private int DNI_persona;//Persona encuestada
	private String empleado; // Guardo el nombre del que realiza la encuesta
	private boolean isRealizada;



	public encuesta(String p, String nombre_empleado) {
		this.pregunta = p;
		this.empleado = nombre_empleado;
	}

	public encuesta(String p, String nombre_empleado, int DNI_encuestado) {
		super();
		this.DNI_persona = DNI_encuestado;
        this.isRealizada = true;
	}

	public int getDNI_persona() {
		return DNI_persona;
	}

	public boolean isRealizada() {
		return isRealizada;
	}
}
