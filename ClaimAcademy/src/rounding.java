import java.util.Scanner;

public class rounding {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is the number you want to round?: ");
		double  roundIn = in.nextDouble();	      
		System.out.println(Math.round(roundIn)); 
	        
	      
	}

}
