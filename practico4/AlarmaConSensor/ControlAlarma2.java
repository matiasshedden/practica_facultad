package practico4.AlarmaConSensor;

import java.util.Scanner;

public class ControlAlarma2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		Sensor S1 = new Sensor("Comedor");
		Sensor S2 = new Sensor("Banio");
		S1.setVentana(true);
		
		Alarma A = new Alarma();
		A.addSensor(S1);
		A.addSensor(S2);
		
		if (A.Chequear() != null)
			System.out.println("El sensor activo es " + A.Chequear());
		else
			System.out.println("No hay sensores activos");
	}
}
