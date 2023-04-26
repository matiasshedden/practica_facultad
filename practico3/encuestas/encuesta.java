package practico3.encuestas;

public class encuesta {

	private String preguntas;
	private String persona_encuestada;
	
	
	public encuesta(String preguntas, String persona_encuestada) {
		this.preguntas = preguntas;
		this.persona_encuestada = persona_encuestada;
	}


	public String getPreguntas() {
		return preguntas;
	}


	public void setPreguntas(String preguntas) {
		this.preguntas = preguntas;
	}


	public String getPersona_encuestada() {
		return persona_encuestada;
	}


	public void setPersona_encuestada(String persona_encuestada) {
		this.persona_encuestada = persona_encuestada;
	}
	
	
}
