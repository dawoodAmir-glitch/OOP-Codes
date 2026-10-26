package task2_ex1;

class Book {
    String title;
    String author;

    // Default Constructor
    Book() {
        System.out.println("No Book Added");
    }

    // Parameterized Constructor
    Book(String t, String a) {
        title = t;
        author = a;
        System.out.println("Book: " + title + " | Author: " + author);
    }
}

public class BookConstructorDemo {
    public static void main(String[] args) {
        Book b1 = new Book();   // Calls default constructor
        Book b2 = new Book("Harry Potter", "J.K. Rowling");   // Calls parameterized constructor
    }
}
