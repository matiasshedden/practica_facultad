package practico3.encuestas;

public class empleado {

	private String Nombre;
	private int cant_encuestas_realizadas;
	
	public empleado(String nombre, int er) {
		this.Nombre = nombre;
		this.cant_encuestas_realizadas = er;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getCant_encuestas_realizadas() {
		return cant_encuestas_realizadas;
	}

	public void setCant_encuestas_realizadas(int cant_encuestas_realizadas) {
		this.cant_encuestas_realizadas = cant_encuestas_realizadas;
	}
	
	
}
