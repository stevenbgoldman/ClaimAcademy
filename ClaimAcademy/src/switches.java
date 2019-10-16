import java.util.Scanner;
import java.util.stream.IntStream;

public class switches {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter day #");
		int a = in.nextInt();
		String day;
		switch (a) {
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;	
		case 3:
			day = "Wednesday";
			break;	
		case 4:
			day = "Thursdayy";
			break;	
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		case 7:
			day = "Sunday";
			break;
		default:
			day = "Error!!!";
			
		}
		System.out.println(day);
	}
}		

