package CursulNumarulTrei;

public class Tema2 {

	public static void main(String[] args) {
		
		int[] vector = new int[] {0,1,2,3,4,5,6,7,8,9};
		int minim = vector[0];
		int maxim = vector[0];
		for(int i = 0; i < 10; i++)
			
		{
			
			if(vector[i] < minim)
				minim = vector[i];
			if(vector[i] > maxim)
				maxim = vector[i];
			
		}
		
		System.out.println("Minimul este: " + minim);
		System.out.println("Maximul este: " + maxim);
		
	}

}
