import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("What is the number you wish to see if it is Odd or Even: ");
		int numberIn = in.nextInt();
		
		if (numberIn % 2 == 0)
			System.out.println("The number you enter is: " + numberIn + " and it is Even");
		else
			System.out.println("The number you enter is: " + numberIn + " and it is Odd");
	}

}
