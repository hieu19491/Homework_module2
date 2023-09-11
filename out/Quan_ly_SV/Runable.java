public class Runable {
    public static void main(String[] args) {
        int[] point1 = {4,6,7};
        Student student1 = new Student("Hiếu", 32, point1);
        int[] point2 = {8,6,9};
        Student student2 = new Student("Dân", 17, point2);
        student1.setName("Linh");
        System.out.println(student1);
        System.out.println("Điểm trung bình bằng: " + student1.getAvg());
        System.out.println(student2);
        System.out.println("Điểm trung bình bằng: " + student2.getAvg());



    }
}

