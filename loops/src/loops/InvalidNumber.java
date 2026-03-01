package loops;

import java.util.Scanner;

public class InvalidNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		 
		int count = 0;
		 
		if (num == 0)
		count = 1;
		if(num<0) {
		System.out.println("invalid number, negative not allowed");
		System.exit(0);
		}
		 
		for (; num > 0; num = num / 10)
		count++;
		 
		System.out.println("Number of digits: " + count);

	}

}
