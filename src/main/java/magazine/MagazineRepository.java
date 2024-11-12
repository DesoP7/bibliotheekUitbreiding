package magazine;

import java.util.ArrayList;
import java.util.List;

public class MagazineRepository {
    private final List<Magazine> magazines = new ArrayList<>();

    public void addMagazine(Magazine magazine) {
        magazines.add(magazine);
    }

    public List<Magazine> getAllMagazines() {
        return magazines;
    }

    public void removeMagazine(long id) {
        magazines.removeIf(magazine -> magazine.getId() == id);
    }
}
