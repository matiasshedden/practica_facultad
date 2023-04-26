package farmacia2;

public class CondicionBusquedaAND extends CondicionBusqueda {
	
	private CondicionBusqueda cond1;
	private CondicionBusqueda cond2;
	
	public CondicionBusquedaAND(CondicionBusqueda cond1, CondicionBusqueda cond2) {
		this.cond1 = cond1;
		this.cond2 = cond2;
	}

	@Override
	public boolean cumple(Medicamento m) {
		return this.cond1.cumple(m) && this.cond2.cumple(m);
	}

}
