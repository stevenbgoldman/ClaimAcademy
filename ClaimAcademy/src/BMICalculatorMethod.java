import java.util.Scanner;

public class BMICalculatorMethod {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is the your  height in inches?: ");
		double  heightInches = in.nextDouble();
		System.out.print("What is your weight in LBS: ");
		double  weightIn = in.nextDouble();
		
		double bmiO = bmiOutput(weightIn, heightInches);
		
		System.out.println("Your BMI = " + bmiO);

	}
	public static double bmiOutput(double weight, double inches) {
		
		double BMIOutput = (weight / (inches * inches) * 703);
		return BMIOutput;
	}
}
