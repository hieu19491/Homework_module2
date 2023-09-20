package Student_Manager;

import java.util.ArrayList;

public class StudentManager {
    private Student[] listStudent;

    private int size;

    public StudentManager() {
        size = 0;
        this.listStudent = new Student[100];
    }

    public void add(Student student) {
        this.listStudent[size] = student;
        size++;
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.println(listStudent[i]);
        }
    }

    public void edit(int id, Student newStudent) {
        int index = fineById(id);
        listStudent[index] = newStudent;
    }

    public int fineById(int id) {
        for (int i = 0; i < size; i++) {
            if (id == listStudent[i].getId()) {
                return i;
            }
        }
        return -1;
    }

    public void delete(int id) {
        int index = fineById(id);
        for (int i = index; i < size; i++) {
            listStudent[i] = listStudent[i + 1];
        }
        size--;
    }

    public Student findStudentById(int id) {
        for (int i = 0; i < size; i++) {
            if (listStudent[i].getId() == id) {
                return listStudent[i];
            } else {
                return null;
            }
        }
        return null;
    }

    public double getAvgclass() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += listStudent[i].getAvg();
        }
        return sum / size;
    }

    public double getMaxAvg() {
        double maxAvg = listStudent[0].getAvg();
        for (int i = 0; i < size; i++) {
            if (maxAvg < listStudent[i].getAvg()) {
                maxAvg = listStudent[i].getAvg();
            }
        }
        return maxAvg;
    }

    public void getTopOne() {
        double topOne = getMaxAvg();
        if (size == 0) {
            System.out.println("Chưa có sinh viên nào trong danh sách.");
        } else {
            for (int i = 0; i < size; i++) {
                if (this.listStudent[i].getAvg() == getMaxAvg()) {
                    System.out.println(this.listStudent[i].toString());
                }
            }
        }
    }
    public ArrayList<Student> getStudentByName(String name){
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if(listStudent[i].getName().toLowerCase().contains(name.toLowerCase())){
                students.add(listStudent[i]);
            }
        }
        return students;
    }

    public Student[] getListStudent() {
        return this.listStudent;
    }


}
