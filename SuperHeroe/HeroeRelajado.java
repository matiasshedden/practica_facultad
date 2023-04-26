package SH;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class HeroeRelajado extends Superheroe {

	private double fuerza;
	private double fiaca;
	private DayOfWeek diaFiaca;
	
	public HeroeRelajado(String nombre, double fuerza, double fiaca, DayOfWeek dia) {
		super(nombre);
		this.fuerza = fuerza;
		this.fiaca = fiaca;
		diaFiaca = dia;
	}
	
	public double fuerzaTotal() {
		LocalDate hoy = LocalDate.now();
		DayOfWeek diaDelaSemana = hoy.getDayOfWeek();
		if (diaFiaca.equals(diaDelaSemana))
			return fuerza - fuerza*fiaca;
		else
			return fuerza;
	}
	
	
}
