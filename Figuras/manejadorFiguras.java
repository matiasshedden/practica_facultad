package Figuras;

public class manejadorFiguras {
	
	public <Rectangulo> void imprimir(Rectangulo r) {
		System.out.println(r);
	}
	
	public static void main(String[] args) {
		rectangulo myrectangulo = new rectangulo(10,10);
		//que codigo deberia poner para que diga circulo-100.0
		myrectangulo.setNombre("circulo");
		System.out.println(myrectangulo);
	
		figura mycirculo1 = null;
		rectangulo mycirculo = new rectangulo(2,5);
		System.out.println(mycirculo);
	}
}
