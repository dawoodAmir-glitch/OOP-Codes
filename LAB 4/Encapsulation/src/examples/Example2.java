package examples;
class Persons{
	private int age=30;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
}
public class Example2 {

	public static void main(String[] args) {
		Persons ps=new Persons();
		System.out.println(ps.getAge());
		ps.setAge(55);
		System.out.println(ps.getAge());
	}

}
