package lab06;
interface Shapes {
	void Circle();
	void Rectangle();
	void Triangle();
	void Square();
}
class Factory implements Shapes{
	@Override
	public void Circle() {
	}
	@Override
	public void Rectangle() {
	}
	@Override
	public void Triangle() {
	}
	@Override
	public void Square() {
	}
}
class University implements Shapes{

	@Override
	public void Circle() {
	}

	@Override
	public void Rectangle() {
	}

	@Override
	public void Triangle() {
	}

	@Override
	public void Square() {
		System.out.println("Hello Square Here");
	}
	
}
public class Interface1 {
	public static void main(String[] args) {
		University U=new University();
		U.Circle();
		U.Triangle();
		U.Square();
	}

}
