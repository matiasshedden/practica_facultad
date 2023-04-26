package practico4.AlarmaConSensor;

import java.util.ArrayList;

public class Sensor {	
	
	private String NombreZona;
	private boolean vidrio = false;
	private boolean ventana = false;
	private boolean puerta = false;
	private boolean movimiento = false;
	
	public Sensor(String NombreZona) {
		this.NombreZona = NombreZona;
	}
	
	public boolean isVidrio() {
		return vidrio;
	}
	
	public void setVidrio(boolean vidrio) {
		this.vidrio = vidrio;
	}
	public boolean isVentana() {
		return ventana;
	}
	public void setVentana(boolean ventana) {
		this.ventana = ventana;
	}
	public boolean isPuerta() {
		return puerta;
	}
	public void setPuerta(boolean puerta) {
		this.puerta = puerta;
	}
	public boolean isMovimiento() {
		return movimiento;
	}
	public void setMovimiento(boolean movimiento) {
		this.movimiento = movimiento;
	}
	
	public void setNombreZona(String S) {
		this.NombreZona = S;
	}
	
	public String isNombreZona() {
		return NombreZona;
	}

	//MALLLL
	public boolean ChequearSensor() {
		if (vidrio || ventana || puerta || movimiento)
			return true;
		return false;
	}
	
}