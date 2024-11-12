package magazine;

import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class WeeklyMagazine extends Magazine {

    // Constructor
    public WeeklyMagazine(long id, String title, String publisher, LocalDate publicationDate, String copyEditor, int pages, String issn, int issueNumber) {
        super(id, title, publisher, publicationDate, copyEditor, pages, issn, issueNumber);
    }

    public int getWeekNumber() {
        return getPublicationDate().get(WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear());
    }

    @Override
    public String getOverviewText() {
        return "Issn: " + getIsbn() + " - Title: " + getTitle() + " - Week: " + getWeekNumber();
    }
}
