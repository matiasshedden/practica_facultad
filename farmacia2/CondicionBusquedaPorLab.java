package farmacia2;

public class CondicionBusquedaPorLab extends CondicionBusqueda {
	
	private String lab;
	
	public CondicionBusquedaPorLab(String lab) {
		this.lab = lab;
	}

	@Override
	public boolean cumple(Medicamento m) {
		return this.lab.equals(m.getLab());
	}

}
