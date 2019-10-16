import java.util.Scanner;
import java.util.stream.IntStream;

public class vowelsInaString {

	public static void main(String[] args) {
		String input1 = "";
		
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("please enter the word you want to count vowels in: ");
		input1 = input.next();
		int vowels = 0;

		char[] str1 = input1.toCharArray();
		
		
		for(int i = 0; i < input1.length(); ++i)
        {
            char ch = input1.charAt(i);
            if(ch == 'a' ||ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I'
                || ch == 'o' || ch == 'O' || ch == 'u'  || ch == 'U') {
                ++vowels;
		}
        }
        System.out.println("String that was entered is: "+ input1);
		System.out.println("Vowels in string = " + vowels);
		
	
	}
}
		
