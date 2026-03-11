package assignment2;//Area of Square

import java.util.Scanner;

public class Arsquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int side;// side of the Square
		side=sc.nextInt();
		//int result = areaOfSquare(a);
		int result=areaOfSquare(side);//calling method passing Side as argument(actual parameter)
		System.out.println(result);

	} 
	//method Defination and copying the side variable value into side variable
	private static  int areaOfSquare(int side) {// (int side) is the Formal parameter 
		// TODO Auto-generated method stub
		int area = side*side;
		return area;
		//System.out.println("Area of Square:"+area);
		
		
	}

}
