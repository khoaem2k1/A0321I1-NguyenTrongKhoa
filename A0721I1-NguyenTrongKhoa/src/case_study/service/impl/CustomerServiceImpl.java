package case_study.service.impl;

import case_study.models.Customer;
import case_study.models.Employee;
import case_study.service.CustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    private Scanner scanner = new Scanner(System.in);

    static {
        customerList.add(new Customer(1,"khoa",20,"Nam","052101010012","khoa@gmail.com", "khách thường", "quảng ngãi"));
        customerList.add(new Customer(2,"khoa1",20,"Nam","052101010012","khoa@gmail.com", "khách vip", "quảng trị"));
        customerList.add(new Customer(3,"khoa2",20,"Nam","052101010012","khoa@gmail.com", "khách vip", "quảng bình"));
        customerList.add(new Customer(4,"khoa3",20,"Nam","052101010012","khoa@gmail.com", "khách vip", "quảng nam"));
    }

    @Override
    public void display() {
        for (Customer customer: customerList) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính: ");
        String sex = scanner.nextLine();
        System.out.println("Nhập CMND: ");
        String idCard = scanner.nextLine();
        System.out.println("Nhập gmail: ");
        String email = scanner.nextLine();
        System.out.println("Nhập loại khách hàng: ");
        String typeCustomer = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();

        Customer customer = new Customer(id, name, age, sex, idCard, email, typeCustomer, address);
        customerList.add(customer);
        System.out.println("Đã thêm mới thành công");
    }

    @Override
    public void edit() {
        System.out.println("Nhập id cần sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < customerList.size(); i++){
            if(id == customerList.get(i).getId()){
                System.out.println("Nhập tên: ");
                String name = scanner.nextLine();
                System.out.println("Nhập tuổi: ");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập giới tính: ");
                String sex = scanner.nextLine();
                System.out.println("Nhập CMND: ");
                String idCard = scanner.nextLine();
                System.out.println("Nhập gmail: ");
                String email = scanner.nextLine();
                System.out.println("Nhập chức vụ: ");
                String typeCustomer = scanner.nextLine();
                System.out.println("Nhập vị trí: ");
                String address = scanner.nextLine();

                Customer customer = new Customer(id, name, age, sex, idCard, email, typeCustomer, address);
                customerList.set(i, customer);
            }
        }
    }

    @Override
    public void delete() {
        System.out.println("Nhập id cần xóa: ");
        int index = -1;
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < customerList.size();i++){
            if (id == customerList.get(i).getId()){
                index = i;
                break;
            }
        }
        if (index != -1){
            customerList.remove(index);
        }
    }
}
