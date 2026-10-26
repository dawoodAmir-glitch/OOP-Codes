package examples;
class BankAccount{
	private double balance;
	private int deposit;
	private int Withdraw;
	public void deposit(int b) {
		if(b>=0) balance=b+balance;
		else System.out.println("Invalid Amount");
	}
	public void Withdraw(double a) {
		if(a>=0 && a<=balance) balance=balance-a;
		else System.out.println("Insufficent FUnds");
	}
	public double getBalance() {
		return balance;
	}
}
public class MiniChallenge2 {

	public static void main(String[] args) {
		BankAccount acc=new BankAccount();
		acc.deposit(-2000);
		acc.deposit(500000);
		acc.Withdraw(5000);
		acc.Withdraw(80000);
		System.out.println("Balance: "+acc.getBalance());

	}

}

