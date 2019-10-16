import java.util.Scanner;

public class methodcoding2 
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your first Interger: ");
		int a = in.nextInt();
		System.out.print("Enter your second Interger: ");
		int b = in.nextInt();
		int lenA = String.valueOf(a).length();
		int lenB = String.valueOf(b).length();
		if ((a > 0) && (b> 0))
		{
			int xy = addtion(a, lenA, b, lenB);
			System.out.println("The value retured is: " + xy);
		}
		else 
		{
			System.out.println("One or both of your vaules is less than zero: " + "a= " + a + " " + "b= " + b);
		}
			
		
	
	
	}

	public static int addtion(int a, int lenA, int b, int lenB)
	{
		int cz = (a + b);
		int lenCZ = String.valueOf(cz).length();
		int lenAB = lenA + lenB;
		
		if (lenCZ >= lenAB) 
		{
			cz= a;
		}
		return cz;
	
	}
}
