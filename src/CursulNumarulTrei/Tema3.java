package CursulNumarulTrei;

public class Tema3 {

	public static void main(String[] args) {
		int[] vectorNegativ = new int[] {10, 11, 12,13, 14, -15, 16, 17, 18, 19, 10};
		for(int i = 0; i < vectorNegativ.length; i++) 
			
		{
			if(vectorNegativ[i] < 0)
				System.out.println("Pozitia valorii negative (de la stanga la dreapta) este: " + (i+1));
				
		}

	}

}
