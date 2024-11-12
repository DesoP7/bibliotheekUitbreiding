package magazine;

import java.time.LocalDate;

public class DailyMagazine extends Magazine {

    // Constructor
    public DailyMagazine(long id, String title, String publisher, LocalDate publicationDate, String copyEditor, int pages, String issn, int issueNumber) {
        super(id, title, publisher, publicationDate, copyEditor, pages, issn, issueNumber);
    }

    @Override
    public String getOverviewText() {
        return "Isbn: " + getIsbn() + " - Title: " + getTitle() + " - Issue: " + getIssueNumber();
    }
}
