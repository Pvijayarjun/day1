package secondproject;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 char ch;
		 do 
		 {
			 System.out.println("do you want to know how many days are present in the month ");
			
			 System.out.println("enter the month youu want to know");
			String option = sc.next();
			 switch (option)
			 {
			 case "january","march","may","july","august","october","december"  : System.out.println("this month has a 31 days");
			 break;
			 case "february" : System.out.println("february has a  28/29 days");
			 break;
			 case "april","june","september","November"  : System.out.println("This month has a 30 days ");
			 break;
			 
			 default : System.out.println("you have only 12 months ");
			 break;
			 }
			 
			 System.out.println("Do you want to test other option if yes press y");
			 ch=sc.next().charAt(0);
			 
			 
			 
			 
		 }
		 while(ch=='y' || ch=='Y');
		

	}

}
