package InterfacePackage;

public class Sbi implements BankInterface {
	
		double amount;
			@Override
			public void deposit(double amount) {
				
				if (amount<300000) {
					System.out.println("You can deposit");
					this.amount+=amount;
				}else {
					System.out.println("You cant deposit");	
				}
				
			}

			@Override
			public void withdraw(double amount) {
				if(amount<100000) {
					System.out.println("You can withdraw");
					this.amount-=amount;
					}else 
						System.out.println("You can withdraw upto 100000");
						
				
			}

			@Override
			public void checkbalance() {
				System.out.println(amount);
				
			}

			@Override
			public void transfer(double amount) {
				System.out.println("You can transfer upto 1Lakh");
				if(amount<500000) {
					System.out.println("Transferred sucessfull");
				}else {
					System.out.println("Transfered UnSucessfull");
				}
				
			}
			
		}


