package SH;

import java.time.DayOfWeek;

public class Main {

	public static void main(String[] args, DayOfWeek sabado) {
		// TODO Auto-generated method stub

		Heroico H = new Heroico("batman", 100);
		HeroeRelajado HR = new HeroeRelajado("superman", 200, 20, sabado);
		
		System.out.println(HR);
		
	}

}
