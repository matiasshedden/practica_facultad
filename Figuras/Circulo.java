package Figuras;

public class Circulo extends figura{
	
	private double radio;
	
	public Circulo(double r) {
		super("circulo");
		this.radio = r;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getPerimetro() {
		return 2 * Math.PI * this.radio;
	}
	
	public double getArea() {
		return Math.PI * radio * radio;
	}
	
	public String toString() {
		return ("Nombre: " + getNombre() + "- Area: " + getArea());
	}
}
