package case_study.service.impl;


import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.service.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element: facilityIntegerMap.entrySet()) {
            System.out.println("Service " + element.getKey() + " Số lần đã thuê: " + element.getValue());
        }
    }

    @Override
    public void displayMaintain() {

    }
//    String idFacility,
//    String nameService,
//    double areaUse,
//    int rentalPrice,
//    int rentalPeopleMax,
//    String styleRental,
//    String standardVilla,
//    double areaPool,
//    int floor
    @Override
    public void addNewVilla() {
        System.out.println("Nhập id: ");
        String id = scanner.nextLine();
        System.out.println("Nhập name: ");
        String name = scanner.nextLine();
        System.out.println("Nhập diện tích: ");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập giá tiền: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số lượng người: ");
        int people = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu thuê: ");
        String renType = scanner.nextLine();
        System.out.println("Nhập tiêu chuân: ");
        String standard = scanner.nextLine();
        System.out.println("Nhập diện tích hồ bơi: ");
        double areaPool = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số tầng: ");
        int floor = Integer.parseInt(scanner.nextLine());

        Villa villa = new Villa(id, name, area, price, people, renType, standard, areaPool, floor);
        facilityIntegerMap.put(villa, 0);
        System.out.println("Đã thêm mới thành công villa");
    }

    @Override
    public void addNewHouse() {
        System.out.println("Nhập id: ");
        String id = scanner.nextLine();
        System.out.println("Nhập name: ");
        String name = scanner.nextLine();
        System.out.println("Nhập diện tích: ");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập giá tiền: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số lượng người: ");
        int people = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu thuê: ");
        String renType = scanner.nextLine();
        System.out.println("Nhập số phòng vệ sinh: ");
        int toilet = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập yêu cầu nội thất: ");
        String furniture = scanner.nextLine();

        House house = new House(id, name, area, price, people, renType, toilet, furniture);
        facilityIntegerMap.put(house, 0);
        System.out.println("Đã thêm mới thành công villa");
    }

    @Override
    public void addNewRoom() {
        System.out.println("Nhập id: ");
        String id = scanner.nextLine();
        System.out.println("Nhập name: ");
        String name = scanner.nextLine();
        System.out.println("Nhập diện tích: ");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập giá tiền: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số lượng người: ");
        int people = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu thuê: ");
        String renType = scanner.nextLine();
        System.out.println("Nhập số bàn: ");
        int table = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số ghế: ");
        int chair = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số giường: ");
        int bed = Integer.parseInt(scanner.nextLine());

        Room room = new Room(id, name, area, price, people, renType, table, chair, bed);
        facilityIntegerMap.put(room, 0);
        System.out.println("Đã thêm mới thành công villa");
    }
}
