package comparadores2;

import java.util.Comparator;
import prefi.*;

public abstract  class ComparadorCompuesto implements Comparator<Tema> {

	ComparadorCompuesto siguiente;

	@Override
	public int compare(Tema o1, Tema o2) {
		int valor = this.comparameEstos(o1,o2);
		if ((valor == 0) && siguiente!=null) {
			return siguiente.compare(o1, o2);
		}
		return valor;
	}
	
	public abstract int comparameEstos(Tema o1, Tema o2);
	
	
	
}
