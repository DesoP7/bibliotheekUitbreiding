package magazine;

import java.time.LocalDate;

// Represents a weekly magazine
public class WeeklyMagazine extends Magazine {
    public WeeklyMagazine(long id, String title, String publisher, LocalDate publicationDate, String editor, int issueNumber, String isbn) {
        super(id, title, publisher, publicationDate, editor, issueNumber, isbn); // Calls the constructor of Magazine
    }
}