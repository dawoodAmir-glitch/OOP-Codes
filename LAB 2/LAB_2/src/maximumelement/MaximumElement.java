package maximumelement;

public class MaximumElement {

	public static void main(String[] args) {
		int[] array= {23,45,12,67,34};
		int max=array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println("Maximum Value : "+ max);
	}

}
