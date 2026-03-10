package assignment2;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;//6
	Scanner sc =new Scanner(System.in);
	a = sc.nextInt();
	int count =0;
	for(int i=1;i<=a;i++) {
		
	
	if(a%i==0) {
		count++;
	}
	
	}
	if(count==2) {
		System.out.println("primenumber");
	}
	else {
		System.out.println("not a primenumber");
	}
	}
		

	}


