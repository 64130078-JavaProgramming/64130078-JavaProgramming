package da3;

import java.util.Scanner;

public class ManagePhoneBook {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        int choice;
        
        do {
            System.out.println("PHONEBOOK MANAGEMENT SYSTEM");
            System.out.println("1. Insert Phone");
            System.out.println("2. Remove Phone");
            System.out.println("3. Update Phone");
            System.out.println("4. Search Phone");
            System.out.println("5. Sort");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine();  // Đọc ký tự thừa
            
            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter phone: ");
                    String phone = sc.nextLine();
                    phoneBook.insertPhone(name, phone);
                    break;
                case 2:
                    System.out.print("Enter name to remove: ");
                    name = sc.nextLine();
                    phoneBook.removePhone(name);
                    break;
                case 3:
                    System.out.print("Enter name to update: ");
                    name = sc.nextLine();
                    System.out.print("Enter new phone: ");
                    String newphone = sc.nextLine();
                    phoneBook.updatePhone(name, newphone);
                    break;
                case 4:
                    System.out.print("Enter name to search: ");
                    name = sc.nextLine();
                    phoneBook.searchPhone(name);
                    break;
                case 5:
                    phoneBook.sort();
                    System.out.println("Sorted phone book:");
                    for (String entry : phoneBook.PhoneList) {
                        System.out.println(entry);
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
            System.out.println();
        } while (choice != 6);
        
        sc.close();
	}
}
