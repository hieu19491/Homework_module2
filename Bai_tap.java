import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.lang.Math;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Bai_tap {
    public static void main(String[] args) {
//        //Bài 1
//        System.out.println("Hello world");

//        //Bài 2
//        System.out.println("Hello world, Hi ae");

//        //Bài 3
//        Scanner name = new Scanner(System.in);
//        System.out.print("Nhập tên: ");
//        String ten = name.nextLine();
//        System.out.println("Hello " + ten);


// Kiểu dữ liệu
//        //Bài 1
//        int a = 500;
//        System.out.println(a);

//        //Bài 2
//        Scanner number = new Scanner(System.in);
//        System.out.print("Nhập một số: ");
//        int a = number.nextInt();
//        System.out.println(a);

        //Bài 3
//        Scanner number = new Scanner(System.in);
//        System.out.println("Nhập số a: ");
//        int a = number.nextInt();
//        System.out.println("Nhập số b: ");
//        int b = number.nextInt();
//        System.out.println(a + b);
//        System.out.println(a * b);
//        System.out.println(a - b);
//        System.out.println(a / b);
//        System.out.println(a % b);

//        //Bài 4
//        Scanner name = new Scanner(System.in);
//        System.out.print("Nhập tên: ");
//        String a = name.nextLine();
//        System.out.print("Nhập tuổi của bạn: ");
//        int namSinh = name.nextInt();
//        System.out.println("Xin chào " + a);
//        System.out.println("Tôi năm nay " + (2023 - namSinh));

// Toán tử

//        Scanner number = new Scanner(System.in);
//        System.out.println("Nhập số a: ");
//        int a = number.nextInt();
//        System.out.println("Nhập số b: ");
//        int b = number.nextInt();

        //Bài 1
//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a * b);
//        System.out.println(a / b);
//        System.out.println(a % b);

        //Bài 2
//        a = b;
//        System.out.println(a);
//        a += b;
//        System.out.println(a);
//        a -= b;
//        System.out.println(a);
//        a *= b;
//        System.out.println(a);
//        a /= b;
//        System.out.println(a);

        //Bài 3
//        a = ++b;
//        System.out.println(a);
//        System.out.println(b);
//        a = b--;
//        System.out.println(a);
//        System.out.println(b);

        //Bài 4
//        if (a > b){
//            System.out.println("Số a lớn hơn b");
//        }
//        if (a < b){
//            System.out.println("Số a nhỏ hơn b");
//        }
//        if (a >= b){
//            System.out.println("Số a lớn hơn hoặc bằng b");
//        }
//        if (a <= b){
//            System.out.println("Số a nhỏ hơn hoặc bằng b");
//        }
//        if (a == b){
//            System.out.println("Số a5 bằng b");
//        }
//        if (a != b){
//            System.out.println("Số a khác b");
//        }


// Điều kiện

        //Bài 1
//        Scanner number = new Scanner(System.in);
//        System.out.println("Nhập số a: ");
//        int a = number.nextInt();
//        System.out.println("Nhập số b: ");
//        int b = number.nextInt();
//        if (a % b == 0){
//            System.out.println("a chia hết cho b");
//        }else{
//            System.out.println("a không chia hết cho b");
//        }

        //Bài 2
//        Scanner age = new Scanner(System.in);
//        System.out.println("Nhập tuổi của bạn: ");
//        int number = age.nextInt();
//        if ( number >= 16){
//            System.out.println("Bạn đủ tuổi va lớp 10");
//        }else {
//            System.out.println("Bạn không đủ tuổi vào lớp 10");
//        }

        //Bài 3
//        Scanner number = new Scanner(System.in);
//        System.out.println("Nhập số a: ");
//        int a = number.nextInt();
//        if( a > 0){
//            System.out.println("Số này lớn hơn 0");
//        }else if( a < 0){
//            System.out.println("Số này nhỏ hơn không");
//        }else{
//            System.out.println("Mày đùa tao à");
//        }

        //Bài 4
//        Scanner number = new Scanner(System.in);
//        System.out.println("Nhập số a: ");
//        int a = number.nextInt();
//        System.out.println("Nhập số b: ");
//        int b = number.nextInt();
//        System.out.println("Nhập số c: ");
//        int c = number.nextInt();
//        if ( a > b && a > c){
//            System.out.println("a là số lớn nhất");
//        }else if( a < b && b > c){
//            System.out.println("b là số lớn nhất");
//        }else {
//            System.out.println("c là số lớn nhất");
//        }

        //Bài 5
//        Scanner number = new Scanner(System.in);
//        System.out.println("Nhập điểm bài kiểm tra: ");
//        int a = number.nextInt();
//        System.out.println("Nhập điểm bài kiểm tra giữa kỳ: ");
//        int b = number.nextInt();
//        System.out.println("Nhập điểm bài kiểm tra cuối kỳ: ");
//        int c = number.nextInt();
//        double d = (a + b + c) /3;
//        if ( d >= 8.0 ){
//            System.out.println("Giỏi");
//        }else if( 5.0 <= d && d < 8.0){
//            System.out.println("Khá");
//        }else if(3.0 <= d && d < 5.0){
//            System.out.println("Trung bình");
//        }else {
//            System.out.println("Yếu");
//        }

        //Bài 6
//        Locale localeEN = new Locale("en", "EN");
//        NumberFormat en = NumberFormat.getInstance(localeEN);
//        Scanner tinhHoahong = new Scanner(System.in);
//        System.out.print("Nhập tổng doanh thu:  ");
//        int doanhThu = tinhHoahong.nextInt();
//        System.out.print("Nhập số phần trăm hoa hồng: ");
//        double phanTram = tinhHoahong.nextFloat();
//        double hoaHong = phanTram / 100;
//        String ketqua = en.format(doanhThu * hoaHong);
//        System.out.println("Tổng tiền hoa hồng là: " + ketqua +"VND");

        //Bài 7
//        Locale localeEN = new Locale("en", "EN");
//        NumberFormat en = NumberFormat.getInstance(localeEN);
//        Scanner tinhCuocDT = new Scanner(System.in);
//        System.out.print("Nhập tổng số phút gọi:  ");
//        int soPhut = tinhCuocDT.nextInt();
//        int giaCuoc = 790;
//        String ketqua = en.format(soPhut * giaCuoc);
//        System.out.println("Tổng tiền cần thanh toán là: " + ketqua +"VND");

    // Không biết

        //Bài 1
//        Scanner nhietDo = new Scanner(System.in);
//        System.out.println("Nhập độ C: ");
//        int doC = nhietDo.nextInt();
//        int doF = doC * 9 / 5 + 32;
//        System.out.println("Chuyển sang độ F = " + doF);

        //Bài 2
//        Scanner donVido = new Scanner(System.in);
//        System.out.println("Nhập số met: ");
//        double soMet = donVido.nextDouble();
//        System.out.println("Kết quả chuyển sang feet = " + (soMet * 3.2808) );

        //Bài 3
//        Scanner dienTich = new Scanner(System.in);
//        System.out.print("Nhập cạnh a: cm ");
//        int a = dienTich.nextInt();
//        System.out.println("Diện tích hình vuông = " + (a * a) + " cm");

        //Bài 4
//        Scanner dienTich = new Scanner(System.in);
//        System.out.println("Nhập cạnh a: cm ");
//        int a = dienTich.nextInt();
//        System.out.println("Nhập cạnh b: ");
//        int b = dienTich.nextInt();
//        System.out.println("Diện tích hình chữ nhật = " + (a * b) + " cm");

        //Bài 5
//        Scanner dienTich = new Scanner(System.in);
//        System.out.println("Nhập cạnh a: cm ");
//        int a = dienTich.nextInt();
//        System.out.println("Nhập cạnh b: cm ");
//        int b = dienTich.nextInt();
//        double ketqua = (1 * a * b) / 2;
//        System.out.println("Diện tích tam giác vuông = " + ketqua + " cm");

        //Bài 6 : giải Phương trình bậc 1
//        DecimalFormat decimalFormat = new DecimalFormat("#.##");
//        Scanner ptb1 = new Scanner(System.in);
//        System.out.println("Nhập số a: ");
//        int a = ptb1.nextInt();
//        System.out.println("Nhập số b: ");
//        int b = ptb1.nextInt();
//        double c;
//        System.out.println("Phương trình cần giải là: " + a + "x" + " + " + b + " = 0");
//        if (a == 0){
//          if (b == 0){
//              System.out.println("Phương trình có vô số nghiệm");
//          }else{
//              System.out.println("Phương trình vô nghiệm");
//          }
//        }else{
//            c = (double) -b / a;
//            System.out.println("Phương trình có nghiệm x =" + decimalFormat.format(c));
//        }

        //Bài 7: giải phương trình bậc 2
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số a: ");
//        int a = scanner.nextInt();
//        System.out.println("Nhập số b: ");
//        int b = scanner.nextInt();
//        System.out.println("Nhập số c: ");
//        int c = scanner.nextInt();
//        double x1 , x2;
//        double delta = Math.pow(b,2) - (4*a*c);
//        System.out.println("Phương trình bậc 2 cần giải là: " + a + "x^2" + " + " + b + "x" + " + " + c + " = 0");
//        System.out.println(" delta của phương trình = " + delta);
//        if(delta < 0){
//            System.out.println("Phương trình vô nghiệm");
//        }else if( delta == 0){
//            System.out.println("Phương trình có nghiệm kép: x1 = x2 = " + (-b / (2*a)));
//        }else {
//            x1 = (double) (-b + Math.sqrt(delta)) / (2*a);
//            System.out.println("x1 = " + x1 );
//            x2 = (double) (-b - Math.sqrt(delta)) / (2*a);
//            System.out.println("x2 = " + x2);
//        }

        //Bài 8
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vào một số: ");
//        int tuoi = scanner.nextInt();
//        if( tuoi < 0){
//            System.out.println("Đây méo phải người");
//        }else if( tuoi > 0 && tuoi < 120){
//            System.out.println("Đây là tuổi của một người");
//        }else {
//            System.out.println("Đây là tuổi của người ngoài hành tinh");
//        }

        //Bài 9
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập cạnh a: ");
//        float a = scanner.nextFloat();
//        System.out.println("Nhập cạnh b: ");
//        float b = scanner.nextFloat();
//        System.out.println("Nhập cạnh c: ");
//        float c = scanner.nextFloat();
//        if( a > 0 && b > 0 && c > 0){
//            if ( a + b > c && b + c > a && a + c > b){
//                System.out.println("a,b,c là cạnh của tam giác ");
//            }
//        }else {
//            System.out.println("a,b,c không phải là cạnh của một tam giác");
//        }


        //Bài 10
        Locale localeEN = new Locale("en", "EN");
        NumberFormat en = NumberFormat.getInstance(localeEN);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số kWh: ");
        int kWh = scanner.nextInt();
        String total = en.format(kWh * 1728);
        System.out.println("Số tiền cần thanh toán=  " + total + "VNĐ");

        //Bài 11
//        Locale localeEN = new Locale("en", "EN");
//        NumberFormat en = NumberFormat.getInstance(localeEN);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Tổng thu nhập cá nhân: ");
//        int tongThunhap = scanner.nextInt();
//        String thue = en.format(tongThunhap * 10 / 100);
//        System.out.println("Thuế thu nhập cá nhân = " + thue + "VND");














    }
}
