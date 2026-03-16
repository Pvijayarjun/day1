package studentpackage;

public class BankAccount {
	private double balance;

    // deposit method
    public void deposit(double amount) {
        balance = balance + amount;
    }

    // withdraw method
    public void withdraw(double amount) {
        balance = balance - amount;
    }

    // getter
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        BankAccount b = new BankAccount();

        b.deposit(1000);
        b.withdraw(200);

        System.out.println(b.getBalance());
    }
}
