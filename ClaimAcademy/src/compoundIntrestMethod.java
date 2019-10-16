import java.util.Scanner;

public class compoundIntrestMethod {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is the invest amount?: ");
		double  invAmount = in.nextDouble();
		System.out.print("What is your rate: ");
		double  rateIn = in.nextDouble();
		System.out.print("What is your lenght in Years: ");
		double  yearsIn = in.nextDouble();
		//double compoundInt = (invAmount * (rateIn *(yearsIn * 12) / 12) - 1);
		
		compOut(invAmount, rateIn, yearsIn);

	}

	public static void compOut(double invAmt, double rate, double years) {
		
		double compoundInt = ( invAmt * ( rate *( years * 12) / 12) - 1);
		System.out.println("Your Annual Compound Intrest is: " + compoundInt);
		System.out.println("Your total amount = " + (invAmt + compoundInt));
		
	}
	
}
