package library;

import java.util.ArrayList;
import java.util.List;

// Utility class to get all items (books and magazines) as a single list
public class ItemList {
    public static List<Item> getAllItems(BookRepository bookRepository, MagazineRepository magazineRepository) {
        List<Item> items = new ArrayList<>();
        items.addAll(bookRepository.getAllBooks()); // Add all books to the list
        items.addAll(magazineRepository.getAllMagazines()); // Add all magazines to the list
        return items;
    }
}
