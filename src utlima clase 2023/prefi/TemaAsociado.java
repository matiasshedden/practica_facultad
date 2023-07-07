package prefi;

public class TemaAsociado extends Tema {

	private Tema asoci;

	public TemaAsociado(String titulo, String descripcion, String autor, String ejeTematico, Tema asoci) {
		super(titulo, descripcion, autor, ejeTematico);
		this.asoci = asoci;
	}
	
	public void addComentario(Comentario cc) {
		super.addComentario(cc);
		asoci.addComentario(cc);
	}
	
	public ElementoForo getCopia(Condicion cc) {
		return null;
	}
	
	
}
