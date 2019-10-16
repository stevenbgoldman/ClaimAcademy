
import java.lang.annotation.Documented;
import java.util.Scanner;

public class ChangeMaker 
{
	// ChangeMaker will make change up to 99 cents. If the amount is $1 dollar or more
	// a message will be displayed and the method will not execute.
	
	//@author Steve Goldman
	//@version 1.0
	

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("What is the Sales amount: ");
		double salesAmount = in.nextDouble();
		System.out.print("What is the Tender amount: ");
		double cashTender = in.nextDouble();
		double changeOut = cashTender - salesAmount;
		if (changeOut < 1.00)
		{
			System.out.println("Cash Tender " + cashTender);
			System.out.println("Sales Amount " + salesAmount);
			System.out.println("Change Amount " + Math.round(changeOut));
			returnChange(changeOut);
		}
		else 
		{
			System.out.println("Change is equal to or greater than $1.00. Change amount =: " + changeOut);
		}
	}
		public static void returnChange(double changeAmount) 
		{			
		double qtrValue = .25;
		double dimValue = .10;
		double nicValue = .05;
		double penValue = .01;
		double beginingChangeAmount = changeAmount;
		int counterHold = 0;
						
		for (int qtrCnt = 1; beginingChangeAmount >= qtrValue; qtrCnt ++) {
			
			beginingChangeAmount = beginingChangeAmount - qtrValue;
			counterHold = qtrCnt;
		}
		
		if (counterHold > 0) 
		{
			System.out.println("Quarter Count " + counterHold);
			counterHold = 0;
		}
		
		for (int dimCtr = 1; beginingChangeAmount >= dimValue; dimCtr ++) {
		
			beginingChangeAmount = beginingChangeAmount - dimValue;
			counterHold = dimCtr;
		}
		
		if (counterHold > 0) 
		{
			System.out.println("Dime Count " + counterHold);
			counterHold = 0;
		}
		
		for (int nicCnt = 1; beginingChangeAmount >= nicValue; nicCnt ++) {
			
			beginingChangeAmount = beginingChangeAmount - nicValue;
			counterHold = nicCnt;
		}
		
		if (counterHold > 0) 
		{
			System.out.println("Nickel Count " + counterHold);
			counterHold = 0;
		}
			
		for (int penCtr = 1; beginingChangeAmount >= penValue; penCtr ++) 
		{
			beginingChangeAmount = beginingChangeAmount - penValue;
			counterHold = penCtr;
		}
		
		if (counterHold > 0) 
		{
			System.out.println("Penny Count " + counterHold);
			counterHold = 0;
		}
		
	}
}
		

		

