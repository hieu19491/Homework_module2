package Lop_Circle_va_Lop_Cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(6, "black");
        System.out.println(circle.area());
        Cylinder cylinder = new Cylinder(6,"red", 5);
        System.out.println(cylinder.volume());

        System.out.println(circle.toString());
        System.out.println(cylinder.toString());


    }
}
