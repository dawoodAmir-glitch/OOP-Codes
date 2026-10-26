package task3_ex1;

class Student {
    String name;

    // Constructor sets the name
    Student(String name) {
        this.name = name;
    }
}

public class StudentLifecycleDemo {
    public static void main(String[] args) {
        // A new Student object is created in heap memory
        // 'pupil' (reference variable) is stored on stack and points to that object
        Student pupil = new Student("Mohan");

        // Accessing the object through the reference
        System.out.println(pupil.name);

        // If 'pupil' reference is removed or set to null,
        // the Student object becomes unused
        // Java's Garbage Collector will then delete it automatically
        pupil = null;
    }
}
