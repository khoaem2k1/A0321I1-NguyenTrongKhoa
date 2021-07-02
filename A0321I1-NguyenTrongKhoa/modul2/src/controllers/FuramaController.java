package controllers;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("<--------------Menu-------------->");
        System.out.println("<---- 1. Employee Management ---->");
        System.out.println("<---- 2. Customer Management ---->");
        System.out.println("<---- 3. Facility Management ---->");
        System.out.println("<---- 4. Booking Managerment ---->");
        System.out.println("<---- 5. Promotion Management --->");
        System.out.println("<---- 6. Exit ------------------->");
        System.out.println("<-------------------------------->");

        System.out.printf("Mời bạn chọn chức năng: ");

        while(true) {
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Chào mừng bạn đến với dịch vụ số 1");
                    System.out.println("1. Display list employees");
                    System.out.println("2. Add new employee");
                    System.out.println("3. Edit employee");
                    System.out.println("4. Return main menu");
                    break;
                case 2:
                    System.out.println("Chào mừng bạn đến với dịch vụ số 2");
                    System.out.println("1. Display list customers");
                    System.out.println("2. Add new customer");
                    System.out.println("3. Edit customer");
                    System.out.println("4. Return main menu");
                    break;
                case 3:
                    System.out.println("Chào mừng bạn đến với dịch vụ số 3");
                    System.out.println("1. Display list facility");
                    System.out.println("2. Add new facility");
                    System.out.println("3. Display list facility maintenance");
                    System.out.println("4. Return main menu");
                    break;
                case 4:
                    System.out.println("Chào mừng bạn đến với dịch vụ số 4");
                    System.out.println("1. Add new booking");
                    System.out.println("2. Display list booking");
                    System.out.println("3. Create new constracts");
                    System.out.println("4. Display list contracts");
                    System.out.println("5. Edit contracts");
                    System.out.println("6. Return main menu");
                    break;
                case 5:
                    System.out.println("Chào mừng bạn đến với dịch vụ số 5");
                    System.out.println("1. Display list customers use service");
                    System.out.println("2. Display list customers get voucher");
                    System.out.println("3. Return main menu");
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Xin mời chọn từ 1 - 6 :D");
            }
        }
    }
}
