package book;

import library.Item;

import java.time.LocalDate;

// Represents a book in the library
public class Book extends Item {
    private final String author; // Author of the book
    private final String isbn; // ISBN of the book
    private final int pages; // Number of pages in the book

    // Constructor for initializing a Book
    public Book(long id, String title, String publisher, int pages, LocalDate publicationDate, String author, String isbn) {
        super(id, title, publisher, publicationDate); // Calls the constructor of Item
        this.pages = pages;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters for book-specific properties
    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPages() {
        return pages;
    }

    // Overrides the abstract method to return a detailed overview of the book
    @Override
    public String getOverviewText() {
        return "Book - ID: " + getId() + ", Title: " + getTitle() + ", Author: " + author + ", ISBN: " + isbn + ", Pages: " + pages + ", Borrowed: " + isBorrowed();
    }
}
