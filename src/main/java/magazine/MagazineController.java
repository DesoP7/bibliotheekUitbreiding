package magazine;

import library.MagazineRepository;

import java.time.LocalDate;
import java.util.Scanner;

public class MagazineController {
    private static final MagazineRepository magazineRepository = new MagazineRepository();

    public static void showMenu() {
        System.out.println("1. Show all magazines");
        System.out.println("2. Add a new magazine");
        // Handle other options...
    }

    public static void showAllMagazines() {
        magazineRepository.getAllMagazines().forEach(magazine -> System.out.println(magazine.getOverviewText()));
    }

    public static void addMagazine() {
        Scanner scanner = new Scanner(System.in);
        // Gather input for new magazine...
        Magazine newMagazine = new DailyMagazine(1,"title","publisher", LocalDate.now(),"123",200,"isbn",123); // or WeeklyMagazine, MonthlyMagazine
        magazineRepository.addMagazine(newMagazine);
    }
}
