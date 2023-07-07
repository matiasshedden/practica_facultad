package prefi;
import java.util.ArrayList;

public class Tema extends ElementoForo {

	private String titulo,descripcion, autor,ejeTematico;
	private ArrayList<String> palClaves;
	private ArrayList<Comentario> comentarios;
	
	
	
	public Tema(String titulo, String descripcion, String autor, String ejeTematico) {
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.autor = autor;
		this.ejeTematico = ejeTematico;
		palClaves = new ArrayList<String>();
		comentarios = new ArrayList<Comentario>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public ElementoForo getCopia(Condicion cc) {
		if (cc.cumple(this)) {
			Tema tt = crearTema();
			for(String ss : palClaves) {
				tt.addPalabraClave(ss);
			}
			for (Comentario cco : comentarios) {
				tt.addComentario(cco.clonar());
			}
			return tt;
		}else
			return null;
	}
	
	public Tema crearTema() {
		return new Tema(titulo, descripcion, autor, ejeTematico);
	}
	public void addPalabraClave(String ss) {
		if(!palClaves.contains(ss))
			palClaves.add(ss);
	}

	public void addComentario(Comentario cc) {
		comentarios.add(cc);
	}
	
	@Override
	public ArrayList<String> getPalabrasClaves() {
		ArrayList<String> salida = new ArrayList<String>(palClaves);
		return salida;
	}

	@Override
	public String getEjeTematico() {
		
		return ejeTematico;
	}

	@Override
	public int getCantidadTemas(Condicion cc) {
		if (cc.cumple(this)) 
		   return 1;
		else 
			return 0;
	}
	
	public boolean tienePalabraK(String s) {
		return palClaves.contains(s);
	}

	public boolean comentoAutor(String ss) {
		for(Comentario cc:comentarios) {
			if (cc.getAutor().equals(ss))
				return true;
		}
		return false;
	}
}
