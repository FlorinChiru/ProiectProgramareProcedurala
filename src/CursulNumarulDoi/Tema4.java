package CursulNumarulDoi;

public class Tema4 {

	public static void main(String[] args) {
		int suma = 0;
		for(int i = 1; i < 10; i++ ) {
			suma += suma + i;
		}
		System.out.println("Suma este:" + suma);
	}

}
// Afiseaza valoarea sumei in fuctie de valorile introduse, in cazul nostru suma este egala cu 1013.