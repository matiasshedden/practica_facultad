package SH;

public class Heroico extends Superheroe {

	private double fuerza;
	
	public Heroico(String nombre, double fuerza) {
		super(nombre);
		this.fuerza = fuerza;
	}

	public double fuerzaTotal() {
		return fuerza;
	}
}
