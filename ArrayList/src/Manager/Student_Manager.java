package Manager;

import Model.Student;

import java.util.ArrayList;

public class Student_Manager implements IManager<Student> {
    private ArrayList<Student> listStudent = new ArrayList<>();

    public Student_Manager() {
        add(new Student("Hiếu", 32, "Hà Nội", "C06"));
        add(new Student("Dân", 17, "Hà Nội", "C06"));
    }

    public Student_Manager(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }

    public ArrayList<Student> getListStudent() {
        return listStudent;
    }

    public void setListStudent(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }

    @Override
    public void add(Student stundent) {
        this.listStudent.add(stundent);
    }
    public int getIndex(int id){
        for (int i = 0; i < this.listStudent.size(); i++) {
            if(id == this.listStudent.get(i).getId()){
                return i;
            }
        }
        return -1;
    }
    public boolean checkID(int id){
        boolean checkID = true;
        int index = getIndex(id);
        if(index == -1){
            checkID = false;
        }
        return checkID;
    }

    @Override
    public void delete(int id) {
        int index = getIndex(id);
        this.listStudent.remove(index);
    }

    @Override
    public void edit(int id, Student student) {
        int index = getIndex(id);
        this.listStudent.set(index, student);
    }

    @Override
    public ArrayList<Student> showAll() {
        return this.listStudent;
    }
}
