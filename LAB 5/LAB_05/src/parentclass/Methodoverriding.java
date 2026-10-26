package parentclass;
class A{
	public void display() {
		System.out.println("welcome to A");
	}
}
class B extends A{
	public void display() {
		System.out.println("Welcome to B");
		
	}
	public void Method() {
		super.display();
	}
}
public class Methodoverriding {
public static void main(String[] args) {
	B obj=new B();
	obj.Method();
}
}