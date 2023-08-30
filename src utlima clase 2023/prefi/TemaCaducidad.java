
import java.time.LocalDate;

public class TemaCaducidad extends prefi.Tema {

	LocalDate fCaducidad;

	public TemaCaducidad(String titulo, String descripcion, String autor,
			String ejeTematico, LocalDate fCaducidad) {
		super(titulo, descripcion, autor, ejeTematico);
		this.fCaducidad = fCaducidad;
	}
	
	
	public void addComentario(prefi.Comentario cc) {
		
		if (LocalDate.now().isBefore(fCaducidad))
			super.addComentario(cc);
	}
	
	public prefi.Tema crearTema() {
		return new TemaCaducidad(this.getTitulo(),this.getDescripcion(),
				 this.getAutor(), this.getEjeTematico(),fCaducidad);
	}
	

}
