package comparadores1;

import java.util.Comparator;
import prefi.Tema;

public class ComparadorCompuesto implements Comparator<Tema> {
	
	Comparator<Tema> primero;
	Comparator<Tema> siguiente;
	@Override
	public int compare(Tema o1, Tema o2) {
		int valor = primero.compare(o1, o2);
		if (valor ==0) {
			return siguiente.compare(o1, o2);
		} else {
			return valor;
		}
	}
	
	
	

}
