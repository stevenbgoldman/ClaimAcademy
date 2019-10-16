import java.util.Scanner;

public class radiusArea {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is the circumference of the circle?: ");
		double  cirInput = in.nextDouble();
		
		double circumference =  cirInput;
		double radius = (circumference/(2 * Math.PI));
		System.out.println("The value of PI is: " + Math.PI);
		System.out.println("The circumference of the circle is: " + circumference);
		System.out.println("The radius of the circle is: " + radius);
		
	}
}