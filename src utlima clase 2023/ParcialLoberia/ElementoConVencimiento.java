package ParcialLoberia;

import java.util.ArrayList;

public class ElementoConVencimiento extends ElementoFestivo{

	 ElementoFestivo apuntado;
	  double porcentaje;
	  int meses;
	  
	  
	
	public ElementoConVencimiento(int codigo, ElementoFestivo apuntado, double porcentaje, int meses) {
		super(codigo);
		this.apuntado = apuntado;
		this.porcentaje = porcentaje;
		this.meses = meses;
	}

	@Override
	public int getAntiguedad() {

		return apuntado.getAntiguedad();
	}

	@Override
	public double getValor() {
		double valor = apuntado.getValor();
		int diferencia =apuntado.getAntiguedad()-meses;
		if (!estaVigente()) {
			double descuento = valor*porcentaje*diferencia;
			if (descuento > valor)
				return 0;
			else
				return valor - descuento;
			
		} else {
			return valor;
		}
	}
	public boolean estaVigente() {
		return apuntado.getAntiguedad()<meses;
	}

	@Override
	public ArrayList<ElementoSimple> buscar(Condicion c) {
		if (estaVigente()) {
			return apuntado.buscar(c);
		}else
			return new ArrayList<ElementoSimple>();
	}

}
