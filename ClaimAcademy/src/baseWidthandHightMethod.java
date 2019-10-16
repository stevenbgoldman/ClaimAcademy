import java.util.Scanner;

public class baseWidthandHightMethod {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is the base width of the triangle?: ");
		double  baseWidthIn = in.nextDouble();
		System.out.print("What is the height of the triangle?: ");
		double  heightIn = in.nextDouble();
		
		areaTriangle(baseWidthIn, heightIn);
	}

	
	public static void areaTriangle (double width, double height) {

		double areaOut = ((width * height) / 2);
		System.out.println("The value of the Base Width is: " + width);
		System.out.println("The value of the Height is: " + height);
		System.out.println("The radius of the area of the Triangle is: " + areaOut);
		
	}
	
}
