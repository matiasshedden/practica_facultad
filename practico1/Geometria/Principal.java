package practico1.Geometria;


public class Principal {

	public static void main(String[] args) {
				
		Punto_geometrico P = new Punto_geometrico(1,3);
		Punto_geometrico P1 = new Punto_geometrico(2,4);
		rectangulo R = new rectangulo(P, 10, 10);
		rectangulo R1 = new rectangulo(P1, 10, 11);
		
		R.mostrarRect();
		R.desplazar_rect(P1);
		R.mostrarRect();
		System.out.println("El area del rectangulo R es: " + R.getArea());
		System.out.println("El area del rectangulo R1 es: " + R1.getArea());
		System.out.println("El rectangulo R es: " + R.compararRectangulo(R, R1));
		System.out.println("El rectangulo R es cuadrado? " + R.EsCuadrado());
		System.out.println("El rectangulo R1 es cuadrado? " + R1.EsCuadrado());
	}
}
