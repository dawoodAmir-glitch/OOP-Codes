package examples;
class Bank{
	private double balance;
	
	public void setbalance(double b) {
		if(b>=0) balance=b;
		else System.out.println("Invalid Balance");
	}
	public double getBalance() {
		return balance;
	}
}
public class Example4 {

	public static void main(String[] args) {
		Bank acc=new Bank();
		acc.setbalance(-2000);
		acc.setbalance(5000);
		System.out.println("Balance: "+acc.getBalance());

	}

}
