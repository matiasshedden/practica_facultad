package ParcialLoberia;

import java.util.ArrayList;

public abstract class ElementoFestivo {

	private int codigo;

	public ElementoFestivo(int codigo) {
		super();
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public abstract int getAntiguedad();
	public abstract double getValor();
	public abstract ArrayList<ElementoSimple> buscar(Condicion c);
	
}
