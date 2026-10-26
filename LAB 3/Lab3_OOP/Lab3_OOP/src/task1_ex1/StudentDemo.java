package task1_ex1;

// Basic Example: Student class
class Student {
    String name;
    int age;
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();   // object creation
        s1.name = "Amna";
        s1.age = 20;

        System.out.println("Student Name: " + s1.name);
        System.out.println("Student Age: " + s1.age);
    }
}
