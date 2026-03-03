package secondproject;

import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch ;
	do
	{
		System.out.println("1-Breakfast\n2-Lunch\n3-snacks\n4-Dinner");
		System.out.println("select an option");
		
		int option = sc.nextInt();
		switch(option)
		{
		case 1:System.out.println("good morning here is the breakfast menu");
				System.out.println("1-edly\n2-dosa\n3-purii");
				int option1 = sc.nextInt();
				switch(option1)
				{
				case 1:System.out.println("your idly is Ordered Please Wait for a while to get Ready");
				break;
				case 2:System.out.println("your dosa is Ordered Please Wait for a while to get Ready");
				break;
				case 3:System.out.println("your purii is Ordered Please Wait for a while to get Ready");
				break;
				default :System.out.println("You have only 3 options");
				break;
				}
				break;
		case 2: System.out.println("good afternoon here is the lunch menu");
		        System.out.println("1-chapati\n2-ricesambar\n3-full meals");
		        int option11 = sc.nextInt();
		        switch(option11)
		        {
	        	case 1:System.out.println("your chapati is Ordered Please Wait for a while to get Ready");
	         	break;
	        	case 2:System.out.println("your ricesambar is Ordered Please Wait for a while to get Ready");
	        	break;
	        	case 3:System.out.println("your full meals  is Ordered Please Wait for a while to get Readyy");
	        	break;
	        	default :System.out.println("You have only 3 options");
	        	break;
		        }
		        break;
		
		case 3:System.out.println("good evening here is the Snacks menu");
				System.out.println("1-panipuri\n2-gobii\n3-vegroll");
				int option12 = sc.nextInt();
				switch(option12)
				{
				case 1:System.out.println("your panipuri is Ordered Please Wait for a while to get Readyy");
				break;
				case 2:System.out.println("your gobii is Ordered Please Wait for a while to get Ready");
				break;
				case 3:System.out.println("your vegroll is Ordered Please Wait for a while to get Ready");
				break;
				default :System.out.println("You have only 3 options");
				break;
				}
				break;
		
		case 4:System.out.println("good evening here is the Dinner menu");
		System.out.println("1-rotis\n2-northmeals\n3-Southmeals");
		int option13 = sc.nextInt();
		switch(option13)
		{
		case 1:System.out.println("your rotis Ordered Please Wait for a while to get Ready");
		break;
		case 2:System.out.println("your northmeals is Ordered Please Wait for a while to get Ready");
		break;
		case 3:System.out.println("your Southmeals Ordered Please Wait for a while to get Ready");
		break;
		default :System.out.println("You have only 3 options");
		break;
		}
		break;
		       
				default : System.out.println("Your item is not in any menu");
				break;
				
		}
		 System.out.println("Do you want to test other option if yes press y");
		 ch=sc.next().charAt(0);
	}
		 while(ch=='y' || ch=='Y');
		 
	}
	
	}
