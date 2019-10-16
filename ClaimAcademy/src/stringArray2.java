import java.util.Scanner;

public class stringArray2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is your name?: ");
		String name = in.next();	      
		
		char[] str1 = name.toCharArray();
		String newword = "";
		for (int i = 0; i < name.length(); i++)
		{
	     
			if(i % 2 != 0)
			{
				newword += Character.toUpperCase(str1[i]);
			}
			
			else
			{
				newword += Character.toLowerCase(str1[i]);
			}
			
			}
		System.out.println(str1);
		System.out.println(newword);
		
			
	}

}
