import java.util.Scanner;

public class Runable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập số c: ");
        double c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        System.out.println(equation.toString());
        if(equation.checkDiscriminant() == false){
            System.out.println("Phương trình vô nghiệm");
        }else{
            System.out.println("Phương trình có delta = " + equation.getDiscriminant());
            System.out.println("Nghiệm 1 là: " + equation.getRoot1());
            System.out.println("Nghiệm 2 là: " + equation.getRoot2());
        }
    }
}
