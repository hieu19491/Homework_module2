package View;

import Manager.Student_Manager;
import Model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Student_Manager studentManager = new Student_Manager();
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);

    public void showMainMenu(){
        int choice;
        do {
            System.out.println("\n----- Chương trình quản lý học sinh -----\n" +
                    "1. Thêm học sinh mới\n" +
                    "2. Sửa học sinh\n" +
                    "3. Xóa học sinh\n" +
                    "4. Hiển thị các học sinh 20 tuổi\n" +
                    "5. Cho biết số lượng các học sinh có tuổi là 23 và quê ở Đà Nẵng.\n" +
                    "6. Hiển thị danh sách học sinh.\n" +
                    "0. Thoát chương trình.\n");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = inputInt.nextInt();
            switch (choice){
                case 1:
                    showAddMenu();
                    break;
                case 2:
                    showEditMenu();
                    break;
                case 3:
                    showDeleteMenu();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    showInfo();
                    break;
                case 0:
                    break;
            }
        }while (choice != 0);
    }
    public void showAddMenu(){
        System.out.println("\n----- Thêm học sinh -----");
        System.out.println("Nhập tên học sinh: ");
        String  name = inputString.nextLine();
        System.out.println("Nhập tuổi học sinh: ");
        int age = inputInt.nextInt();
        System.out.println("Nhập quê quán: ");
        String address = inputString.nextLine();
        System.out.println("Nhập lớp: ");
        String  clazz = inputString.nextLine();
        Student newStudent = new Student(name, age, address, clazz);
        studentManager.add(newStudent);
        System.out.println("\nThêm học sinh thành công!!!");
        System.out.printf("---------------------------------\n");
    }
    public void showEditMenu() {
        System.out.println("\n----- 3.Sửa thông tin học sinh -----");
        System.out.println("Nhập ID học sinh muốn sửa: ");
        int id = inputInt.nextInt();
        if (studentManager.checkID(id) == false) {
            System.out.println("\nKhông có học sinh này trong danh sách!!!");
            System.out.printf("---------------------------------\n");
        } else {
            System.out.println("Nhập tên học sinh: ");
            String  name = inputString.nextLine();
            System.out.println("Nhập tuổi học sinh: ");
            int age = inputInt.nextInt();
            System.out.println("Nhập quê quán: ");
            String address = inputString.nextLine();
            System.out.println("Nhập lớp: ");
            String  clazz = inputString.nextLine();
            Student student = new Student(id, name, age, address, clazz);
            studentManager.edit(id, student);
            System.out.println("\nSửa thông tin thành công!!!");
            System.out.printf("---------------------------------\n");
        }
    }
    public void showDeleteMenu(){
        System.out.println("\n----- Xóa học sinh -----");
        System.out.println("Nhập ID học sinh muốn sửa: ");
        int id = inputInt.nextInt();
        if (studentManager.checkID(id) == false) {
            System.out.println("\nKhông có học sinh này trong danh sách!!!");
            System.out.printf("---------------------------------\n");
        } else {
            studentManager.delete(id);
            System.out.println("\nSửa thông tin thành công!!!");
            System.out.printf("---------------------------------\n");
        }
    }

    public void showInfo(){
        ArrayList<Student> students = studentManager.showAll();
        System.out.println("\n-----Danh sách học sinh-----");
        if(studentManager.showAll().size() == 0){
            System.out.println("Danh sách học sinh rỗng!!!\n");
        }else {
            for (int i = 0; i < studentManager.showAll().size(); i++) {
                System.out.println(students.get(i));
            }
        }
        System.out.printf("---------------------------------\n");
    }

}
