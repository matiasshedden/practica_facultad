package practico1.electrodomestico;

public class electrodomestico {
	
	private String nombre;
	private double precio_base = 100;
	private String color = "gris plata";
	private int ConsumoEnergetico = 10;
	private int peso = 2;
	private final int ConsumoMaximo = 45;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio_base() {
		return precio_base;
	}
	public void setPrecio_base(double precio_base) {
		this.precio_base = precio_base;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getConsumoEnergetico() {
		return ConsumoEnergetico;
	}
	public void setConsumo_energetico(int ConsumoEnergetico) {
		this.ConsumoEnergetico = ConsumoEnergetico;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	//Constructores
	public electrodomestico (String nombre, double precioBase, String color, int consumo, int Peso) {
		setNombre(nombre);
		setPrecio_base(precioBase);
		setColor(color);
		setConsumo_energetico(consumo);
		setPeso(Peso);
	}
	//Fin constructores
	
	public boolean bajoconsumo() {
		return ConsumoEnergetico < ConsumoMaximo;
	}
	
	public double getBalance() {
		return (precio_base / peso);
	}
	
	public boolean AltaGama () {
		if (getBalance() > 3)
			return true;
		return false;
		
	}
	public int getConsumoMaximo() {
		return ConsumoMaximo;
	}
}
