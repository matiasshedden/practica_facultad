package prefi;
import java.util.ArrayList;

public abstract class ElementoForo {

	public abstract ElementoForo getCopia(Condicion cc);
	public abstract ArrayList<String> getPalabrasClaves();
	public abstract String getEjeTematico();
	public abstract int getCantidadTemas(Condicion cc);
}
