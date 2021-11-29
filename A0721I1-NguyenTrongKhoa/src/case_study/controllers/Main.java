package case_study.controllers;

import case_study.service.impl.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        hienThiMeNu();
    }

    public static void hienThiMeNu() {
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("-----------MENU------------");
            System.out.println("1. Hiển thị thông tin của khách hàng. ");
            System.out.println("2. Hiển thị thông tin của nhân viên.");
            System.out.println("3. Thêm dịch vụ mới.");
            System.out.println("4. Thêm đặt chỗ mới.");
            System.out.println("5. ");
            System.out.println("6. Thoát.");
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
                    customer();
                    break;
                }
                case 2: {
                    employee();
                    break;
                }
                case 3: {
                    themDichVuMoi();
                    break;
                }
                case 4: {
                    displayBookingMenu();
                    break;
                }
                case 5: {


                }
                case 6: {

                    break;
                }
            }
        }
    }

    private static void displayBookingMenu() {
        BookingServiceImpl bookingService = new BookingServiceImpl();
        ContractServiceImpl contractService = new ContractServiceImpl();
        int choice = 0;
        boolean check = true;
        while (check) {
            System.out.println("-----------BOOKING------------");
            System.out.println("1. Add booking.");
            System.out.println("2. Display list booking.");
            System.out.println("3. Create new contracts.");
            System.out.println("4. Display list contracts.");
            System.out.println("5. Edit contracts.");
            System.out.println("6. Return menu.");
            System.out.println("-------------------------------");
            System.out.print("Xin vui lòng chọn: ");
            Scanner scanner = new Scanner(System.in);
            try {
                choice =Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng");
            }
            switch (choice){
                case 1: {
                    bookingService.addBooking();
                    break;
                }
                case 2: {
                    bookingService.displayisBooking();
                    break;
                }
                case 3: {
                    contractService.CreateNewContracts();
                    break;
                }
                case 4: {
                    contractService.DisplayListContracts();
                    break;
                }
                case 5: {
                    contractService.EditContracts();
                    break;
                }
            }
        }
    }

    public static void themDichVuMoi(){
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("-----------THÊM MỚI DỊCH Vụ------------");
            System.out.println("1. Display list Facility .");
            System.out.println("2. Add new Facility.");
            System.out.println("3. Trở về menu.");
            System.out.println("---------------------------");
            System.out.print("Xin vui lòng chọn: ");
            Scanner scanner = new Scanner(System.in);

            try {
                choice =Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng");
            }
            switch (scanner.nextInt()){
                case 1: {
                    facilityService.display();
                    break;
                }
                case 2: {
                    themFacility();
                    break;
                }
                case 3: {

                }
            }
        }
    }
    public static void themFacility(){
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("-----------THÊM MỚI DỊCH Vụ------------");
            System.out.println("1. Thêm biệt thự mới.");
            System.out.println("2. Thêm nhà mới.");
            System.out.println("3. Thêm phòng mới.");
            System.out.println("--------------------------");
            System.out.print("Xin vui lòng chọn:  ");
            Scanner scanner = new Scanner(System.in);
            try {
                choice =Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng");
            }
            switch (choice){
                case 1: {
                    facilityService.addNewVilla();
                    themDichVuMoi();
                    break;
                }
                case 2: {
                    facilityService.addNewHouse();
                    themDichVuMoi();
                    break;
                }
                case 3: {
                    facilityService.addNewRoom();
                    themDichVuMoi();
                }
            }
        }
    }
    public static void customer(){
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("-----------Customer------------");
            System.out.println("1. Danh sách khách hang.");
            System.out.println("2. Thêm mới khách hàng.");
            System.out.println("3. Sửa khách hàng.");
            System.out.println("4. Xóa khách hàng");
            System.out.println("5. Trở về menu.");
            System.out.println("6. Thoát.");
            System.out.println("--------------------------");
            System.out.print("Xin vui lòng chọn:");
            Scanner scanner = new Scanner(System.in);

            switch (Integer.parseInt(scanner.nextLine())){
                case 1: {
                    customerService.display();
                    break;
                }
                case 2: {
                    customerService.addNew();
                    break;
                }
                case 3: {
                    customerService.edit();
                    break;
                }
                case 4: {
                    customerService.delete();
                    break;
                }
            }
        }
    }
    public static void employee(){
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("-----------Employee------------");
            System.out.println("1. Danh sách nhân viên.");
            System.out.println("2. Thêm mới nhân viên.");
            System.out.println("3. Sửa nhân viên.");
            System.out.println("4. Xóa nhân viên");
            System.out.println("5. Trở về menu. ");
            System.out.println("6. Thoát. ");
            System.out.println("---------------------------");
            System.out.print("Xin vui lòng chọn: ");
            Scanner scanner = new Scanner(System.in);

            switch (Integer.parseInt(scanner.nextLine())){
                case 1: {
                    employeeService.display();
                    break;
                }
                case 2: {
                    employeeService.addNew();
                    break;
                }
                case 3: {
                    employeeService.edit();
                    break;
                }
                case 4: {
                    employeeService.delete();
                    break;
                }
            }
        }
    }

}
