package prefi;

public class CondicionAutorComentario extends Condicion {

	String autor;
	@Override
	public boolean cumple(Tema tt) {
		return tt.comentoAutor(autor);
	}

}
