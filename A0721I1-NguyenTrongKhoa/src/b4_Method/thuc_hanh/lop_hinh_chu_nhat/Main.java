package b4_Method.thuc_hanh.lop_hinh_chu_nhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều rộng: ");
        double width = scanner.nextDouble();
        System.out.print("Nhập chiều dài: ");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println("Hình chữ nhật \n"+ rectangle.display());
        System.out.println("Chu vi của hình chữ nhật: "+ rectangle.getPerimeter());
        System.out.println("Diện tích của hình chữ nhật: " + rectangle.getArea());
    }
}
