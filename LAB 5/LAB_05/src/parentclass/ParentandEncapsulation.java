package parentclass;
	class ABC{
		int age;
		public void setAge(int a)
		{
			this.age=a;
		}
		public int getAge() {
			return age;
		}
		// ABC(int a){
			//this.age=a;
			//System.out.println(age);
		//}
	}
public class ParentandEncapsulation {

	public static void main(String[] args) {
		ABC obj=new ABC();
		obj.setAge(60);
		System.out.println(obj.getAge());
		
		

	}

}
