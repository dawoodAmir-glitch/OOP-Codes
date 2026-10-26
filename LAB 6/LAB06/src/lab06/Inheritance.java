package lab06;
class Person{
	byte Age;
	void SetAge(int a) {
		this.Age=(byte) a;
	}
	byte GetAge() {
		return Age;
	}
}
class Atrributes extends Person{
	String Name;
	void SetName(String b) {
		this.Name=b;
	}
	String GetName() {
		return Name;
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Atrributes A=new Atrributes();
		A.SetName("Dawood Amir");
		A.SetAge(20);
		System.out.println("My Name Is: "+A.GetName());
		System.out.println("My Age Is: "+A.GetAge());
	}

}
