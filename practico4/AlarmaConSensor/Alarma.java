package practico4.AlarmaConSensor;

import java.util.ArrayList;

public class Alarma {

	private ArrayList<Sensor> Sensores;

	public boolean Activar() {
		return true;
	}

	public void addSensor(Sensor S) {
		this.Sensores.add(S);
	}
	
	public Alarma() {
		this.Sensores = new ArrayList<>();
	}
	
	public String Chequear() {
		if (Sensores.size() > 0)
			for (int i=0; i<Sensores.size();i++)
				if (Sensores.get(i).ChequearSensor() == true)
					return Sensores.get(i).isNombreZona();
		return null;
	}
}
