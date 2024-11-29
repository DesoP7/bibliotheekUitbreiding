package library;

import java.util.ArrayList;
import java.util.List;

// Represents a repository for managing borrowed items
public class BorrowedItems {
    private final List<Item> borrowedItems = new ArrayList<>(); // List to store all borrowed items

    // Adds an item to the borrowed items list
    public void addBorrowedItem(Item item) {
        borrowedItems.add(item);
    }

    // Removes an item from the borrowed items list
    public void removeBorrowedItem(Item item) {
        borrowedItems.remove(item);
    }

    // Returns all borrowed items
    public List<Item> getAllBorrowedItems() {
        return borrowedItems;
    }
}
