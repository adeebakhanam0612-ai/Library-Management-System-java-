import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();

    // Add book
    void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    // Display all books
    void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book b : books) {
            System.out.println(b);
        }
    }

    // Search book by ID
    void searchBook(int id) {
        for (Book b : books) {
            if (b.id == id) {
                System.out.println("Book found:");
                System.out.println(b);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // Remove book by ID
    void removeBook(int id) {
        for (Book b : books) {
            if (b.id == id) {
                books.remove(b);
                System.out.println("Book removed successfully!");
                return;
            }
        }
        System.out.println("Book not found.");
    }
}