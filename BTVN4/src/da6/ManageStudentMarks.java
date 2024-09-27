package da6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ManageStudentMarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ArrayList<StudentMark> studentList = new ArrayList<>();  // List to store StudentMark instances
        int studentId = 1;  // Auto-increment student ID
        int choice;

        do {
            // Display menu
            System.out.println("STUDENT MARK MANAGEMENT SYSTEM");
            System.out.println("1. Insert new student mark");
            System.out.println("2. View list of student marks");
            System.out.println("3. Average mark calculation");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            try {
                choice = sc.nextInt();
                sc.nextLine();  // Clear newline character after number input

                switch (choice) {
                    case 1:
                        // Insert new student mark
                        try {
                            System.out.print("Enter full name: ");
                            String fullName = sc.nextLine();

                            System.out.print("Enter class name: ");
                            String className = sc.nextLine();

                            System.out.print("Enter semester: ");
                            int semester = sc.nextInt();

                            // Create a new StudentMark instance
                            StudentMark student = new StudentMark(studentId++, fullName, className, semester);

                            // Input 5 subject marks
                            int[] marks = new int[5];
                            for (int i = 0; i < 5; i++) {
                                System.out.print("Enter mark for subject " + (i + 1) + ": ");
                                marks[i] = sc.nextInt();
                            }
                            student.setSubjectMarkList(marks);

                            // Add the student to the list
                            studentList.add(student);
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter valid data.");
                            sc.next();  // Consume the invalid token
                        } finally {
                            System.out.println("Student record inserted.");
                        }
                        break;

                    case 2:
                        // View list of student marks
                        for (StudentMark sm : studentList) {
                            sm.Display();
                            System.out.println();
                        }
                        break;

                    case 3:
                        // Calculate and display average marks
                        for (StudentMark sm : studentList) {
                            sm.AveCal();
                            sm.Display();
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
            } catch (InputMismatchException e) {
                System.out.println("Invalid option. Please enter a number.");
                sc.next();  // Consume the invalid token
                choice = 0;  // Reset choice to prevent exiting
            }

        } while (choice != 4);

        sc.close();
	}
}
