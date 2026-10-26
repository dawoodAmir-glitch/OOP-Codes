package task4_ex3;

class Student {
    String name;
    int marks;

    // constructor
    Student(String n, int m) {
        name = n;
        marks = m;
    }

    // method to display student details
    void display() {
        System.out.println(name + " scored " + marks + " marks.");
    }
}

class Exam {
    // method that interacts with Student object
    void showResult(Student s) {
        System.out.println("Exam result of: " + s.name);
        s.display();   // calling method of Student object
    }
}

public class ObjectInteractionDemo {
    public static void main(String[] args) {
        Student st = new Student("Amna", 95);   // create Student object
        Exam ex = new Exam();                   // create Exam object
        ex.showResult(st);   // Exam object interacts with Student object
    }
}
