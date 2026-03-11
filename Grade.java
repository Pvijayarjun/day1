package assignment2;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner sc= new Scanner(System.in);
				int marks;// marks of the student
			
				System.out.println("enter the marks of the student");
				marks=sc.nextInt();
				
				char result=grade(marks);//calling method passing Side as argument(actual parameter)
				System.out.println(result);

			} 
			//method Defination and copying the side variable value into side variable
			private static  char grade (int marks) {// (int side) is the Formal parameter 
				// TODO Auto-generated method stub
				 if (marks >= 90)
			            return 'A';
			        else if (marks >= 80)
			            return 'B';
			        else if (marks >= 65)
			            return 'C';
			        else if (marks >= 45)
			            return 'D';
			        else
			            return 'F';
				//System.out.println("Area of Square:"+area);

	}

}
