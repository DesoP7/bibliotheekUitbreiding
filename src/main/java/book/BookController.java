package book;

import java.time.LocalDate;
import java.util.Scanner;

public class BookController {
    private static final BookRepository bookRepository = new BookRepository();
    private static final Scanner scanner = new Scanner(System.in);

    // Show the main menu
    public static void showMenu() {
        int choice;
        do {
            System.out.println("\n--- Book Management Menu ---");
            System.out.println("1. Show All Books");
            System.out.println("2. Show Borrowed Books");
            System.out.println("3. Add Book");
            System.out.println("4. Remove Book");
            System.out.println("5. Borrow Book");
            System.out.println("6. Return Book");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1 -> showAllBooks();
                case 2 -> showBorrowedBooks();
                case 3 -> addBook();
                case 4 -> removeBook();
                case 5 -> borrowBook();
                case 6 -> returnBook();
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    // Show all books
    private static void showAllBooks() {
        System.out.println("\n--- All Books ---");
        for (Book book : bookRepository.getAllBooks()) {
            System.out.println(book.getOverviewText());
        }
    }

    // Show borrowed books
    private static void showBorrowedBooks() {
        System.out.println("\n--- Borrowed Books ---");
        for (Book book : bookRepository.getBorrowedBooks()) {
            System.out.println(book.getOverviewText());
        }
    }

    // Add a new book
    private static void addBook() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book publisher: ");
        String publisher = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        System.out.print("Enter number of pages: ");
        int pages = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Enter publication date (yyyy-mm-dd): ");
        LocalDate publicationDate = LocalDate.parse(scanner.nextLine());

        Book newBook = new Book(System.currentTimeMillis(), title, publisher, pages, publicationDate, author, isbn);
        bookRepository.addBook(newBook);
        System.out.println("Book added successfully.");
    }

    // Remove a book by ID
    private static void removeBook() {
        System.out.print("Enter book ID to remove: ");
        long id = scanner.nextLong();
        scanner.nextLine();  // Consume newline

        if (bookRepository.removeBook(id)) {
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }

    // Borrow a book by ID
    private static void borrowBook() {
        System.out.print("Enter book ID to borrow: ");
        long id = scanner.nextLong();
        scanner.nextLine();  // Consume newline

        if (bookRepository.borrowBook(id)) {
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book not found or already borrowed.");
        }
    }

    // Return a book by ID
    private static void returnBook() {
        System.out.print("Enter book ID to return: ");
        long id = scanner.nextLong();
        scanner.nextLine();  // Consume newline

        if (bookRepository.returnBook(id)) {
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book not found or not currently borrowed.");
        }
    }
}
