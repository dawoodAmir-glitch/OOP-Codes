package examples;
class Person1{
	private int age=30;
	private int height=7;
	
	public int getAge() {
		return age;
	}
	public void setAge_Height(int a,int b) {
		this.age=a;
		this.height=b;
	}
	public int getHeight() {
		return height;
	}
}
public class Example3 {

	public static void main(String[] args) {
		Person1 ps=new Person1();
		System.out.println(ps.getAge());
		ps.setAge_Height(55,7);
		System.out.println(ps.getAge()+"   "+ps.getHeight());
	}
}

