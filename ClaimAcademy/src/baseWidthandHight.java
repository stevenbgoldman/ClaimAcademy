import java.util.Scanner;

public class baseWidthandHight {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is the base width of the triangle?: ");
		double  baseWidthIn = in.nextDouble();
		System.out.print("What is the height of the triangle?: ");
		double  heightIn = in.nextDouble();
		
		double areaOut = ((baseWidthIn * heightIn) / 2);
		System.out.println("The value of the Base Width is: " + baseWidthIn);
		System.out.println("The value of the Height is: " + heightIn);
		System.out.println("The radius of the area of the Triangle is: " + areaOut);
	}

}
