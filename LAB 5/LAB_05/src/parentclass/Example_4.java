package parentclass;
class AnimalKingdoms{
	void eats() {
		System.out.println("Bark");
	}
}
class doggy extends AnimalKingdoms{
	void bark() {
		System.out.println("Good Boy");
	}
}
class babydog extends doggy{
	void weep() {
		System.out.println("Womp Womp");
	}
}
public class Example_4 {

	public static void main(String[] args) {
		babydog ddd=new babydog();
		ddd.weep();
		ddd.bark();
		
		

	}

}