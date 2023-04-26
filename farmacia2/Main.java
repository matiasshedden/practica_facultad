package farmacia2;

public class Main {
	public static void main(String[] args) {
		Medicamento med1 = new Medicamento("Ibupirac", "Pfizer", 100);
		Medicamento med2 = new Medicamento("Tafirol", "Bayer", 500);
		Medicamento med3 = new Medicamento("Geniol", "Bayer", 200);
		Medicamento med4 = new Medicamento("DiclofIbu", "Generico", 50);
		
		Farmacia f1 = new Farmacia();
		f1.addMedicamento(med1);
		f1.addMedicamento(med2);
		f1.addMedicamento(med3);
		f1.addMedicamento(med4);
		
		CondicionBusqueda cond1 = new CondicionBusquedaNot(new CondicionBusquedaPorLab("Bayer"));
		
		System.out.println(f1.buscarMedicamentos(cond1));
		
		CondicionBusqueda cond2 = new CondicionBusquedaAND(cond1, new CondicionBusquedaPorNombre("Ibu"));
		System.out.println(f1.buscarMedicamentos(cond2));
		
		CondicionBusqueda cond3 = new CondicionBusquedaAND(cond2, new CondicionBusquedaPorLab("Generico"));
		System.out.println(f1.buscarMedicamentos(cond3));
	}
}
