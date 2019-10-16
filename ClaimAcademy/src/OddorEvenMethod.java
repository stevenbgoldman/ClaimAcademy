import java.util.Scanner;

public class OddorEvenMethod {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("What is the number you wish to see if it is Odd or Even: ");
		int numberIn = in.nextInt();
		
		evenOdd(numberIn);
		
	}
	public static void evenOdd(int num) {
		
		if (num % 2 == 0)
			System.out.println("The number you enter is: " + num + " and it is Even");
		else
			System.out.println("The number you enter is: " + num + " and it is Odd");
	}
}
