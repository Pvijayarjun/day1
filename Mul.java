package secondproject;

import java.util.Scanner;
//multiplication table from user input
public class Mul { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in); 
		System.out.print("enter the your Multiple Number: ");
		num = sc. nextInt();
		
		for(int i=1; i<=10; i++)// i =4<=10 true
		{
			System.out.println(num+"x"+i+"="+(i*num));// i=4*5=20

	}
	}

}
