package practico1.Persona;

import java.time.LocalDate;
import java.time.Period;

public class persona {

	private int DNI;
	private LocalDate fechanac = LocalDate.of(2000, 1, 1); 
	private String Sexo = "Femenino"; 
	private String nombre = "N";
	private String apellido = "N";
	private double peso = 1;
	private double altura = 1;
	private final int mayor_de_edad = 18;
	private final int edad_para_votar = 16;
	
	
	//Constructors 
	public persona(int DNI) {
		this.DNI = DNI;
	}
	
	public persona(int DNI, String Nombre, String Apellido) {
		this.DNI = DNI;
		this.nombre = Nombre;
		this.apellido = Apellido;
	}
	
	public persona(int DNI, String Nombre, String Apellido, LocalDate FechaNac) {
		this.DNI = DNI;
		this.nombre = Nombre;
		this.apellido = Apellido;
		this.fechanac = FechaNac;
	}
	
	//End Constructors
	
	public LocalDate getFechanac() {
		return fechanac;
	}
	public void setFechanac(LocalDate fechanac) {
		this.fechanac = fechanac;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso (double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getDNI() {
		return DNI;
	}
	
	public double imc(double Altura, double Peso) {
		return (Peso / (Altura*Altura));
	}
	
	public String Esta_en_forma(double Altura, double Peso) {
		if ((imc(Altura, Peso) >= 18.5) && (imc(Altura, Peso) <= 25))
			return "Est� en forma";
		else
			return "No est� en forma";
	}
	
	public String Cumpliendo_anios(LocalDate FechaNac) {
		LocalDate Hoy = LocalDate.now();
		if ((Hoy.getYear() > FechaNac.getYear()) 
			&& (Hoy.getMonth() == FechaNac.getMonth()) 
			&& ((Hoy.getDayOfMonth() == FechaNac.getDayOfMonth())))
			return "Hoy es su cumpleanios";
		else
			return "Hoy no es su cumpleanios";
	}
	
	
	//Controlamos que sea coherente, que haya nacido y que no tenga mas de 110 a�os
	public Boolean esCoherente (LocalDate Fechanac) {
		LocalDate Hoy = LocalDate.now();
		Period periodo = Period.between(Fechanac, Hoy);
		if ((Fechanac.getYear() > Hoy.getYear()) || (periodo.getYears() > 110))
			return false;
		else
			return true;
	}
	
	//Limit N to compare to period.getYears
	public Boolean YearPlusN(LocalDate FechaNac, int N) {
		LocalDate Hoy = LocalDate.now();
		Period periodo = Period.between(FechaNac, Hoy);
		if (this.esCoherente(FechaNac)) {
			if (periodo.getYears() > N)
				return true;
		}
		return false;
	}
	
	//Controla que mayor sea mas grande que una cantidad de a�os dada
	public Boolean Esmayor (LocalDate FechaNac, int mayor) {
		if (YearPlusN(FechaNac, mayor))
			return true;
		else
			return false;
	}
	
	public String esAdulto (LocalDate FechaNac) {
		if (YearPlusN(FechaNac, mayor_de_edad))
			return ("Es mayor de " + mayor_de_edad);
		else
			return ("Es menor de " + mayor_de_edad);
	}
	public String CanIvote(LocalDate FechaNac) {
		if (Esmayor(FechaNac, edad_para_votar))
			return ("Es mayor de " + edad_para_votar + " puede votar");
		else
			return ("Es menor de " + edad_para_votar + " no puede votar");
	}
	
	public String DatosPersona(int DNI) {
		return ("La persona cuyo DNI es: " + getDNI() + " pertenece a: " + getNombre() + " " + getApellido());
	}
}
