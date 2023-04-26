package SH;

public abstract class Superheroe {

	private String nombre;
	
	public Superheroe (String nombre) {
		this.nombre = nombre;
	}
	
	public abstract double fuerzaTotal();
}
