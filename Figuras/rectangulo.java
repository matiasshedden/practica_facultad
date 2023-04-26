package Figuras;

public class rectangulo extends figura{
	
	private double lado1; 
	private double lado2;
	
	public rectangulo(double l1, double l2) {
		super("rectangulo");
		this.lado1 = l1;
		this.lado2 = l2;
	}

	
	/*
	Constructor (parametros) Uso "This" cuando hago referencia al parametro
	public void Rectangulo(String nombre, int lado1, int lado2) {
		this.nombre = nombre;
		this.lado1 = lado1;
		this.lado2 = lado2;
	}*/
	
	/*/De esta forma reuso el contructor anterior
	public void Rectangulo1010(String nombre) {
		this.Rectangulo(nombre, 10, 10);
	}*/

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}
	
	public double perimetro() {
		return (this.lado1 * 2) + (this.lado2 * 2);
	}
	
	public double getArea() {
		return this.lado1 * this.lado2;
	}
	
	
	
}

