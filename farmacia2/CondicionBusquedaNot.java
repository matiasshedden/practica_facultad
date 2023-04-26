package farmacia2;

public class CondicionBusquedaNot extends CondicionBusqueda {
	
	private CondicionBusqueda cond;
	
	public CondicionBusquedaNot(CondicionBusqueda cond) {
		this.cond = cond;
	}
	
	@Override
	public boolean cumple(Medicamento m) {
		return !cond.cumple(m);
	}

}
