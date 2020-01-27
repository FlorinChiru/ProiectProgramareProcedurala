package CursulNumarulDoi;

public class Tema5 {

	public static void main(String[] args) {
		int i,fact = 1;
		int n = 13;
		for(i = 1; i < n; i++) {
			fact = fact * i;
		}
		System.out.println("n!=" + fact);

	}

}
// Afiseaza rexultatul calculului "n!", acesta fiind 479001600 pentru numarul 13.