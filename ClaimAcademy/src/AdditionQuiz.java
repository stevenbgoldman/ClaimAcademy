import java.util.*;
public class AdditionQuiz {

	public static void main(String[] args) 
	{
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() * 7 % 10);
		
		System.out.println("What is " + number1 + " + " + number2 + "? ");
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your anwser?: ");
		int answer = input.nextInt();
		 
		System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
		
	}

}