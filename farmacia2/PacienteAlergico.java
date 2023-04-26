package farmacia2;

import java.util.ArrayList;

public class PacienteAlergico extends Paciente {
	
	private ArrayList<Medicamento> alergias;
	
	public PacienteAlergico(String nombre, ObraSocial os) {
		super(nombre, os);
		this.alergias = new ArrayList<>();
	}
	
	public boolean puedeSerTratadoPor(Medicamento medicamento) {
		if (!alergias.contains(medicamento))
			return super.puedeSerTratadoPor(medicamento);
		return false;
	}
	
}
