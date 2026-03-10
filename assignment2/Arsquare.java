package assignment2;

import java.util.Scanner;

public class Arsquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a;
		a=sc.nextInt();
		//int result = areaOfSquare(a);
		int result=areaOfSquare(a);
		System.out.println(result);

	} 

	private static  int areaOfSquare(int a) {
		// TODO Auto-generated method stub
		int area = a*a;
		return area;
		//System.out.println("Area of Square:"+area);
		
		
	}

}
