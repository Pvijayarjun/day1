package InterfacePackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class TestBank {
	static	BankInterface  getObject(String bankName){
		if (bankName.equals("Hdfc")) {
			return new Hdfc();
			
		}else if (bankName.equals("Sbi")) {
			return new Sbi();
		}else 
			return null;
			
		
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		boolean status=false;
		Scanner sc = new Scanner(System.in);
		System.out.println("R for register L for log-in");
		char ch = sc.next().charAt(0);
		
		switch (ch) {
		case 'R':System.out.println("Enter user name and password");
		         String userName = sc.next();
		         String password = sc.next();
			     register(userName,password);
			     break;
			     
		case 'L':System.out.println("Enter user name and password");
        String userName1 = sc.next();
        String password1 = sc.next();
       
       status= login(userName1,password1);
			break;
		}
		if (status){
			
		
		System.out.println("Enter the bank you want to do transaction");
	
	String bankName=sc.next();
	BankInterface bankInterface=getObject(bankName);
	System.out.println("Enter 1 for deposit 2 for withdraw 3 for checkbalance 4 for transfer");
	int option = sc.nextInt() ;
	
	
	switch(option) {
	case 1: bankInterface.deposit(290000);
	break;
	case 2:bankInterface.withdraw(348762); 
	break;
	case 3: bankInterface.checkbalance();
	break;
	case 4: bankInterface.transfer(5664);
	break;
	default:System.out.println("Invalid option");
	break;
	}
		
		}else {
			System.out.println("login failed");
		}
	}

	private static boolean login(String userName,String password) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				FileInputStream fin = new FileInputStream("login.txt");
				ObjectInputStream oin= new ObjectInputStream(fin);
				
				
				Login login = (Login) oin.readObject();//object registred
				
				if (login.getUserName().equals(userName)&& login.getPassword().equals(password)) {
					System.out.println("logiin sucess");
					return true;
					
				}else
					return false;
				
		}

	private static void register(String userName,String password) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout = new FileOutputStream("login.txt");
		ObjectOutputStream oOut= new ObjectOutputStream(fout);
		
		
		Login login = new Login();
		login.setUserName(userName);
		login.setPassword(password);
		oOut.writeObject(login);
		oOut.close();
	}


}
