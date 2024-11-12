package magazine;

import java.time.LocalDate;

public class MonthlyMagazine extends Magazine {

    // Constructor
    public MonthlyMagazine(long id, String title, String publisher, LocalDate publicationDate, String copyEditor, int pages, String issn, int issueNumber) {
        super(id, title, publisher, publicationDate, copyEditor, pages, issn, issueNumber);
    }

    public int getMonthNumber() {
        return getPublicationDate().getMonthValue();
    }

    @Override
    public String getOverviewText() {
        return "Isbn: " + getIsbn() + " - Title: " + getTitle() + " - Month: " + getMonthNumber();
    }
}
