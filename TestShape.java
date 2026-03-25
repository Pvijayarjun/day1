package InterfacePackage;

import java.util.Scanner;

public class TestShape {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1-Rectangle ,2-Square 3- circle 4-Triangle");
		int option = sc.nextInt();
		Shape shape = null;
		
	
		
		switch (option) {
		case 1 :  shape = new Rectangle();
		System.out.println("")
		break;
		case 2 : shape = new Square();
		break;
		case 3 : shape = new Circle();
		break;
		case 4 : shape = new Triangle();
		break;
		
		default : System.out.println("entered invalid number");
		break;
		 }
		

	}


}
