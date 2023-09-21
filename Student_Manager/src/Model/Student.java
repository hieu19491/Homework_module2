package Model;

import java.util.Arrays;

public class Student {
    private int id;
    private String name;
    private String gender;
    private double[] point;
    public static int idIncrement = 1;

    public Student(String name, String gender, double point1, double point2, double point3) {
        this.id = idIncrement;
        this.name = name;
        this.gender = gender;
        this.point = new double[]{point1, point2, point3};
        idIncrement++;
    }

    public Student(int id, String name, String gender, double point1, double point2, double point3) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.point = new double[]{point1, point2, point3};
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double[] getPoint() {
        return point;
    }

    public void setPoint(double[] point) {
        this.point = point;
    }

    public double getAverage() {
        double sum = 0;
        for (int i = 0; i < this.point.length; i++) {
            sum += this.point[i];
        }
        return (double) Math.round((sum / 3) * 100) / 100;
    }

    @Override
    public String toString() {
        return  id +
                ". Tên SV: " + name +
                ", Giới tính: " + gender +
                ", Điểm (Toán, Văn, Anh):" + Arrays.toString(point) +
                ", ĐTB =" + getAverage() +
                '}';
    }
}
