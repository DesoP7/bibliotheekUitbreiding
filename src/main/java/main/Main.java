package main;

import book.BookController;
import magazine.MagazineController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Manage books");
            System.out.println("2. Manage magazines");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    BookController.showMenu();
                    break;
                case 2:
                    MagazineController.showMenu();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
