package InterfacePackage;

public class Hdfc implements BankInterface {
double amount;
	
	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		if (amount<200000) {
			System.out.println("You can deposit");
			this.amount+=amount;
		}else {
			System.out.println("You cant deposit");	
		}
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount<50000) {
			System.out.println("You can withdraw");
			this.amount-=amount;
			}else 
				System.out.println("You can withdraw upto 50000");
				
		}

	@Override
	public void checkbalance() {
		// TODO Auto-generated method stub
		System.out.println(amount);
	}

	@Override
	public void transfer(double amount) {
		// TODO Auto-generated method stub
		System.out.println("You can transfer upto 1Lakh");
		if(amount<100000) {
			System.out.println("Transferred sucessfull");
		}else {
			System.out.println("Transfered UnSucessfull");
		}
	}

}
