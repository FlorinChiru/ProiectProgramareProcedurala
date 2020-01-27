package CursulNumarulDoi;

public class Tema6 {

	public static void main(String[] args) {
		int x = 1, y = 2, z = 3, min;
		min = x;
		if(y < min)
			min = y;
		if(z < min)
			min = z;
		System.out.println("Cel mai mic numar dintre cele trei numere intregi este:" + min);		
	}

}
// Afiseaza cel mai mic numar dintre cele introduse.