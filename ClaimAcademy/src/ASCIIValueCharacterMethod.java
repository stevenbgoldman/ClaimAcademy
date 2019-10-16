import java.util.Scanner;

public class ASCIIValueCharacterMethod {

	public static void main(String[] args) {
				
		Character c = 'G';
		int value = c;
		System.out.println(value);
		asciiNumber(value);
		
	}

	public static void asciiNumber(int y) {
		
		//1 : Assigning.
		System.out. println("Ascii : " + y);
		//2 : Typecasting.
		System.out. println("Ascii : " + (int)y);
	}

	

}
