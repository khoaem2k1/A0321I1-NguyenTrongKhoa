package case_study.service.impl;

import case_study.models.Booking;
import case_study.models.Customer;
import case_study.models.Facility;
import case_study.models.Villa;
import case_study.service.BookingService;
import case_study.views.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    private static Scanner scanner = new Scanner(System.in);
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());

    static List<Customer> customerList = new ArrayList<>();

    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    static {
        customerList.add(new Customer(1, "khoa", 20,"Male", "121564654164", "khoa@gmail.com", "VIP", "quang ngai"));
        customerList.add(new Customer(2, "khoa1", 20,"Male", "121564654164", "khoa@gmail.com", "VIP", "quang ngai"));
        customerList.add(new Customer(3, "khoa2", 20,"Male", "121564654164", "khoa@gmail.com", "VIP", "quang ngai"));
        customerList.add(new Customer(4, "khoa3", 20,"Male", "121564654164", "khoa@gmail.com", "VIP", "quang ngai"));
        customerList.add(new Customer(5, "khoa4", 20,"Male", "121564654164", "khoa@gmail.com", "VIP", "quang ngai"));

        facilityIntegerMap.put(new Villa("1", "Villa 1", 200, 150, 10, "Day", "Vip", 15, 2), 0);
        facilityIntegerMap.put(new Villa("2", "Villa 2", 200, 150, 10, "Day", "Vip", 15, 2), 0);
        facilityIntegerMap.put(new Villa("3", "Villa 3", 200, 150, 10, "Day", "Vip", 15, 2), 0);
    }

    @Override
    public void addBooking() {
        int id = 1;
        if (!bookingSet.isEmpty()){
            id = bookingSet.size();
        }
        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();

        System.out.println("Nhập ngày bắt đầu thuê: ");
        String starDate = scanner.nextLine();
        System.out.println("Nhập ngày trả phòng: ");
        String endDate = scanner.nextLine();

        Booking booking = new Booking(id, starDate, endDate, customer, facility);

        bookingSet.add(booking);
        System.out.println("Đã booking thành công");
    }

    public Set<Booking> sendBooking(){
        return bookingSet;
    }
    @Override
    public void displayisBooking() {
        for (Booking booking : bookingSet){
            System.out.println(booking.toString());
        }
    }

    public static Customer chooseCustomer(){
        System.out.println("Danh sach khach hang: ");
        for (Customer customer :
                customerList) {
            System.out.println(customer.toString());
        }
        System.out.println("Nhaapj id khach hang: ");
        boolean check = true;
        int id = Integer.parseInt(scanner.nextLine());

        while (check){
            for (Customer customer: customerList) {
                if (id == customer.getId()){
                    check = false;
                    return customer;
                }
            }
            if (check){
                System.out.println("Bạn đã nhập sai,vui lòng nhập id khách hàng: ");
                id = Integer.parseInt(scanner.nextLine());
            }
        }
        return null;
    }
    public static Facility chooseFacility(){
        System.out.println("Danh sach dịch vụ: ");
        for (Map.Entry<Facility, Integer> entry :
                facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey().toString());
        }
        System.out.println("nhập id dịch vụ: ");
        boolean check = true;
        String id = scanner.nextLine();

        while (check){
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                if (id.equals(entry.getKey().getIdFacility())){
                    check = false;
                    return entry.getKey();
                }
            }
            if (check){
                System.out.println("Bạn đã nhập sai,vui lòng nhập id dịch vụ: ");
                id = scanner.nextLine();
            }
        }
        return null;
    }
}
