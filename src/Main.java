import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter maximum number of students: ");
        int size = scanner.nextInt();
        StudentManagement manager = new StudentManagement(size);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Sort Students");
            System.out.println("5. Display All Students");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    String id = scanner.next();
                    System.out.print("Enter Student Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Marks: ");
                    double marks = scanner.nextDouble();
                    manager.addStudent(id, name, marks);
                    break;
                case 2:
                    System.out.print("Enter Student ID to edit: ");
                    id = scanner.next();
                    System.out.print("Enter new name: ");
                    name = scanner.next();
                    System.out.print("Enter new marks: ");
                    marks = scanner.nextDouble();
                    manager.editStudent(id, name, marks);
                    break;
                case 3:
                    System.out.print("Enter Student ID to delete: ");
                    id = scanner.next();
                    manager.deleteStudent(id);
                    break;
                case 4:
                    manager.sortStudents();
                    break;
                case 5:
                    manager.displayStudents();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}