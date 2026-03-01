package loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();//123
		int onum = num;
		 
		int reverse=0;
		while(num!=0)//false
		{
		int digit = num%10;//1%10 1
		reverse = reverse + digit;//32 = 3210 +1 320+1 321
		num=num/10;//1/10 =0
		 
		}
		if(onum==reverse)
		{
		System.out.println("palindrome");
		}else
		System.out.println("not palindrome");

	}

}
