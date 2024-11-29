package library;

import magazine.Magazine;

import java.util.ArrayList;
import java.util.List;

// Repository for managing the list of magazines in the library
public class MagazineRepository {
    private final List<Magazine> magazines = new ArrayList<>(); // List to store all magazines

    // Adds a magazine to the repository
    public void addMagazine(Magazine magazine) {
        magazines.add(magazine);
    }

    // Returns all magazines in the repository
    public List<Magazine> getAllMagazines() {
        return magazines;
    }

    // Finds a magazine by its ID
    public Magazine findById(long id) {
        return magazines.stream().filter(magazine -> magazine.getId() == id).findFirst().orElse(null);
    }
}
