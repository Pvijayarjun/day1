package studentpackage;

import java.util.Scanner;

public class BankAccount {
	private double balance;

    // deposit method with validation 
    public void deposit(double amount) {
    	if(amount>0) {
    		balance += amount;
    	}else {
    		System.out.println("Invalid amount"); 
    	}
        
    }

    // withdraw method with validation 
    public void withdraw(double amount) {
    	if(balance>amount) {
    		balance -= amount;
    	}else {
    		System.out.println("Insufficient balance");
    	}
    }

    // getter
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
    	int a=0;
    	int b=0;

        BankAccount bank = new BankAccount();

//        bank.deposit(a);
//        bank.withdraw(b);

       // System.out.println(b.getBalance());
        Scanner sc = new Scanner(System.in);
        do
        {
        	System.out.println("enter the amount to deposit in bank");
        	a= sc.nextInt();
        	
        }while(a>0);
        
        do {
        	System.out.println("enter the amount to withdraw in bank");
        	a= sc.nextInt();
        	
        }while(b>0);
        bank.deposit(a);
        bank.withdraw(b);
        
        
    }    
    }

