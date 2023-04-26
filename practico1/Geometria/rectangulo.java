package practico1.Geometria;

public class rectangulo {
	
	private Punto_geometrico P;
	private int Ancho;
	private int Alto;

	//Inicio Constructores
	public rectangulo (Punto_geometrico P, int An, int Al) {
		this.P = P;
		this.Ancho = An;
		this.Alto = Al;
	}

	//getters y setters
	public int getAncho() {
		return Ancho;
	}

	public int getAlto() {
		return Alto;
	}

	
	//METODOS
	public void mostrarRect() {
		System.out.println("El rectangulo tiene su origen en X:" + P.getX() + ", Y:" + P.getY() + " con un ancho de: " + getAncho() + " y un alto de: " + getAlto() );
	}
	
	//Pido la nueva posicion del punto de origen
	public void desplazar_rect (Punto_geometrico P1) {
		this.P = P1;
	}
	
	public double getArea() {
		return Ancho * Alto;
	}
	
	public int compararRectangulo (rectangulo R, rectangulo R1) {
		if (R.getArea() > R1.getArea())
			return 1;
		else if (R.getArea() < R1.getArea())
			return -1;
		else
			return 0;
	}
	
	public boolean EsCuadrado () {
		if (Ancho == Alto)
			return true;
		else
			return false;
	}
	
	public String getPosicion () {
		if (getAlto() > getAncho())
			return "En posicion vertical";
		else if (getAlto() < getAncho())
			return "En posicion horizontal";
		else
			return "Es un cuadrado";
	}
	
	
}

