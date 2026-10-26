package task2_ex2;

class Student {
    String name;                      // instance variable

    // Constructor with one parameter
    Student(String name) {
        // 'this.name' means the variable of the class (instance variable)
        // 'name' means the value we send when making the object
        this.name = name;
    }

    // Method to show student's name
    void display() {
        System.out.println("Student Name: " + this.name);
    }
}

// Main class to run the program
public class StudentThisDemo {
    public static void main(String[] args) {
        // Make a Student object and give it a name
        Student s1 = new Student("Amna");

        // Call the method to print name
        s1.display();   // Output: Student Name: Amna
    }
}
