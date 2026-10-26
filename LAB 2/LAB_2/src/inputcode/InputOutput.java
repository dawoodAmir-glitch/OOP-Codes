package inputcode;

import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println("Enter Your Age: ");
		int age=input.nextInt();
		input.nextLine();
		System.out.println("Your Age Is : "+age);
		System.out.println("Enter Your Name : ");
		String name=input.nextLine();
		System.out.println("Your Name Is : "+name);
		System.out.println("Enter Your Salary: ");
		double Salary=input.nextDouble();
		input.nextLine();
		System.out.println("Your Salary Is : "+Salary);

	}

}
