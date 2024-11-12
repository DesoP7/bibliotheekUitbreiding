package book;

import library.Item;
import java.time.LocalDate;

public class Book extends Item {
    private String author;
    private final String isbn;
    private boolean borrowed; // New field to track borrowing status

    // Constructor
    public Book(long id, String title, String publisher, int pages, LocalDate publicationDate, String author, String isbn) {
        super(id, title, publisher, pages, publicationDate);
        this.author = author;
        this.isbn = isbn;
        this.borrowed = false; // Default to not borrowed
    }

    // Getter and setter for author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for ISBN
    public String getIsbn() {
        return isbn;
    }

    // New methods for borrowed status
    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    // Overridden method to provide book overview text
    @Override
    public String getOverviewText() {
        return "Isbn: " + isbn + " - Title: " + getTitle() + " - Author: " + author;
    }
}
