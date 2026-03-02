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
			 System.out.println("1-january\n2-february\n3-march\n4-april\n5-may\n"
			 		+ "6-june\n7-julay\n8august\n9-september\n10-october\n11-november\n12-december");
			 System.out.println("enter the month youu want to know");
			 int option = sc.nextInt();
			 switch (option)
			 {
			 case 1  : System.out.println("january = 31");
			 break;
			 case 2 : System.out.println("february = 28/29");
			 break;
			 case 3  : System.out.println("march  = 31");
			 break;
			 case 4  : System.out.println("april  = 30");
			 break;
			 case 5  : System.out.println("may  = 31");
			 break;
			 case 6  : System.out.println("june  = 30");
			 break;
			 case 7  : System.out.println("julay  = 31");
			 break;
			 case 8  : System.out.println("august  = 31");
			 break;
			 case 9  : System.out.println("september  = 30");
			 break;
			 case 10  : System.out.println("october  = 31");
			 break;
			 case 11  : System.out.println("november  = 30");
			 break;
			 case 12  : System.out.println("december  = 31");
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
