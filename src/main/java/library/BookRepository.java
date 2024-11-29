package library;

import book.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Repository for managing the list of books in the library
public class BookRepository {
    private final List<Book> books = new ArrayList<>(); // List to store all books

    // Adds a book to the repository
    public void addBook(Book book) {
        books.add(book);
    }

    // Returns all books in the repository
    public List<Book> getAllBooks() {
        return books;
    }

    // Finds a book by its ID
    public Book findById(long id) {
        return books.stream().filter(book -> book.getId() == id).findFirst().orElse(null);
    }

    // Returns a list of all borrowed books
    public List<Book> getBorrowedBooks() {
        return books.stream()
                .filter(Book::isBorrowed) // Filters books that are currently borrowed
                .collect(Collectors.toList()); // Collects the result into a list
    }
}

