package task1_ex3;

class Book {
    String title;
    String author;
    double price;

    void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}

public class BookArrayDemo {
    public static void main(String[] args) {
        // Creating an array of 3 Book references
        Book[] books = new Book[3];

        // Initializing each book object
        books[0] = new Book();
        books[0].title = "Java Basics";
        books[0].author = "John Smith";
        books[0].price = 500.0;

        books[1] = new Book();
        books[1].title = "OOP Concepts";
        books[1].author = "Sarah Lee";
        books[1].price = 750.0;

        books[2] = new Book();
        books[2].title = "Data Structures";
        books[2].author = "Mark Johnson";
        books[2].price = 900.0;

        // Display all book details using a loop
        for (int i = 0; i < books.length; i++) {
            books[i].displayDetails();
        }
    }
}
