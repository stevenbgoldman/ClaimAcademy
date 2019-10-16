import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacterReplace
{

	public static void main(String[] args) 
	{
		String input1, input2 = "";
		
		Scanner input = new Scanner(System.in);
		System.out.print("please enter the string: ");
		input1 = input.next();
		int strLength = input1.length();
		String strPosition = "0";
		String endPosition = "0";
		
		char[] chars = input1.toCharArray();
		System.out.println(chars);
		char dup;

		Map<Character, Integer> map = new HashMap<>();
			{
				for(char c : chars)
				{
	            if(map.containsKey(c)) 
	            {
	                int counter = map.get(c);
	                map.put(c, ++counter);
	            } else 
	            
	            {
	            	map.put(c, 1);
	            }
	            System.out.println("c = " + c);
	        }
				
        
         
        System.out.println("Duplicate characters:");
         
        //Print duplicate characters
        for(char c : map.keySet()) 
        {
            if(map.get(c) > 1) 
            {
                System.out.println(c);
            }
        }
         
        System.out.println("Duplicate characters excluding white space :");
         
        //Print duplicate characters excluding white space
        for(char c : map.keySet()) 
        {
            if(map.get(c) > 1 && !Character.isWhitespace(c)) 
            {
            	dup = c;
                System.out.println(c);
            }
        }
         
        System.out.println("Distinct characters:");
         
        //Print distinct characters
        for(char c : map.keySet()) 
        {
            if(map.get(c) == 1)
            {
                System.out.print(c);
                
            }
        }
	}
}
}		


		
