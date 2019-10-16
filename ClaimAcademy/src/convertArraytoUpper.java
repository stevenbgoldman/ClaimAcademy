
public class convertArraytoUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = new int[] {10,20,30,40};
		
		double [] numberWithDecimals = new double [5];
		numberWithDecimals[0]= 10.3;
		numberWithDecimals[1]= 10.1;
		numberWithDecimals[2]= 10.2;
		numberWithDecimals[3]= 10.7;
		numberWithDecimals[4]= 10.12;
		
		
/*	for (int i=0; i<5; i++) 
	{
		
		System.out.println("the value of i is: " + i);
		System.out.println("Value of Arary is: " + numberWithDecimals[i]);
	}
	
	for (int i=0; i<5; i++) 
	{
		
		System.out.println("the value of i is: " + i);
		System.out.println("Value of Arary is: " + number[i]);
	} */
		
	/*
	for (int i=4; i>=0; i--) 
	{
		
		//System.out.println("the value of i is: " + i);
		System.out.println("Value of Arary is: " + number[i]);
	}*/
		
	
	for (int i=3; i>=0; i = i - 2) 
		
			System.out.println("Value of Arary is: " + number[i]);
		}

	
  }

