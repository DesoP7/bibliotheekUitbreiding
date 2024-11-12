package book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookRepository {
    private final List<Book> books = new ArrayList<>();

    // Add a new book to the repository
    public void addBook(Book book) {
        books.add(book);
    }

    // Remove a book by its ID
    public boolean removeBook(long id) {
        books.removeIf(book -> book.getId() == id);
        return false;
    }

    // Method to return all borrowed books
    public List<Book> getBorrowedBooks() {
        return books.stream().filter(Book::isBorrowed).collect(Collectors.toList());
    }

    // Borrow a book by ID
    public boolean borrowBook(long id) {
        books.stream().filter(book -> book.getId() == id).findFirst().ifPresent(book -> book.setBorrowed(true));
        return false;
    }

    // Return a book by ID
    public boolean returnBook(long id) {
        books.stream().filter(book -> book.getId() == id).findFirst().ifPresent(book -> book.setBorrowed(false));
        return false;
    }

    public Book[] getAllBooks() {
        //TODO CODE HERE
        return null;
    }

    // Other repository methods...
}
