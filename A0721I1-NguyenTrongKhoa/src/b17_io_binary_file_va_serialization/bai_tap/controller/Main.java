package b17_io_binary_file_va_serialization.bai_tap.controller;

import b17_io_binary_file_va_serialization.bai_tap.service.QuanLiSanPham;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String chon = null;
        boolean thoat = false;
        QuanLiSanPham quanLiSanPham = new QuanLiSanPham();
        int maSanPham;

        //hiển thị menu
        hienThiMeNu();
        while (true){
            chon = scanner.nextLine();
            switch (chon){
                case "1":
                    quanLiSanPham.them();
                    break;
                case "2":
                    maSanPham = quanLiSanPham.themMaSanPham();
                    quanLiSanPham.sua(maSanPham);
                    break;
                case "3":
                    maSanPham = quanLiSanPham.themMaSanPham();
                    quanLiSanPham.xoa(maSanPham);
                case "4":
                    quanLiSanPham.timKiemTheoTen();
                    break;
                case "5":
                    quanLiSanPham.timKiemTheoGia();
                case "6":
                    quanLiSanPham.hienThi();
                case "0":
                    System.out.println("Đã thoát!");
                    thoat = true;
                    break;
                default:
                    System.out.println("không hợp lệ! vui lòng chọn chức năng bên dưới: ");
                    break;
            }
            if (thoat){
                break;
            }
            hienThiMeNu();
        }
    }

    public static void hienThiMeNu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Thêm sản phẩm.");
        System.out.println("2. Sửa sản phẩm bằng msp.");
        System.out.println("3. xóa sản phẩm bằng msp.");
        System.out.println("4. Tìm kiếm sản phẩm theo tên.");
        System.out.println("5. Tìm kiếm sửa phẩm theo giá.");
        System.out.println("6. Hiển thị sản phẩm.");
        System.out.println("0. Thoát.");
        System.out.println("---------------------------");
        System.out.print("Xin vui lòng chọn: ");
    }
}
