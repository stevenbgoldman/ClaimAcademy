import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is the your  height in inches?: ");
		double  heightInches = in.nextDouble();
		System.out.print("What is your weight in LBS: ");
		double  weightIn = in.nextDouble();
		
		double BMI = (weightIn / (heightInches * heightInches) * 703);
		
		System.out.println("Your BMI = " + BMI);

	}

}
