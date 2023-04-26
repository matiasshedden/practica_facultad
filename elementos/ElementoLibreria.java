package elementos;

import java.util.Vector;

import criterios.Criterio;

public abstract class ElementoLibreria {

	private String nombre;

	public ElementoLibreria(String nombre) {
		this.nombre=nombre;
	}
	
	public abstract String getMarca();
	public abstract double getPrecio();
	public abstract double getVolumen();
	
	public abstract int cantidadProductos();
	
	public abstract Vector<ElementoLibreria> buscar(Criterio c);
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean equals(Object o) {
		try {
			ElementoLibreria ele = (ElementoLibreria)o;
			return ele.getNombre().equals(nombre);
		} catch(Exception e) {
			//e.printStackTrace();
			return false;
		}
	}
	
}
