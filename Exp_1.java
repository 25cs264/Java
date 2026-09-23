class Book {
    int bookId;
    String title;
    String author;
    String category;
    double price;
    boolean available;

    // Parameterized constructor
    Book(int bookId, String title, String author,
         String category, double price, boolean available) {

        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
        this.available = available;
    }

    // Method to display book details
    void displayBookDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Available: " + available);
        System.out.println();
    }
}

public class Exp_1 {
    public static void main(String[] args) {

        // Creating two Book objects
        Book book1 = new Book(
            101, "Java Programming", "James Gosling",
            "Programming", 550.0, true
        );

        Book book2 = new Book(
            102, "Data Structures", "Mark Allen",
            "Computer Science", 600.0, false
        );

        // Displaying book details
        System.out.println("Book 1 Details");
        book1.displayBookDetails();

        System.out.println("Book 2 Details");
        book2.displayBookDetails();
    }
}
