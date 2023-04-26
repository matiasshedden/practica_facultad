package farmacia2;

import java.util.ArrayList;

public class Medicamento {
	
	private String nombre;
	private String lab;
	private double precio;
	private ArrayList<String> sintomas;
	
	public Medicamento(String nombre, String lab, double precio) {
		this.nombre = nombre;
		this.lab = lab;
		this.precio = precio;
		this.sintomas = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLab() {
		return lab;
	}

	public void setLab(String lab) {
		this.lab = lab;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void addSintomas(String sintoma) {
		if (!this.sintomas.contains(sintoma))
			this.sintomas.add(sintoma);
	}
	
	public boolean puedeTratarA(Paciente paciente) {
		return paciente.puedeSerTratadoPor(this);
	}

	public boolean trata(String sintoma) {
		return this.sintomas.contains(sintoma);
	}
	
	public boolean equals(Object o) {
		try {
			Medicamento otro = (Medicamento)o;
			return this.nombre.equals(otro.getNombre());
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public String toString() {
		return this.getNombre() + "(" + this.getLab() + ")";
	}

}
