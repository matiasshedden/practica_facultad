package practico1.Persona;

import java.time.LocalDate;

public class master {

	public static void main(String[] args) {
		
		persona test = new persona(26709681, "Jose", "Perez");
		double Altura = 1.74;
		double Peso = 77;
		LocalDate FechaNac = LocalDate.of(1990, 10, 05);
		
		System.out.println("El DNI es: " + test.getDNI());
		System.out.println("El IMC de " + test.getNombre() + " es: " + test.imc(Altura, Peso));
		System.out.println(test.Esta_en_forma(Altura, Peso));
		if (test.esCoherente(FechaNac)) {
			System.out.println("Esta persona es coherente");
			System.out.println(test.Cumpliendo_años(FechaNac));
			System.out.println(test.esAdulto(FechaNac));
			System.out.println(test.CanIvote(FechaNac));
			System.out.println(test.DatosPersona(test.getDNI()));}
		else
			System.out.println("Esta persona NO es coherente");
	}
	
}
