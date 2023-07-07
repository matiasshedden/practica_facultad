package comparadores2;

import prefi.Tema;

public class ComparadorAutor extends ComparadorCompuesto {

	@Override
	public int comparameEstos(Tema o1, Tema o2) {
		// TODO Auto-generated method stub
		return o1.getAutor().compareTo(o2.getAutor());
	}

}
