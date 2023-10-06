package View;

import Manager.ProductManager;
import model.Product;

import java.util.Scanner;

public class Menu {
    ProductManager productManager  = new ProductManager();
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);
    public void menuDisplay(){
        int choice;
        do{
            System.out.println("\n===== Quản lý sản phẩm =====");
            System.out.println("+ Thêm mới sản phẩm.\n" +
                    "+ Sửa sản phẩm theo id.\n" +
                    "+ Xóa sản phẩm theo id.\n" +
                    "+ Lấy ra tất cả sản phẩm.\n" +
                    "+ Tìm kiếm các sản phẩm theo tên gần đúng.\n" +
                    "+ Nhập vào loại sản phẩm và lấy ra tất cả sản phẩm cùng loại.\n" +
                    "+ Tìm sản phẩm theo id.");
            System.out.println("Nhập lựa chọn của bạn: ");
            try{
                choice = Integer.parseInt(inputString.nextLine());
            }catch (NumberFormatException exception){
                System.out.println("\nBạn nhập sai định dạng, Hãy nhập lại!!!");
                choice = -1;
            }switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }

        } while (choice != 0);
    }
    public void addMenuDisplay(){
        System.out.println("\n===== Thêm sản phẩm =====");
        System.out.println("Nhập tên sản phẩm: ");
        String nameProduct = inputString.nextLine();
        System.out.println("Nhập số lượng sản phẩm: ");
        int quantity = inputInt.nextInt();
        System.out.println("Nhâp giá sản phẩm: ");
        int price = inputInt.nextInt();
        System.out.println("Nhập loại sản phẩm: ");
        String unit = inputString.nextLine();
        Product newProduct = new Product(nameProduct, quantity, price, unit );
        productManager.add(newProduct);
        System.out.println("\n=====> Đã thêm sản phẩm thành công <=====");
    }

}
