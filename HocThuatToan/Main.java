import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        //main.getOddNumber();
        //main.getRequestNumber();
        //main.getSumAtoB();
        //main.getSumAtoBgetEven();
        //main.getSumSquare();
        //main.insertNumber();
        //main.insertNumber2();
        //main.inserNumber3();
        //main.interestRate();
        //main.classification();
    }

    public void getOddNumber() {
        Scanner inputInt = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        int numberA = inputInt.nextInt();
        System.out.println("Nhập số b: ");
        int numberB = inputInt.nextInt();
        System.out.println("\nDãy số lẻ thu về là:");
        if (numberA < numberB) {
            for (int i = numberA; i <= numberB; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = numberB; i <= numberA; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }
    public void getRequestNumber(){
        Scanner inputInt = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        int numberA = inputInt.nextInt();
        System.out.println("Nhập số b: ");
        int numberB = inputInt.nextInt();
        System.out.println("\nDãy số thu về là:");
        if (numberA < numberB) {
            for (int i = numberA; i <= numberB; i++) {
                if (i % 3 == 0 && i % 5 ==0) {
                    System.out.println(i + " FizzBuzz");
                }else if(i % 3 == 0 && i % 5 != 0 ){
                    System.out.println(i + " Fizz");
                } else if (i % 3 != 0 && i % 5 == 0) {
                    System.out.println(i + " Buzz");
                }
            }
        } else {
            for (int i = numberB; i <= numberA; i++) {
                if (i % 3 == 0 && i % 5 ==0) {
                    System.out.println(i + " FizzBuzz");
                }else if(i % 3 == 0 && i % 5 != 0 ){
                    System.out.println(i + " Fizz");
                } else if (i % 3 != 0 && i % 5 == 0) {
                    System.out.println(i + " Buzz");
                }
            }
        }
    }
    public void getSumAtoB(){
        Scanner inputInt = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        int numberA = inputInt.nextInt();
        System.out.println("Nhập số b: ");
        int numberB = inputInt.nextInt();
        System.out.println("\nTổng của dãy số là:");
        int sum = 0;
        if (numberA < numberB) {
            for (int i = numberA; i <= numberB; i++) {
                sum += i;
            }
            System.out.println(sum);
        } else {
            for (int i = numberB; i <= numberA; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
    public void getSumAtoBgetEven(){
        Scanner inputInt = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        int numberA = inputInt.nextInt();
        System.out.println("Nhập số b: ");
        int numberB = inputInt.nextInt();
        System.out.println("\nTổng của dãy số là:");
        int sum = 0;
        if (numberA < numberB) {
            for (int i = numberA; i <= numberB; i++) {
                if(i % 2 == 0){
                    sum += i;
                }
            }
            System.out.println(sum);
        } else {
            for (int i = numberB; i <= numberA; i++) {
                if(i % 2 == 0){
                    sum += i;
                }
            }
            System.out.println(sum);
        }
    }
    public void getSumSquare(){
        Scanner inputInt = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        int numberA = inputInt.nextInt();
        System.out.println("Nhập số b: ");
        int numberB = inputInt.nextInt();
        System.out.println("\nTổng bình phương của dãy số là:");
        int sum = 0;
        if (numberA < numberB) {
            for (int i = numberA; i <= numberB; i++) {
                sum += Math.pow(i, 2);
            }
            System.out.println(sum);
        } else {
            for (int i = numberB; i <= numberA; i++) {
                sum += Math.pow(i, 2);;
            }
            System.out.println(sum);
        }
    }
    public void insertNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số n: ");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i * (i + 1);
        }
        System.out.println("\nKết quả:");
        System.out.println(sum);
    }
    public void insertNumber2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số n: ");
        int number = scanner.nextInt();
        double sum = 0;
        for (int i = 0; i <= number; i++) {
            sum +=(double)(2*i + 1) / (2*i + 2);
        }
        System.out.println("\nKết quả:");
        System.out.println(sum);
    }
    public void inserNumber3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNhập số n: ");
        int numberN = scanner.nextInt();
        double sum = 0;
        for (int i = 0; i < numberN; i++) {
            sum += i * (i + 1) / (i + 1) * (i + 2);
        }
        System.out.println("Kết quả bằng: ");
        System.out.println(sum);
    }

    public void interestRate() {
        Scanner num = new Scanner(System.in);
        System.out.print("Số tiền bạn muốn gửi: ");
        double money = num.nextInt();
        System.out.print("Thời gian(Năm): ");
        double year = num.nextInt();
        double interest = money * (5.0 / 100.0) * year;
        System.out.println("Lãi suất hàng năm là: " + interest);
    }

    public void classification() {
        Scanner num = new Scanner(System.in);
        System.out.println("Nhập điểm học sinh: ");
        double point = num.nextDouble();
        if (point <= 10 && point >= 8) {
            System.out.println("Học sinh giỏi");
        } else if (point < 8 && point >= 3.5) {
            System.out.println("Học sinh khá");
        } else if (point < 3.5 && point >= 0) {
            System.out.println("Ngu");
        } else {
            System.out.println("Không có");
        }
    }


}