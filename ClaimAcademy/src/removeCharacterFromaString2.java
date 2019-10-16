import java.util.Scanner;
import java.util.stream.IntStream;

public class removeCharacterFromaString2 {

	public static void main(String[] args) {
		String input1, input2 = "";
		
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("please enter the string: ");
		input1 = input.next();
		int strLength = input1.length();
		String strPosition = "0";
		String endPosition = "0";
		System.out.println(input1 + " " + strLength);
		strPosition = input1.substring (0, strLength/2 -1);
		
		System.out.println(strPosition);
		endPosition = input1.substring (strLength/2  + 1, strLength);
		System.out.println(strPosition + endPosition);
		//int strP = Integer.parseInt(strPosition);
		//int endP = Integer.parseInt(endPosition);
		//System.out.println("Middle of string to remove is: " + input1.substring(strP, endP));
		
	}	
}