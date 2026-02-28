package secondproject;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		System.out.print("Enter the number");
		int num=sc.nextInt();
		int mul=1;
		for(int i=num;i>0;i--)
		{
			mul*=i;
		}
		System.out.println(mul);

	}

}
