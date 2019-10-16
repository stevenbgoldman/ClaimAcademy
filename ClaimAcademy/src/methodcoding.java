import java.util.Scanner;

public class methodcoding {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your first number: ");
		double a = in.nextDouble();
		System.out.print("Enter your second number: ");
		double b = in.nextDouble();
		
		double xy = addtion( a, b);
		System.out.println(xy);
	//	System.out.println("The value of a = " + a + " the value of b = " + b + " the value of the two numbers added together is "+ addtion(a,b));
		subtract(a,b);
		muti(a,b);
		System.out.println(div(a,b));
	}

	public static double addtion(double a, double b) {
	
	double cz = (a + b);
	return cz;
	
	}
	
	public static void subtract(double az, double bz) {
		
		double cz = (az - bz);
		System.out.println(cz);
		
		}
	
	
	
public static void muti(double az, double bz) {
		
		double cz = (az * bz);
		System.out.println(cz);
		
		}



public static double div(double az, double bz) {
	
	double cz = (az / bz);
	return cz;
	
	}
}
