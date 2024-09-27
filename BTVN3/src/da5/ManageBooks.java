package da5;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageBooks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();  // List to store books
        int bookId = 1;  // Auto-increment book ID
        int choice;

        do {
            // Display menu
            System.out.println("BOOK MANAGEMENT SYSTEM");
            System.out.println("1. Insert new book");
            System.out.println("2. View list of books");
            System.out.println("3. Average Price");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine();  // Clear newline character after number input

            switch (choice) {
                case 1:
                    // Insert new book
                    System.out.print("Enter book name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter publish date: ");
                    String publishDate = sc.nextLine();

                    System.out.print("Enter author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter language: ");
                    String language = sc.nextLine();

                    // Create a new Book instance
                    Book book = new Book(bookId++, name, publishDate, author, language);

                    // Input 5 prices
                    int[] prices = new int[5];
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Enter price " + (i + 1) + ": ");
                        prices[i] = sc.nextInt();
                    }
                    book.setPriceList(prices);

                    // Add the book to the list
                    bookList.add(book);
                    break;

                case 2:
                    // View list of books
                    for (Book b : bookList) {
                        b.display();
                        System.out.println();
                    }
                    break;

                case 3:
                    // Calculate and display average price
                    for (Book b : bookList) {
                        b.calculate();
                        b.display();
                        System.out.println();
                    }
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option, please try again.");
            }
        } while (choice != 4);

        sc.close();

	}
}
