package CursulNumarulTrei;

public class Tema5 {

	public static void main(String[] args) {
		String ParMajuscule = "februarie";
		for(int i = 0; i < ParMajuscule.length(); i++) {
			if(i % 2 == 1) 
				ParMajuscule = ParMajuscule.substring(0, i) + ParMajuscule.substring(i, i + 1).toUpperCase() + ParMajuscule.substring(i + 1, ParMajuscule.length());
			else 
				ParMajuscule = ParMajuscule.substring(0, i) + ParMajuscule.substring(i, i + 1).toLowerCase() + ParMajuscule.substring(i + 1, ParMajuscule.length());
		}
		System.out.println("Putem observa ca literele mari sunt pe pozitiile 2, 4, 6, 8: " + ParMajuscule);
			
		}

}
