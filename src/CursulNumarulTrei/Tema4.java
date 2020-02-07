package CursulNumarulTrei;

public class Tema4 {

	public static void main(String[] args) {
		String caractere = "Java";
		int len = caractere.length();
		char[] charArray = new char[len];
		for(int i = 0; i < len; i++) 
		{
		    charArray[i] = caractere.charAt(i);
			System.out.println("charArray["+ i +"]= "+ charArray[i]);
		}

	}

}
