package ParcialLoberia;

import java.util.ArrayList;

public class PaqueteFestivo extends ElementoFestivo {

	ArrayList<ElementoFestivo> els;
	
	public PaqueteFestivo(int codigo) {
		super(codigo);
	els = new ArrayList<ElementoFestivo>();
	}

	@Override
	public int getAntiguedad() {
		int mayor = -1;
		for(ElementoFestivo elemento:els) {
			int aux = elemento.getAntiguedad();
			if (aux>mayor) {
				mayor = aux;
			}
		}
		return mayor;
	}

	@Override
	public double getValor() {
		double suma = 0;
		for(ElementoFestivo elemento:els) {
			int aux = elemento.getAntiguedad();
			suma = suma + aux;
		}
		return suma;
	}

	@Override
	public ArrayList<ElementoSimple> buscar(Condicion c) {
		  ArrayList<ElementoSimple> salida = new ArrayList<ElementoSimple>();
	      
	      for (ElementoFestivo ef : els) {
	    	  salida.addAll(ef.buscar(c));
	      }
		  return salida;
	}

}
