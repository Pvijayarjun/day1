package secondproject;

import java.util.Scanner;

public class Week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch;
		do{
			System.out.println("0-sunday\n1-monday\n3-tuesday\n4-wednesday\n5-friday\n6-saturday");
			System.out.println("enter the numer you want in a week");
			
			int option = sc.nextInt();
			switch (option)
			{
			case 0 : System.out.println("sunday");
			break;
			case 1 :System.out.println("monday");
			break;
			case 3 :System.out.println("tuesday");
			break;
			case 4:System.out.println("wednesday");
			break;
			case 5 :System.out.println("thursday");
			break;
			case 6 :System.out.println("friday");
			break;
			case 7 :System.out.println("saturday");
			break;
			default :System.out.println("you have entered wrong");
			break;
			
			}
			System.out.println("if you want to check again y");
			ch=sc.next().charAt(0);
			
			
		}
		    while(ch=='y' || ch=='Y');
	}
	}
