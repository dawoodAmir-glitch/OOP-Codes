package examples;
class Car{
	private String brand;
public String getbrand() {
	return brand;
}
public void setbrand(String brand) {
	this.brand=brand;
}
}
public class MiniChallenge {

	public static void main(String[] args) {
		Car Cs=new Car();
		Cs.setbrand("porsche");
		System.out.println(Cs.getbrand());

	}

}
