package da7;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageStudents {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>(); // List to store Student instances
        int studentId = 1; // Auto-increment student ID
        int choice;

        do {
            // Display menu
            System.out.println("STUDENT MANAGEMENT SYSTEM");
            System.out.println("1. Insert new Student");
            System.out.println("2. View list of Students");
            System.out.println("3. Search Students by Class");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine(); // Clear newline character after number input

            switch (choice) {
                case 1:
                    // Insert new student
                    System.out.print("Enter full name: ");
                    String fullName = sc.nextLine();

                    System.out.print("Enter date of birth (dd/mm/yyyy): ");
                    String dob = sc.nextLine();

                    System.out.print("Enter native place: ");
                    String nativePlace = sc.nextLine();

                    System.out.print("Enter class: ");
                    String className = sc.nextLine();

                    System.out.print("Enter phone number: ");
                    String phoneNo = sc.nextLine();

                    System.out.print("Enter mobile number: ");
                    int mobile = sc.nextInt();

                    // Create a new Student instance and add to the list
                    Student student = new Student(studentId++, fullName, dob, nativePlace, className, phoneNo, mobile);
                    studentList.add(student);
                    System.out.println("Student added successfully.\n");
                    break;

                case 2:
                    // View list of students
                    for (Student s : studentList) {
                        s.Display();
                        System.out.println();
                    }
                    break;

                case 3:
                    // Search students by class
                    System.out.print("Enter class to search: ");
                    String searchClass = sc.nextLine();
                    boolean found = false;

                    for (Student s : studentList) {
                        if (s.getClassName().equalsIgnoreCase(searchClass)) {
                            s.Display();
                            System.out.println();
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("No students found in class " + searchClass);
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
