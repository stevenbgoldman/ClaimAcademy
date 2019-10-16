import java.util.Scanner;
import java.util.stream.IntStream;

public class forLoop2 {

	public static void main(String[] args) {
		String input1, input2 = "";

		
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("please enter your word to check to see if it is a palendrome: ");
		input1 = input.next();
		
		int length = input1.length();
				
		for (int i = length - 1; i >= 0; i--) {	
			
			input2 = input2 + input1.charAt(i);
		
		}
	
	
	
	if (input1.equalsIgnoreCase(input2))
	{
	System.out.println("The word you entered " + input1 +  " is a palendrome.");
	}
	else
	System.out.println("The word you entered " + input1 + "is NOT a palendrome.");


		}

	
	}
		
