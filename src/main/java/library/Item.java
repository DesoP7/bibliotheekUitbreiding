package library;

import java.time.LocalDate;

// Base class for all library items
public abstract class Item {
    private final int id;
    private final String title;
    private final String author;
    private LocalDate borrowedDate; // New field to track borrowing

    // Constructor
    public Item(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.borrowedDate = null; // Initially, the item is not borrowed
    }

    // Returns the item's ID
    public int getId() {
        return id;
    }

    // Returns the item's title
    public String getTitle() {
        return title;
    }

    // Returns the item's author
    public String getAuthor() {
        return author;
    }

    // Sets the borrowed date to mark the item as borrowed
    public void borrowItem(LocalDate date) {
        this.borrowedDate = date;
    }

    // Marks the item as returned
    public void returnItem() {
        this.borrowedDate = null;
    }

    // Checks if the item is currently borrowed
    public boolean isBorrowed() {
        return borrowedDate != null; // If borrowedDate is set, the item is borrowed
    }

    // Abstract method for child classes to implement
    public abstract String getOverviewText();
}
