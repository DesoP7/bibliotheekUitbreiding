package library;

import java.time.LocalDate;

public abstract class Item {
    private final long id;
    private final String title;
    private final String publisher;
    private final LocalDate publicationDate;

    // Constructor
    public Item(long id, String title, String publisher, int pages, LocalDate publicationDate) {
        this.id = id;
        this.title = title;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
    }

    // Getters
    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    // Abstract method
    public abstract String getOverviewText();
}
