package practico1.electrodomestico;



public class Main {

	public static void main(String[] args) {
		
		electrodomestico e = new electrodomestico("heladera", 300.50, "blanca", 50, 100);
		
		if (e.bajoconsumo())
			System.out.println("El electrodomestico es bajo consumo");
		else
			System.out.println("El electrodomestico No es bajo consumo");
		
		if (e.AltaGama())
			System.out.println("El electrodomestico es alta gama. Balance: " + e.getBalance());
		else
			System.out.println("El electrodomestico No es alta gama. Balance: " + e.getBalance());
		System.out.println("El electrodomestico será considerado de Alta Gama si su balance es mayor a 3");
		}		
}
