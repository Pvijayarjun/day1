package secondproject;

import java.util.Scanner;

public class Mul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in); 
		System.out.print("enter the your Multiple Number: ");
		num = sc. nextInt();
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(num+"x"+i+"="+(i*num));

	}
	}

}
