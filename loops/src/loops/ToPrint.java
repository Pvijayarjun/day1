package loops;

import java.util.Scanner;

public class ToPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the number:");
		String name = "Mahesh";
		char ch;
		 
		do{
		System.out.println(name);
		System.out.println("wants to print again if yes press y");
		ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
		 

	}

}
