package prefi;
import java.time.LocalDate;

public class TemaCaducidad extends Tema {

	LocalDate fCaducidad;

	public TemaCaducidad(String titulo, String descripcion, String autor,
			String ejeTematico, LocalDate fCaducidad) {
		super(titulo, descripcion, autor, ejeTematico);
		this.fCaducidad = fCaducidad;
	}
	
	
	public void addComentario(Comentario cc) {
		
		if (LocalDate.now().isBefore(fCaducidad))
			super.addComentario(cc);
	}
	
	public Tema crearTema() {
		return new TemaCaducidad(this.getTitulo(),this.getDescripcion(),
				 this.getAutor(), this.getEjeTematico(),fCaducidad);
	}
	

}
