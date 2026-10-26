package task4_mini;

class Book {
    String title;
    double price;

    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }
}

class Library {
    // Accepts a Book object and prints its title and price
    void showBookDetails(Book b) {
        System.out.println("Title: " + b.title);
        System.out.println("Price: " + b.price);
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Book book = new Book("Data Structures", 900.0);   // one Book object
        Library library = new Library();                  // one Library object

        library.showBookDetails(book);   // pass the Book object
    }
}
