import java.util.Scanner;

public class baseWidthandHightMethod2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		baseWidthandHightMethod2 a1 = new baseWidthandHightMethod2();
		@SuppressWarnings("static-access")
		int z = a1.areaTriangle(a,b);
		System.out.println(z);
	}

	


//non-static method
	public int areaTriangle (int width, int height) {

		int areaOut = ((width * height) / 2);
		//System.out.println("The value of the Base Width is: " + width);
		//System.out.println("The value of the Height is: " + height);
		//System.out.println("The radius of the area of the Triangle is: " + areaOut);
		return areaOut;
	}
	
}
