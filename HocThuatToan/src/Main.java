import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        //main.getOddNumber();
        //main.getRequestNumber();
        //main.getSumAtoB();
        //main.getSumAtoBgetEven();
        //main.getSumSquare();

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

}