package Manager;

import Model.Student;

import java.util.ArrayList;

public interface IManager<H>{
    void add(H stundent);
    void delete(int id);
    void edit(int id, H student);
    ArrayList<Student> showAll();
}
