package parentclass;
class Employee{
		float Salary=40000;
		
}
class Programmer extends Employee{
	int Bonus=10000;
}
class Staff extends Employee{
	int fee=15000;
}
public class ParentClass {
				
	public static void main(String[] args) {
		Programmer p=new Programmer();
		System.out.println(p.Bonus+" "+p.Salary+" ");

	}

}
