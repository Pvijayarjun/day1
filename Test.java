import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the type of transaction\n 1 for cash\n 2 for Upi\n 3 for credit card");
	int num = sc.nextInt();
	payment p = null;
	switch(num) {
	case 1:p=new Cash();
	break;
	case 2:p=new Upi();
	break;
	case 3:p=new CreditCard();
	break;
	default:System.out.println("invalid");
	
	}
	if(p != null)
		p.pay();
	}

}
