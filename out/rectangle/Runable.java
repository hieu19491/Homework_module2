import java.util.Scanner;

public class Runable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        int length = scanner.nextInt();
        System.out.println("Nhập chiều rộng: ");
        int width = scanner.nextInt();
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Hình chữ nhật có kích thước là:  " + rectangle);
        System.out.println("Diện tích hình chữ nhật bằng: " + rectangle.area() + "cm");
        System.out.println("Chu vi hình chữ nhật bằng: " + rectangle.perimeter() + "cm");


    }

}
