package Figuras;

public abstract class figura {
	String nombre;
	
	public figura(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract double getArea();

	@Override
	public String toString() {
		return getNombre() + "-" + getArea();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
