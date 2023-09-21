package View;

import Manager.StudentManager;
import Model.Student;

import java.util.Scanner;

public class Menu {
    private StudentManager studentManager = new StudentManager();
    private Scanner inputInt = new Scanner(System.in);
    private Scanner inputString = new Scanner(System.in);

    public void showMainMenu() {
        int choice;
        do {
            System.out.println("\n--- Quản lý sinh viên ---\n1.Thêm sinh viên.\n2.Xóa sinh viên.\n3.Sửa thông tin sinh viên.\n4.Tìm kiếm sinh viên theo ID.\n5.Hiện thị danh sách sinh viên theo tên gần đúng.\n6.Học viên có điểm trung bình cao nhất.\n7.Hiển thị tất cả.");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    showAddMenu();
                    break;
                case 2:
                    showDeleteMenu();
                    break;
                case 3:
                    showEditMenu();
                    break;
                case 4:
                    showSeachMenuById();
                    break;
                case 5:
                    showSeachMenuByName();
                    break;
                case 6:
                    showTheBestAverage();
                    break;
                case 7:
                    showAll();
                    break;
                case 0:
                    break;
            }
        } while (choice != 0);
    }

    public void showAddMenu() {
        System.out.println("--- 1.Thêm mới sinh viên ---");
        System.out.print("Nhập tên sinh viên: ");
        String name = inputString.nextLine();
        System.out.print("Nhập giới tính: ");
        String gender = inputString.nextLine();
        System.out.print("Nhập điểm Toán: ");
        int math = inputInt.nextInt();
        System.out.print("Nhập điểm Văn: ");
        int literature = inputInt.nextInt();
        System.out.print("Nhập điểm Anh: ");
        int english = inputInt.nextInt();
        Student student = new Student(name, gender, math, literature, english);
        studentManager.add(student);
        System.out.println("Thêm sinh viên thành công!!!");

    }

    public void showDeleteMenu() {
        System.out.println("\n--- 2.Xóa sinh viên ---");
        System.out.print("Nhập ID sinh viên muốn xóa: ");
        int id = inputInt.nextInt();
        if (studentManager.checkId(id) == false) {
            System.out.println("\nKhông có sinh viên này trong danh sách!!!");
        } else {
            studentManager.delete(id);
            System.out.println("Đã xóa sinh viên thành công!");
        }
    }

    public void showEditMenu() {
        System.out.println("\n--- 3.Sửa thông tin sinh viên ---");
        System.out.println("Nhập ID sinh viên muốn sửa: ");
        int id = inputInt.nextInt();
        if (studentManager.checkId(id) == false) {
            System.out.println("Không có sinh viên này trong danh sách!!!");
        } else {
            System.out.print("Nhập tên sinh viên: ");
            String name = inputString.nextLine();
            System.out.print("Nhập giới tính: ");
            String gender = inputString.nextLine();
            System.out.print("Nhập điểm Toán: ");
            int math = inputInt.nextInt();
            System.out.print("Nhập điểm Văn: ");
            int literature = inputInt.nextInt();
            System.out.print("Nhập điểm Anh: ");
            int english = inputInt.nextInt();
            Student student = new Student(id, name, gender, math, literature, english);
            studentManager.edit(id, student);
            System.out.println("\nSửa thông tin sinh viên thành công!!!");
        }
    }

    public void showSeachMenuById() {
        System.out.println("\n--- 4.Tìm kiếm sinh viên theo ID---");
        System.out.print("Nhập ID sinh viên muốn tìm: ");
        int id = inputInt.nextInt();
        if (studentManager.checkId(id) == false) {
            System.out.println("\nKhông có sinh viên này trong danh sách!!!");
        } else {
            System.out.println("\nThông tin sinh viên cần tìm: ");
            System.out.println(studentManager.findStudentById(id));
        }
    }

    public void showSeachMenuByName() {
        System.out.println("\n--- 5.Danh sách sinh viên cần tìm ---");
        System.out.println("Nhập tên bạn muốn tìm: ");
        String name = inputString.nextLine();
        if (studentManager.checkName(name) == false) {
            System.out.println("Không có sinh viên này trong danh sách");
        } else {
            System.out.println("\nDanh sách sinh viên cần tìm: ");
            for (Student student : studentManager.findStudentByName(name)) {
                System.out.println(student);
            }
        }

    }

    public void showTheBestAverage() {
        System.out.println("\n---Học viên ĐTB cao nhất---");
        studentManager.findTopinfo();
    }

    public void showAll() {
        Student[] students = studentManager.findAll();
        int size = studentManager.getSize();
        System.out.println("\nDanh sách sinh viên đang quản lý: \n");
        if (size == 0) {
            System.out.println("Danh sách sinh viên rỗng");
        }
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }


}


