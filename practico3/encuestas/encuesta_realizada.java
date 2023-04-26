package practico3.encuestas;

public class encuesta_realizada extends encuesta{

	private int DNI_encuestador;
	
	public encuesta_realizada(String preguntas, String persona_encuestada) {
		super(preguntas, persona_encuestada);
	}

	public int getDNI_encuestador() {
		return DNI_encuestador;
	}

	public void setDNI_encuestador(int dNI_encuestador) {
		DNI_encuestador = dNI_encuestador;
	}

	
}
