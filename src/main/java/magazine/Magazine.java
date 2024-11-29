package magazine;

import library.Item;

import java.time.LocalDate;

// Represents a general magazine in the library (base class for specific magazine types)
public abstract class Magazine extends Item {
    private final String editor; // Editor of the magazine
    private final int issueNumber; // Issue number of the magazine
    private final String isbn; // ISBN of the magazine

    // Constructor for initializing a Magazine
    public Magazine(long id, String title, String publisher, LocalDate publicationDate, String editor, int issueNumber, String isbn) {
        super(id, title, publisher, publicationDate); // Calls the constructor of Item
        this.editor = editor;
        this.issueNumber = issueNumber;
        this.isbn = isbn;
    }

    // Getters for magazine-specific properties
    public String getEditor() {
        return editor;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public String getIsbn() {
        return isbn;
    }

    // Overrides the abstract method to return a detailed overview of the magazine
    @Override
    public String getOverviewText() {
        return "Magazine - ID: " + getId() + ", Title: " + getTitle() + ", Editor: " + editor + ", Issue: " + issueNumber + ", ISBN: " + isbn + ", Borrowed: " + isBorrowed();
    }
}
