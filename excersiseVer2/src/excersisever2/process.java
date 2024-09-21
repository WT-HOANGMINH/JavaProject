package excersisever2;

import java.util.Scanner;

public class process {

    public static void menu() {
        System.out.println("1. Them sinh vien");
        System.out.println("2. Hien thi sinh vien");
        System.out.println("3. Tim sinh vien (bang id)");
        System.out.println("4. Xoa sinh vien (bang id)");
        System.out.println("5. Tim sinh vien co diem cao nhat");
        System.out.println("6. Hien thi sinh vien co hoc bong");
        System.out.println("7. Tong hoc phi cua tat ca sinh vien");
        System.out.println("0. Quay lai menu");
    }

    public static void main(String[] args) {

        StudentList studentlist = new StudentList();
        Scanner sc = new Scanner(System.in);
        String check = null;
        int checkout = 0, choice = 0;

        do {
            menu();
            System.out.println("Nhap lua chon cua ban: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1: {
                    do {
                        Students a = new Students();
                        a.addStudent();
                        studentlist.addStudent(a);
                        System.out.println("1 [tiep tuc] / 0 [quay lai menu]");
                        checkout = sc.nextInt();
                        sc.nextLine(); 
                    } while (checkout == 1);
                    break;
                }
                case 2: {
                    do {
                        studentlist.displayAllStudents();
                        System.out.println("1 [tiep tuc] / 0 [quay lai menu]");
                        checkout = sc.nextInt();
                        sc.nextLine(); 
                    } while (checkout == 1);
                    break;
                }
                case 3: {
                    do {
                        System.out.println("Nhap id hoc sinh ban muon tim: ");
                        check = sc.nextLine(); 
                        studentlist.findStudentById(check);
                        System.out.println("1 [tiep tuc] / 0 [quay lai menu]");
                        checkout = sc.nextInt();
                        sc.nextLine(); 
                    } while (checkout == 1);
                    break;
                }
                case 4: {
                    do {
                        System.out.println("Nhap id hoc sinh ban muon xoa: ");
                        check = sc.nextLine(); 
                        studentlist.deleteStudentById(check);
                        System.out.println("1 [tiep tuc] / 0 [quay lai menu]");
                        checkout = sc.nextInt();
                        sc.nextLine(); 
                    } while (checkout == 1);
                    break;
                }
                case 5: {
                    do {
                        System.out.println("Hoc sinh co diem cao nhat: ");
                        studentlist.findTopStudents().displayInfo();
                        System.out.println("1 [tiep tuc] / 0 [quay lai menu]");
                        checkout = sc.nextInt();
                        sc.nextLine(); 
                    } while (checkout == 1);
                    break;
                }
                case 6: {
                    do {
                        for (Students s : studentlist.findSchoolarShipStudents()) {
                            System.out.println("Sinh vien co hoc bong: ");
                            s.displayInfo();
                        }
                        System.out.println("1 [tiep tuc] / 0 [quay lai menu]");
                        checkout = sc.nextInt();
                        sc.nextLine();
                    } while (checkout == 1);
                    break;
                }
                case 7: {
                    do {
                        System.out.println("Tong hoc phi cua tat ca sinh vien: " + studentlist.caculateTuitionOfAllStudents());
                        System.out.println("1 [tiep tuc] / 0 [quay lai menu]");
                        checkout = sc.nextInt();
                        sc.nextLine(); 
                    } while (checkout == 1);
                    break;
                }
                case 0: {
                    System.out.println("Quay lai menu chinh.");
                    break;
                }
                default:
                    System.out.println("Khong co lua chon trong menu!");
                    checkout = 0;
                    break;
            }

        } while (choice != 0);
    }
}
