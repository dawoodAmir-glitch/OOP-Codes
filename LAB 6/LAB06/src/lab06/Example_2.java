package lab06;
abstract class Payment{
	abstract void pay();
	abstract void Deduct();
	void reciept() {
		System.out.println("Payment Reciept");
	}
}

class Jazzcash extends Payment{
	@Override
	void pay() {
			System.out.println("Paid Via Jazzcash");
	}
	void Deduct() {
		System.out.println("Deduct Via Jazzcash");
	}
}

class Easypaisa extends Payment{

	@Override
	void pay() {
		System.out.println("Paid Via EasyPaisa");
		
	}

	@Override
	void Deduct() {
		System.out.println("Deduct Via Easypaisa");
		
	}
	
}
public class Example_2 {

	public static void main(String[] args) {
			Easypaisa E=new Easypaisa();
			E.Deduct();
			E.pay();
			Jazzcash J=new Jazzcash();
			J.Deduct();
			J.pay();
	}

}
