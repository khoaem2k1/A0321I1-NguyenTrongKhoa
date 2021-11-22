package case_study.controllers;

import case_study.service.impl.CustomerServiceImpl;
import case_study.service.impl.EmployeeServiceImpl;
import case_study.service.impl.FacilityServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        hienThiMeNu();
    }

    public static void hienThiMeNu() {
        boolean check = true;
        while (check) {
            System.out.println("-----------menu------------");
            System.out.println("1. Thêm dịch vụ mới.");
            System.out.println("2. Hiển thị dịch vụ.");
            System.out.println("3. Hiển thị thông tin của khách hàng.");
            System.out.println("4. Thêm đặt chỗ mới.");
            System.out.println("5. Hiển thị thông tin của nhân viên.");
            System.out.println("6. Thoát.");
            System.out.println("---------------------------");
            System.out.print("Xin vui lòng chọn: ");
            Scanner scanner = new Scanner(System.in);

            switch (Integer.parseInt(scanner.nextLine())){
                case 1: {
                    themDichVuMoi();
                    break;
                }
                case 2: {

                    break;
                }
                case 3: {

                }
                case 4: {
                    customer();
                    break;
                }
                case 5: {


                }
                case 6: {
                    employee();
                    break;
                }
            }
        }
    }
    public static void themDichVuMoi(){
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("-----------THÊM MỚI DỊCH Vụ------------");
            System.out.println("1. Display list Facility .");
            System.out.println("2. Add new Facility.");
            System.out.println("3. Trở về menu.");
            System.out.println("---------------------------");
            System.out.print("Xin vui lòng chọn: ");
            Scanner scanner = new Scanner(System.in);

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
        while (check) {
            System.out.println("-----------THÊM MỚI DỊCH Vụ------------");
            System.out.println("1. Thêm biệt thự mới.");
            System.out.println("2. Thêm nhà mới.");
            System.out.println("3. Thêm phòng mới.");
            System.out.println("--------------------------");
            System.out.print("Xin vui lòng chọn:  ");
            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()){
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
