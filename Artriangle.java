import java.util.Scanner;

public class Artriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the length of te triangle");
			double b,h;
			b=sc.nextDouble();
			h=sc.nextDouble();
			//int result = areaOfSquare(a);
			double result=areaOfTriangle(b,h);
			System.out.println(result);

		} 

		private static  double areaOfTriangle(double b,double h) {
			// TODO Auto-generated method stub
			double area = 0.5*b*h;
			return area;
			//System.out.println("Area of Square:"+area);
			

	}

}
