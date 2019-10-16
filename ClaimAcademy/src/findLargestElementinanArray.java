
public class findLargestElementinanArray {

	public static void main(String[] args) {
		
			int arr[] = {10, 13324, 45, 90, 9808}; 	
			int i; 
		
			// Initialize maximum element 
			int max = arr[0]; 
		
			// Traverse array elements from second and 
			// compare every element with current max 
			for (i = 0; i < arr.length; i++) 
			{
				if (arr[i] > max) 
					max = arr[i];  
			}
			System.out.println("The largest vlue in the array is: " + max);
	} 
}