package primenumber;

public class Task3 {

	public static void main(String[] args) {
		int i=1;
		String primenumber="";
		while(i<=100)
		{
			int num=i;
			int counter=0;
			while(num>=1) {
				if(i%num==0)
				{
					counter++;
				}
				num--;
			}
			if(counter==2) {
				primenumber+=i+" ";
			}
			i++;
		}
		System.out.println("Prime Numbers From 1 to 100 are : ");
		System.out.println(primenumber);

	}

}
