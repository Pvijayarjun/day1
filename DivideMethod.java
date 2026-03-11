package assignment2;

import java.util.Scanner;

public class DivideMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		divOfTwoNumbers();

	}

	private static void divOfTwoNumbers() {
		// TODO Auto-generated method stub
		int a;
		int b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input a");
		a=sc.nextInt();
		System.out.println("Enter the input b");
		b=sc.nextInt();
		if(b==0) {
			System.out.println("Enter the wrong inputs");
		}
		else {
			System.out.println(a/b);
		}
		
		
	}

}
