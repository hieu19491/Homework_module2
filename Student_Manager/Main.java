package Student_Manager;

import com.sun.media.sound.SoftTuning;

public class Main {


    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        double[] points = {5.6, 7.8, 9.8};
        Student student = new Student("Dân", points, "Nam");

        double[] points1 = {8.0, 6.5, 7.5};
        Student student1 = new Student("Đức", points1, "Nam");

        double[] points2 = {7.6, 5.7, 7.0 };
        Student student2 = new Student("Mai", points2, "Nữ");

        double[] points3 = {8.7, 8.0, 9.5};
        Student student3 = new Student("Hiếu", points3, "Nam");

        studentManager.add(student);
        studentManager.add(student1);
        studentManager.add(student2);
        studentManager.add(student3);
        studentManager.show();

        double[] points5 = {6.7, 5.0, 6.0};
        Student student5 = new Student("Đề", points5, "Nam");
        studentManager.edit(3, student5);
        System.out.println("Sau khi sửa:");
        studentManager.show();

        studentManager.delete(2);
        System.out.println("Sau khi xóa:");
        studentManager.show();

        System.out.println("Tìm sinh viên theo ID:");
        System.out.println(studentManager.findStudentById(5));;

        System.out.println("điểm trung bình của một sinh viên:");
        System.out.println((double) Math.round(student1.getAvg() * 100) / 100);

        System.out.println("Điểm trung bình của cả lớp: ");
        System.out.println((double) Math.round(studentManager.getAvgclass() * 100) / 100);


        System.out.println("Sinh viên có điểm trung bình lớn nhất: ");
        System.out.print("Điểm trung bình cao nhất: ");
        System.out.println(studentManager.getMaxAvg());
        System.out.print("Thông tinh sinh viên có điểm cao nhất: ");
        studentManager.getTopOne();

        System.out.println("Danh sách sinh viên có vần D: ");
        for (Student studentlist: studentManager.getStudentByName("h")) {
            System.out.println(studentlist);
        }


    }
}
