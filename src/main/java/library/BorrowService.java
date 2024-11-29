package library;

import java.time.LocalDate;

// Service class for managing borrowing and returning items
public class BorrowService {
    private final BorrowedItems borrowedItems; // Repository for borrowed items

    // Constructor for initializing BorrowService with a BorrowedItems repository
    public BorrowService(BorrowedItems borrowedItems) {
        this.borrowedItems = borrowedItems;
    }

    // Handles borrowing an item
    public boolean borrowItem(Item item) {
        if (!item.isBorrowed()) { // Check if the item is not already borrowed
            item.setBorrowed(true); // Mark the item as borrowed
            item.setDueDate(LocalDate.now().plusDays(item.getLoanPeriod())); // Set the due date based on loan period
            borrowedItems.addBorrowedItem(item); // Add the item to the borrowed items list
            return true; // Borrowing successful
        }
        return false; // Borrowing failed (item is already borrowed)
    }

    // Handles returning an item
    public boolean returnItem(Item item) {
        if (item.isBorrowed()) { // Check if the item is currently borrowed
            item.setBorrowed(false); // Mark the item as returned
            item.setDueDate(null); // Clear the due date
            borrowedItems.removeBorrowedItem(item); // Remove the item from the borrowed items list
            return true; // Returning successful
        }
        return false; // Returning failed (item was not borrowed)
    }
}
