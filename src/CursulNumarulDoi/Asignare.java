package CursulNumarulDoi;

public class Asignare {

	public static void main(String[] args) {
		
			int a = 3;
			int b = (a = 2) * a;
			int c = b * (b = 5);
			System.out.println("a=" + a + ", b=" + b + ", c=" + c);

		}

	}
// Afiseaza a=2, b=5, c=20. Nu calculeaza cu a=3 deoarece acestuia ii este reatribuita valoearea 2.