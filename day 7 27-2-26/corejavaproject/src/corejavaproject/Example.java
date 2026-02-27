package corejavaproject;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double salary;
		System.out.println("Enter your salary");
		salary=sc.nextDouble();
		String sal=salary>50000?"high salaray":"average salary";
		System.out.println(sal);
		sc.close();

	}

}
