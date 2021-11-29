package thi.controller;

import thi.service.impl.ChinhHangServiceImpl;
import thi.service.impl.XachTayServiceImpl;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        hienThiMeNu();
    }

    public static void hienThiMeNu() {
        boolean check2 = true;
        int choice2 = 0;
        boolean thoat = false;

        while (check2) {
            System.out.println("-----------MENU-------------");
            System.out.println("1. Thêm mới. ");
            System.out.println("2. Xóa.");
            System.out.println("3. Danh sách.");
            System.out.println("4. Tìm kiếm.");
            System.out.println("5. Thoát.");
            System.out.println("----------------------------");
            System.out.print("Xin vui lòng chọn: ");
            Scanner scanner = new Scanner(System.in);
            try {
                choice2 = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng");
            }
            switch (choice2) {
                case 1: {
                    themmoi();
                    break;
                }
                case 2: {
                    Xoa();
                    break;
                }
                case 3: {
                    DanhSach();
                    break;
                }
                case 4: {
                    TimKiem();
                    break;
                }
                case 5:
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
        }
    }

    private static void TimKiem() {
        ChinhHangServiceImpl chinhHangService = new ChinhHangServiceImpl();
        XachTayServiceImpl xachTayService = new XachTayServiceImpl();
        boolean check = true;
        int choice = 0;
        boolean thoat = false;
        while (check) {
            System.out.println("-----------MENU------------");
            System.out.println("1. Tìm kiếm Điện thoại chính hãng. ");
            System.out.println("2. Tìm kiếm Điện thoại xách tay.");
            System.out.println("3. Thoátt.");
            System.out.println("---------------------------");
            System.out.print("Xin vui lòng chọn: ");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng");
            }
            switch (choice) {
                case 1: {
                    chinhHangService.TimKiem();
                    hienThiMeNu();
                    break;
                }
                case 2: {
                    xachTayService.TimKiem();
                    hienThiMeNu();
                    break;
                }
                case 3:
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
        }
    }

    private static void DanhSach() {
        ChinhHangServiceImpl chinhHangService = new ChinhHangServiceImpl();
        XachTayServiceImpl xachTayService = new XachTayServiceImpl();
        boolean check = true;
        int choice = 0;
        boolean thoat = false;
        while (check) {
            System.out.println("-----------MENU------------");
            System.out.println("1. DS Điện thoại chính hãng. ");
            System.out.println("2. DS Điện thoại xách tay.");
            System.out.println("3. Thoátt.");
            System.out.println("---------------------------");
            System.out.print("Xin vui lòng chọn: ");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng");
            }
            switch (choice) {
                case 1: {
                    chinhHangService.HienThi();
                    hienThiMeNu();
                    break;
                }
                case 2: {
                    xachTayService.HienThi();
                    hienThiMeNu();
                    break;
                }
                case 3:
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
        }
    }

    private static void Xoa() {
        ChinhHangServiceImpl chinhHangService1 = new ChinhHangServiceImpl();
        XachTayServiceImpl xachTayService1 = new XachTayServiceImpl();
        boolean check = true;
        int choice = 0;
        boolean thoat = false;
        while (check) {
            System.out.println("-----------MENU------------");
            System.out.println("1. Xóa Điện thoại chính hãng. ");
            System.out.println("2. Xóa Điện thoại xách tay.");
            System.out.println("3. Thoát.");
            System.out.println("---------------------------");
            System.out.print("Xin vui lòng chọn: ");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng");
            }
            switch (choice) {
                case 1: {
                    chinhHangService1.delete();
                    hienThiMeNu();
                    break;
                }
                case 2: {
                    xachTayService1.delete();
                    hienThiMeNu();
                    break;
                }
                case 3:
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
        }
    }

    private static void themmoi() {
        ChinhHangServiceImpl chinhHangService = new ChinhHangServiceImpl();
        XachTayServiceImpl xachTayService = new XachTayServiceImpl();
        boolean check = true;
        int choice = 0;
        boolean thoat = false;
        while (check) {
            System.out.println("-----------MENU------------");
            System.out.println("1. Thêm Điện thoại chính hãng. ");
            System.out.println("2. Thêm Điện thoại xách tay.");
            System.out.println("3. Thoátt.");
            System.out.println("---------------------------");
            System.out.print("Xin vui lòng chọn: ");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng");
            }
            switch (choice) {
                case 1: {
                    chinhHangService.add();
                    hienThiMeNu();
                    break;
                }
                case 2: {
                    xachTayService.add();
                    hienThiMeNu();
                    break;
                }
                case 3:
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
        }
    }
}

