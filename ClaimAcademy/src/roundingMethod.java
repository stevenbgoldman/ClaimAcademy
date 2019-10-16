import java.util.Scanner;

public class roundingMethod {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is the number you want to round?: ");
		double  roundIn = in.nextDouble();
		
		double xy = rounding(roundIn);
		System.out.println(xy);
	        
	      
	}
	public static double rounding(double x) {
		double cz = (Math.round(x));
		return cz;
		
	}
}
