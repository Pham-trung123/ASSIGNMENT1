import java.util.ArrayList;
import java.util.Comparator;

public class StudentManagement {
    private ArrayList<Student> students;
    private int maxSize;

    public StudentManagement(int size) {
        this.maxSize = size;
        this.students = new ArrayList<>(size);
    }

    // Thêm học sinh
    public void addStudent(String id, String name, double marks) {
        if (students.size() < maxSize) {
            students.add(new Student(id, name, marks));
            System.out.println("Student added successfully!");
        } else {
            System.out.println("Cannot add more students, maximum limit reached.");
        }
    }

    // Chỉnh sửa thông tin học sinh
    public void editStudent(String id, String name, double marks) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                student.setName(name);
                student.setMarks(marks);
                System.out.println("Student information updated successfully!");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    // Xóa học sinh
    public void deleteStudent(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                students.remove(student);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    // Sắp xếp học sinh theo điểm
    public void sortStudents() {
        students.sort(Comparator.comparingDouble(Student::getMarks));
        System.out.println("Students sorted by marks.");
    }

    // Hiển thị tất cả học sinh
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("\nList of Students:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}
