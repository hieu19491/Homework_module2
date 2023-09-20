package Student_Manager;

import java.util.Arrays;

public class Student {
    private int id;
    private String name;
    private double[] points;
    private String sex;
    private static int idIncrement = 1;


    public Student() {
    }


    public Student(String name, double[] points, String sex) {
        this.id = idIncrement;
        this.name = name;
        this.points = points;
        this.sex = sex;
        idIncrement++;
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

    public double[] getPoints() {
        return points;
    }

    public void setPoints(double[] points) {
        this.points = points;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", points=" + Arrays.toString(points) +
                ", sex='" + sex + '\'' +
                '}';
    }

    public double getAvg() {
        double sum = 0;
        for (double point : points) {
            sum += point;
        }
        return sum / 3;
    }

}
