package farmacia2;

import java.util.ArrayList;

public class Farmacia {
	
	private ArrayList<Medicamento> medicamentos;
	private ArrayList<Paciente> pacientes;
	
	public Farmacia() {
		this.medicamentos = new ArrayList<>();
		this.pacientes = new ArrayList<>();
	}
	
	public boolean puedeTratar(Medicamento m, Paciente p) {
		return m.puedeTratarA(p);
	}
	
	public void addMedicamento(Medicamento m) {
		this.medicamentos.add(m);
	}
	
	
	public ArrayList<Medicamento> buscarMedicamentos(CondicionBusqueda condicion) {
		ArrayList<Medicamento> resultados = new ArrayList<>();
		for (int i = 0; i < this.medicamentos.size(); i++)
			if (condicion.cumple(medicamentos.get(i)))
				resultados.add(medicamentos.get(i));
		
		return resultados;
	}
		
	

}
