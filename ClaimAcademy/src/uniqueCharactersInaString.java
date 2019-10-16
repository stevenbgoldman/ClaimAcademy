import java.util.Scanner;
public class uniqueCharactersInaString 
{
	public static void main(String[] args)
	{
	
		// Create a Scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("please enter the string you want to check if it is unique: ");
		String input1 = input.next();
		
		uniqueStr(input1); 
	}
	public static void uniqueStr(String x) 
	{
		char[] str1 = x.toCharArray();
		System.out.println("x " + x);
	
	    for (int i = 0; i < str1.length - 1; i++) {
	    	System.out.println("Outter Loop: " + i);
		    for (int j = i + 1; j < str1.length - 1; j++) {  
		    	System.out.println("Inner Loop: " + j);
		        if (str1[i] == str1[j])  
		           System.out.println("String " + str1 + " is not unique.");
		           break;
		        
		    }
	    }
	    
	} 
		
	
}  
	