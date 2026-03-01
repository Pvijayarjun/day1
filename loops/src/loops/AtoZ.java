package loops;

import java.util.Scanner;

public class AtoZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		//int num = sc.nextInt();
		 
		char num='a';//97
		 
		while(num<='z')//122
		{
		System.out.println(num +" "+(char)(num-32));//1 2 3
		num++;//4

	}

	}

}