package magazine;

import library.Item;
import java.time.LocalDate;

public abstract class Magazine extends Item {
    private final String copyEditor;
    private final int pages;
    private final String isbn;
    private final int issueNumber;

    // Constructor
    public Magazine(long id, String title, String publisher, LocalDate publicationDate, String copyEditor, int pages, String isbn, int issueNumber) {
        super(id, title, publisher, pages, publicationDate);
        this.copyEditor = copyEditor;
        this.pages = pages;
        this.isbn = isbn;
        this.issueNumber = issueNumber;
    }

    // Getters
    public String getCopyEditor() {
        return copyEditor;
    }

    public int getPages() {
        return pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    @Override
    public abstract String getOverviewText();
}
