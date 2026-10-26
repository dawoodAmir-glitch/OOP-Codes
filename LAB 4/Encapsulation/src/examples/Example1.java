package examples;
class Person{
	public String name="Dawood";
	private int age=19;
	public int getAge() {
		return age;
	}
}

public class Example1 {

	public static void main(String[] args) {
		Person p=new Person();
		System.out.println(p.name);
		System.out.println(p.getAge());
	}

}
