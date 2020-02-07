package CursulNumarulTrei;

public class Tema6 {

	public static void main(String[] args) {
		
			int[] intArray = new int[] {10, 11, 12};
			double[] doubleArray = new double[intArray.length];
			double aux = 1.23;
			for(int i = 0; i < intArray.length; i++)
				doubleArray[i] = intArray[i] + aux;
			
			System.out.print("Valorile elementelor celui de-al doilea vector, dupa adaugarea valorii 1.23, sunt: ");
			for(int i = 0; i < doubleArray.length; i++)
				System.out.print(doubleArray[i] + ", ");

	}

}
