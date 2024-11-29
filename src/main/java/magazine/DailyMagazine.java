package magazine;

import java.time.LocalDate;

// Represents a daily magazine
public class DailyMagazine extends Magazine {
    public DailyMagazine(long id, String title, String publisher, LocalDate publicationDate, String editor, int issueNumber, String isbn, int i) {
        super(id, title, publisher, publicationDate, editor, issueNumber, isbn); // Calls the constructor of Magazine
    }
}