package methodparameter;

public class MethodParameter {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		int num=10;
		double decimal=5.4;
		numberManeuvers(num, decimal);
	}
	public static void numberManeuvers(int i, double j) {
		if(i==10) {
			j=6.2;
			i=12;
			System.out.println("Inside Method: i= "+i+" "+"J="+j);
		}
	}

}
