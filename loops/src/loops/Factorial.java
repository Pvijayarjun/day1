package loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();//5
		//int count=0;
		int i;
		for(i=0;;i++)//3
		{
		num=num/10;//1/10
		if(num>0)//1
		{
		continue;//it takes the control to the i++
		}else
		{
		break;//takes the control out of for loop
		 
		}
		 
		}
		System.out.println(i+1);

	}

}
