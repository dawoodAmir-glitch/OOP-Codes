package lab06;
interface printable{
	void print();
}
interface Showable{
	void Show();
}
class A implements printable,Showable{

	@Override
	public void Show() {
		System.out.println("Hello Print");
	}

	@Override
	public void print() {
		System.out.println("Hello Show");	
		}
	
}
public class Interfaces2 {

	public static void main(String[] args) {
		A a=new A();
		a.Show();
		a.print();
	}

}
