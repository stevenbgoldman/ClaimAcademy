import java.util.Scanner;

public class LotteryTicket 
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the first integer: ");
		int a = in.nextInt();
		System.out.print("Enter the second integer: ");
		int b = in.nextInt();
		System.out.print("Enter the third integer: ");
		int c = in.nextInt();
		
		int xz = ticketNumbers(a, b, c);
		System.out.println("Return value for lottery ticket is: " + xz);
	
	}
	public static int ticketNumbers(int num1, int num2, int num3)
	{
	int xz = 0;
	if (num1 == num2 && num2 == num3) 
	{
		xz = 20;	
	}
	else if (num1 == num2 && num2 != num3)
	{
		xz = 10;
	}
	else if (num1 == num3 && num1 != num2)
	{
		xz = 10;
	}
	else 
	{
		xz = 0;
	}
	return xz;
	}
}
	
	





















