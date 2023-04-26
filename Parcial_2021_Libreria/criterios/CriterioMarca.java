package Parcial_2021_Libreria.criterios;

import elementos.ElementoLibreria;

public class CriterioMarca extends Criterio {

	String unaMarca;
	
	 public CriterioMarca(String ss) {
		 unaMarca =ss;
	}
	@Override
	public boolean cumple(ElementoLibreria el) {
		return el.getMarca().equalsIgnoreCase(unaMarca);
	}

}
