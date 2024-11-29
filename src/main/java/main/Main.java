package main;

import book.Book;
import library.*;
import magazine.DailyMagazine;
import magazine.MonthlyMagazine;
import magazine.WeeklyMagazine;

import java.time.LocalDate;
import java.util.List;

// Main class to demonstrate the library system functionality
public class Main {
    public static void main(String[] args) {
        // Initialize repositories
        BookRepository bookRepository = new BookRepository();
        MagazineRepository magazineRepository = new MagazineRepository();
        BorrowedItems borrowedItems = new BorrowedItems();
        BorrowService borrowService = new BorrowService(borrowedItems);

        // Add sample books to the repository
        bookRepository.addBook(new Book(1, "Book 1", "Publisher A", 300, LocalDate.of(2021, 1, 1), "Author A", "ISBN123"));
        bookRepository.addBook(new Book(2, "Book 2", "Publisher B", 400, LocalDate.of(2020, 5, 15), "Author B", "ISBN456"));

        // Add sample magazines to the repository
        magazineRepository.addMagazine(new DailyMagazine(3, "Daily Magazine 1", "Publisher C", LocalDate.of(2023, 11, 1), "Editor A", 1, "ISSN111", 123));
        magazineRepository.addMagazine(new WeeklyMagazine(4, "Weekly Magazine 1", "Publisher D", LocalDate.of(2023, 11, 8), "Editor B", 2, "ISSN222"));
        magazineRepository.addMagazine(new MonthlyMagazine(5, "Monthly Magazine 1", "Publisher E", LocalDate.of(2023, 10, 20), "Editor C", 3, "ISSN333"));

        // Display all items in the library
        List<Item> allItems = ItemList.getAllItems(bookRepository, magazineRepository);
        System.out.println("All Items in the Library:");
        for (Item item : allItems) {
            System.out.println(item.getOverviewText());
        }

        // Borrow an item (e.g., Book 1)
        Item itemToBorrow = bookRepository.findById(1); // Find the book by ID
        if (borrowService.borrowItem(itemToBorrow)) { // Attempt to borrow the book
            System.out.println("Borrowed: " + itemToBorrow.getOverviewText());
        } else {
            System.out.println("Failed to borrow the item.");
        }

        // Display all borrowed items
        System.out.println("\nBorrowed Items:");
        for (Item borrowedItem : borrowedItems.getAllBorrowedItems()) {
            System.out.println(borrowedItem.getOverviewText() + ", Due Date: " + borrowedItem.getDueDate());
        }

        // Return the borrowed item
        if (borrowService.returnItem(itemToBorrow)) { // Attempt to return the book
            System.out.println("\nReturned: " + itemToBorrow.getOverviewText());
        } else {
            System.out.println("\nFailed to return the item.");
        }

        // Display borrowed items after returning
        System.out.println("\nBorrowed Items after returning:");
        for (Item borrowedItem : borrowedItems.getAllBorrowedItems()) {
            System.out.println(borrowedItem.getOverviewText());
        }
    }
}
