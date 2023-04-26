package farmacia2;

import java.util.ArrayList;

public class Paciente {
	
	private String nombre;
	private ObraSocial os;
	private ArrayList<String> sintomas;
	
	public Paciente(String nombre, ObraSocial os) {
		this.nombre = nombre;
		this.os = os;
		this.sintomas = new ArrayList<>();
	}
	
	public boolean puedeSerTratadoPor(Medicamento medicamento) {
		for (int i = 0; i < this.sintomas.size(); i++) {
			String sintoma = this.sintomas.get(i);
			if (!medicamento.trata(sintoma))
				return false;
		}
		return true;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ObraSocial getOs() {
		return os;
	}

	public void setOs(ObraSocial os) {
		this.os = os;
	}
	

}
