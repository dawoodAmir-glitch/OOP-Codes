package parentclass;
class AnimalKingdomm{
	void Eats() {
		System.out.println("Barks");
	}
}
class Doggyy extends AnimalKingdomm{
	void Barks() {
		System.out.println("Good Boy");
	}
}
public class Example__3 {

	public static void main(String[] args) {
		Doggyy dd=new Doggyy();
		dd.Eats();
		dd.Barks();
		

	}

}