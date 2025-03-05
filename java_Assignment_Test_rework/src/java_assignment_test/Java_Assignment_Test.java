package java_assignment_test;

import java.util.*;

public class Java_Assignment_Test {

    class Student {

        String id;
        String name;
        int birthYear;
        double gpa;
        List<String> subjects;

        public Student(String id, String name, int birthYear, double gpa, List<String> subjects) {
            this.id = id;
            this.name = name;
            this.birthYear = birthYear;
            this.gpa = gpa;
            this.subjects = subjects;
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Name: " + name + ", Birth Year: " + birthYear + ", GPA: " + gpa + ", Subjects: " + subjects;
        }
    }

    public static class StudentManager {

        private List<Student> students = new ArrayList<>();
        private Scanner scanner = new Scanner(System.in);

        public void addStudent() {
            System.out.print("Enter ID: ");
            String id = scanner.next(); // Lỗi 1: Không kiểm tra ID trùng
            System.out.print("Enter Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Enter Birth Year: ");
            int birthYear = scanner.nextInt(); // Lỗi 3: Không kiểm tra năm sinh hợp lệ
            System.out.print("Enter GPA: ");
            double gpa = scanner.nextDouble(); // Lỗi 2: Không kiểm tra GPA hợp lệ
            scanner.nextLine();
            System.out.print("Enter Subjects (comma separated): ");
            List<String> subjects = new ArrayList<>(Arrays.asList(scanner.nextLine().split(",")));

            students.add(new Student(id, name, birthYear, gpa, subjects));
        }

        public void printStudents() {
            for (Student s : students) {
                System.out.println(s);
            }
        }

        public void updateStudent() {
            System.out.print("Enter ID to update: ");
            String id = scanner.next();
            for (Student s : students) {
                if (s.id.equals(id)) {
                    System.out.print("Enter New Name: ");
                    scanner.nextLine();
                    s.name = scanner.nextLine();
                    System.out.print("Enter New GPA: ");
                    s.gpa = scanner.nextDouble(); // Lỗi 2: Không kiểm tra GPA hợp lệ
                    return;
                }
            }
            System.out.println("Student not found!");
        }

        public void deleteStudent() {
            System.out.print("Enter ID to delete: ");
            String id = scanner.next();
            students.removeIf(s -> s.id.equals(id)); // Lỗi 7: Không kiểm tra ID tồn tại
        }

        public void findStudentById() {
            System.out.print("Enter ID to search: ");
            String id = scanner.next();
            for (Student s : students) {
                if (s.id.equals(id)) {
                    System.out.println("Student not found!"); // Lỗi 4: Luôn in "Không tìm thấy"
                    return;
                }
            }
        }

        public void findStudentByName() {
            System.out.print("Enter Name to search: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            for (Student s : students) {
                if (s.name.equalsIgnoreCase(name)) {
                    System.out.println(s);
                    return; // Lỗi 8: Dừng ngay sau lần tìm đầu tiên
                }
            }
        }

        public void sortStudentsByGPA() {
            students.sort(Comparator.comparingDouble(s -> s.gpa)); // Lỗi 5: Sắp xếp sai (tăng dần thay vì giảm dần)
            System.out.println("Sorted by GPA!");
        }
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Student\n2. Print Students\n3. Update Student\n4. Delete Student\n5. Find by ID\n6. Find by Name\n7. Sort by GPA\n8. Exit");
            System.out.print("Choose an option: ");
            int choice;
            try {
                choice = scanner.nextInt(); // Lỗi 6: Không kiểm tra input số hợp lệ
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next();
                continue;
            }
            switch (choice) {
                case 1:
                    manager.addStudent();
                    break;
                case 2:
                    manager.printStudents();
                    break;
                case 3:
                    manager.updateStudent();
                    break;
                case 4:
                    manager.deleteStudent();
                    break;
                case 5:
                    manager.findStudentById();
                    break;
                case 6:
                    manager.findStudentByName();
                    break;
                case 7:
                    manager.sortStudentsByGPA();
                    break;
                case 8:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

}
