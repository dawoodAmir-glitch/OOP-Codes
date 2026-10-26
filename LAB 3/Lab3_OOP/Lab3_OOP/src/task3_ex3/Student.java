package task3_ex3;

public class Student {
    // Instance variable (stored in Heap)
    String name;

    // Static variable (stored in Method Area)
    static String schoolName = "City School";

    // Constructor
    Student(String n) {
        name = n;   // assigning value to instance variable
    }

    // Method
    void display() {
        // Local variable (created when method is called, destroyed after)
        // Local variable will be stored in stack
        int marks = 90;
        System.out.println(name + " studies at " + schoolName + " and scored " + marks);
    }

    public static void main(String[] args) {
        // Objects created -> stored in Heap
        Student s1 = new Student("Amna");
        Student s2 = new Student("Ali");

        s1.display();
        s2.display();
    }
}
