package practico3.encuestas;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class encuesta {

	private int nroEnc;
	private ArrayList <String> Preguntas;
	private ArrayList <respuesta> R; //almacena las respuestas como objeto

	//Constructor
	public encuesta(int NE) {
		this.Preguntas = new ArrayList<>();
		this.R = new ArrayList<>();
		this.nroEnc = NE;
	}

	public void addPreguntas (String P) {
		Preguntas.add(P);
	}

	public void addRespuestas (respuesta Res) {
		R.add(Res);
	}

	//getter abd setter

	public int getNroEnc() {
		return nroEnc;
	}
}
