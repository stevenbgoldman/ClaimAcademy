import java.util.Scanner;

public class SquirrelPlay 
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the tempature: ");
		int a = in.nextInt();
		System.out.print("Enter true or false if it is summer: ");
		boolean b  = in.nextBoolean();
		
		
		boolean xy = squuirrelsPlay(b, a);
		if (xy)
		{
			System.out.println("SquirrelPlay tempature " + a + " and they are playinng: " + xy);	
		}
		else
		{
			System.out.println("SquirrelPlay tempature " + a + " The Squirrels are not playing at this time.");
		}
		}
	
	public static boolean squuirrelsPlay(boolean b, int tempIn)
	{
		System.out.println(b);
		boolean c = b;
		if (b) 
		{	
			if (tempIn >= 60 && tempIn <= 100)  
			{
				boolean cz = b;
				c = cz;
			}
			
			else if (tempIn < 60 || tempIn > 100) 
			{
				boolean cz = false;
				c = cz;
			}
			return c;
		}
		
		if (!b) 
		{	
			if (tempIn >= 60 && tempIn <= 90)  
			{
				boolean cz = true;
				c = cz;
			}
			
			else if (tempIn < 60 || tempIn > 100) 
			{
				boolean cz = false;
				c = cz;
			}
			return c;
		}	
	return b;	
	
	}
}

























