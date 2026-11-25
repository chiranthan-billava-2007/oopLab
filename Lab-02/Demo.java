class Book {
    int bookId;
    String title;
    String author;
    double price;

    static int totalBooks = 0;

    
    Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;

        totalBooks++;
    }

    // Display book information
    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }

    // Search by Book ID
    boolean search(int id) {
        return bookId == id;
    }

    // Search by Title
    boolean search(String title) {
        return this.title.equalsIgnoreCase(title);
    }

    // Return the costlier book
    Book costlierBook(Book b) {
        if (this.price > b.price)
            return this;
        else
            return b;
    }

    // Static method to display total books
    static void displayTotalBooks() {
        System.out.println("Total Books Created: " + totalBooks);
    }
}

public class Demo {
    public static void main(String[] args) {

        // Creating book objects
        Book b1 = new Book(101, "Java Programming", "James Gosling", 550);
        Book b2 = new Book(102, "Python Basics", "Guido van Rossum", 450);
        Book b3 = new Book(103, "Data Structures", "Mark Allen", 650);

        // Display book information
        System.out.println("BOOK 1");
        b1.display();

        System.out.println("BOOK 2");
        b2.display();

        System.out.println("BOOK 3");
        b3.display();

        // Search by Book ID
        System.out.println("Search by Book ID:");
        if (b1.search(101))
            System.out.println("Book ID 101 found.");
        else
            System.out.println("Book not found.");

        // Search by Title
        System.out.println("\nSearch by Title:");
        if (b2.search("Python Basics"))
            System.out.println("Python Basics found.");
        else
            System.out.println("Book not found.");

        // Find costlier book
        Book costly = b1.costlierBook(b3);

        System.out.println("\nCostlier Book:");
        costly.display();

        // Display total number of books
        Book.displayTotalBooks();
    }
}