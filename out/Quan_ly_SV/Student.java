import java.util.Arrays;

public class Student {
    public String name;
    public int age;
    public int[] point;

    public Student(String nameInput, int ageInput, int[] pointInput) {
        this.name = nameInput;
        this.age = ageInput;
        this.point = pointInput;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", point=" + Arrays.toString(point) +
                '}';
    }

    public void setName(String nameInput) {
        this.name = nameInput;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int ageInput) {
        this.age = ageInput;
    }

    public int getAge() {
        return this.age;
    }

    public double getAvg() {
        double sum = 0;
        double count = 0;
        double avg = 0;
        for (int i = 0; i < this.point.length; i++) {
            sum += this.point[i];
            count++;
        }
        avg = sum / count;
        return avg;
    }
}

