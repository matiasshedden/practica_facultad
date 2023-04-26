package farmacia2;

public class CondicionBusquedaPorNombre extends CondicionBusqueda {

	private String nombre;
	
	public CondicionBusquedaPorNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public boolean cumple(Medicamento m) {
		//return m.getNombre().equals(this.nombre);
		return m.getNombre().contains(this.nombre);
	}

}
