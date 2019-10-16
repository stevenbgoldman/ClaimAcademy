import java.util.Scanner;
import java.util.stream.IntStream;

public class removeCharacterFromaString {

	public static void main(String[] args) {
		String input1, input2 = "";
		
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("please enter the string: ");
		input1 = input.next();
		System.out.println("please enter the character to remove from the string: ");
		input2 = input.next();
		System.out.println("You inputted this String: " + input1 + " and you wanted this character removed " + input2);
		
		removeChar(input1,input2);
		
		}

	private static void removeChar(String x, String y) {
		// TODO Auto-generated method stub
		x = x.replace(y,"");
		System.out.println("The string now looks like this: " + x);
	}
}
		
