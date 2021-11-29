package bai_tap_them.controller;

import bai_tap_them.model.XeMay;
import bai_tap_them.service.impl.OtoServiceImpl;
import bai_tap_them.service.impl.XeMayServiceImpl;
import bai_tap_them.service.impl.XeTaiServiceImpl;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        hienThiMeNu();
    }
    public static void hienThiMeNu() throws FileNotFoundException {
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("-----------MENU-------------");
            System.out.println("1. Thêm mới phương tiện. ");
            System.out.println("2. Hiển thị phương tiện.");
            System.out.println("3. Xóa phương tiện.");
            System.out.println("4. Thoát.");
            System.out.println("----------------------------");
            System.out.print("Xin vui lòng chọn: ");
            Scanner scanner = new Scanner(System.in);
            try {
                choice =Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng");
            }
            switch (choice){
                case 1: {
                    themMoiPhuongTien();
                    break;
                }
                case 2: {
                    hienThiPhuongTien();
                    break;
                }
                case 3: {
                    xoaPhuongTien();
                    break;
                }
            }
        }
    }

    private static void xoaPhuongTien() throws FileNotFoundException {
        OtoServiceImpl otoService = new OtoServiceImpl();
        XeMayServiceImpl xeMayService = new XeMayServiceImpl();
        XeTaiServiceImpl xeTaiService = new XeTaiServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("-----------MENU------------");
            System.out.println("1. Xóa ô tô. ");
            System.out.println("2. Xóa xe tải.");
            System.out.println("3. Xóa xe máy.");
            System.out.println("4. Thoátt.");
            System.out.println("---------------------------");
            System.out.print("Xin vui lòng chọn: ");
            Scanner scanner = new Scanner(System.in);
            try {
                choice =Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng");
            }
            switch (choice){
                case 1: {
                    otoService.delete();
                    hienThiMeNu();
                    break;
                }
                case 2: {
                    xeTaiService.delete();
                    hienThiMeNu();
                    break;
                }
                case 3: {
                    xeMayService.delete();
                    hienThiMeNu();
                    break;
                }
            }
        }
    }



    private static void hienThiPhuongTien() throws FileNotFoundException {
        OtoServiceImpl otoService = new OtoServiceImpl();
        XeMayServiceImpl xeMayService = new XeMayServiceImpl();
        XeTaiServiceImpl xeTaiService = new XeTaiServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("-----------MENU------------");
            System.out.println("1. Hiển thị ds ô tô. ");
            System.out.println("2. hiển thị ds xe tải.");
            System.out.println("3. Hiển thị ds xe máy.");
            System.out.println("4. Thoátt.");
            System.out.println("---------------------------");
            System.out.print("Xin vui lòng chọn: ");
            Scanner scanner = new Scanner(System.in);
            try {
                choice =Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng");
            }
            switch (choice){
                case 1: {
                    otoService.HienThi();
                    hienThiMeNu();
                    break;
                }
                case 2: {
                    xeTaiService.HienThi();
                    hienThiMeNu();
                    break;
                }
                case 3: {
                    xeMayService.HienThi();
                    hienThiMeNu();
                    break;
                }
            }
        }
    }


    public static void themMoiPhuongTien() throws FileNotFoundException {
        OtoServiceImpl otoService = new OtoServiceImpl();
        XeMayServiceImpl xeMayService = new XeMayServiceImpl();
        XeTaiServiceImpl xeTaiService = new XeTaiServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("-----------MENU------------");
            System.out.println("1. Thêm ô tô. ");
            System.out.println("2. Thêm xe Tải.");
            System.out.println("3. Thêm xe máy.");
            System.out.println("4. Thoátt.");
            System.out.println("---------------------------");
            System.out.print("Xin vui lòng chọn: ");
            Scanner scanner = new Scanner(System.in);
            try {
                choice =Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng");
            }
            switch (choice){
                case 1: {
                    otoService.add();
                    hienThiMeNu();
                    break;
                }
                case 2: {
                    xeTaiService.add();
                    hienThiMeNu();
                    break;
                }
                case 3: {
                    xeMayService.add();
                    hienThiMeNu();
                    break;
                }
            }
        }
    }
}
