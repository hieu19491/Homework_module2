package Manager;

import Model.Student;

import java.util.ArrayList;

public class StudentManager implements IManager<Student> {
    private Student[] listStudent = new Student[100];
    private int size = 0;

    public StudentManager() {
        add(new Student("Hiếu", "Nam", 10, 10, 10));
        add(new Student("Đức", "Nam", 9, 9, 9));
        add(new Student("Lộc", "Nam", 8, 8, 8));
        add(new Student("Mai", "Nữ", 7, 7, 7));
        add(new Student("Đề", "Nam", 6, 6, 6));
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public void add(Student student) {
        this.listStudent[size] = student;
        this.size++;
    }

    public int findById(int id) {
        for (int i = 0; i < size; i++) {
            if (id == this.listStudent[i].getId()) {
                return i;
            }
        }
        return -1;
    }

    public Student findStudentById(int id) {
        for (Student student : this.listStudent) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public ArrayList<Student> findStudentByName(String name) {
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (listStudent[i].getName().toLowerCase().contains(name.toLowerCase())) {
                students.add(listStudent[i]);
            }
        }
        return students;
    }

    public boolean checkName(String name) {
        boolean checkName = false;
        for (int i = 0; i < size; i++) {
            if (listStudent[i].getName().toLowerCase().contains(name.toLowerCase())) {
                checkName = true;
            }
        }
        return checkName;
    }

    @Override
    public void delete(int id) {
        int index = findById(id);
        for (int i = 0; i < size; i++) {
            this.listStudent[index] = this.listStudent[i + 1];
        }
        size--;
    }

    @Override
    public void edit(int id, Student student) {
        int index = findById(id);
        this.listStudent[index] = student;
    }

    public boolean checkId(int id) {
        boolean checkId = true;
        int index = findById(id);
        if (index == -1) {
            checkId = false;
        }
        return checkId;
    }

    public double maxAverage() {
        double maxAvg = this.listStudent[0].getAverage();
        for (int i = 0; i < size; i++) {
            if (maxAvg < this.listStudent[i].getAverage()) {
                maxAvg = this.listStudent[i].getAverage();
            }
        }
        return maxAvg;
    }

    public void findTopinfo() {
        if (size == 0) {
            System.out.println("Chưa có sinh viên nào trong danh sách!!!");
        } else {
            for (int i = 0; i < size; i++) {
                if (this.listStudent[i].getAverage() == maxAverage()) {
                    System.out.println(this.listStudent[i].toString());
                }
            }
        }
    }

    @Override
    public Student[] findAll() {
        return this.listStudent;
    }
}
