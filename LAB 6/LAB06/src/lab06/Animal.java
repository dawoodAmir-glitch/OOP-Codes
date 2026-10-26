package lab06;
abstract class Animal{
	abstract void Sound();
	void Sleep() {
		System.out.println("Sleeping");
	}
	
}
class Dog extends Animal{
	void Sound() {
		System.out.println("Dog Is Barking");
	}
}
class cat extends Animal{

	@Override
	void Sound() {
		System.out.println("Cat");
		
	}
}
