package ParcialLoberia;

import java.util.ArrayList;

public class ElementoSimple extends ElementoFestivo {

	int antiguedad;
	double valor;
	String descripcion;
	
	
	
	
	public ElementoSimple(int codigo, int antiguedad, double valor, String descripcion) {
		super(codigo);
		this.antiguedad = antiguedad;
		this.valor = valor;
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public int getAntiguedad() {
		// TODO Auto-generated method stub
		return antiguedad;
	}

	@Override
	public double getValor() {
		// TODO Auto-generated method stub
		return valor;
	}

	@Override
	public ArrayList<ElementoSimple> buscar(Condicion c) {
       ArrayList<ElementoSimple> salida = new ArrayList<ElementoSimple>();
       if (c.cumple(this)) {
    	   salida.add(this);
       }
       return salida;
	}

}
