package case_study.service.impl;

import case_study.models.Employee;
import case_study.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    private static Scanner scanner = new Scanner(System.in);

    public static ArrayList<Employee> employeeList = new ArrayList<>();
    static {
           employeeList.add(new Employee(1,"khoa",20,"Nam","052101010012","khoa@gmail.com", "giám đốc", "nhân sự", 2000));
           employeeList.add(new Employee(2,"khoa1",20,"Nam","052101010012","khoa@gmail.com", "giám đốc", "nhân sự", 2000));
           employeeList.add(new Employee(3,"khoa2",20,"Nam","052101010012","khoa@gmail.com", "giám đốc", "nhân sự", 2000));
           employeeList.add(new Employee(4,"khoa3",20,"Nam","052101010012","khoa@gmail.com", "giám đốc", "nhân sự", 2000));
           employeeList.add(new Employee(5,"khoa4",20,"Nam","052101010012","khoa@gmail.com", "giám đốc", "nhân sự", 2000));
           employeeList.add(new Employee(6,"khoa5",20,"Nam","052101010012","khoa@gmail.com", "giám đốc", "nhân sự", 2000));


    }

    @Override
    public void display() {
        System.out.println("-----------Danh sách sinh viên------------");
        for (Employee employee: employeeList){
            if (employee != null){
                System.out.println(employee.toString());
            }else {
                break;
            }
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
        System.out.println("Nhập chức vụ: ");
        String level = scanner.nextLine();
        System.out.println("Nhập vị trí: ");
        String postion = scanner.nextLine();
        System.out.println("Nhập lương: ");
        int salary = Integer.parseInt(scanner.nextLine());

        Employee employee = new Employee(id, name, age, sex, idCard, email, level, postion, salary);
        employeeList.add(employee);

    }

    @Override
    public void edit() {
        System.out.println("Nhập id cần sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employeeList.size(); i++){
            if(id == employeeList.get(i).getId()){
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
                String level = scanner.nextLine();
                System.out.println("Nhập vị trí: ");
                String postion = scanner.nextLine();
                System.out.println("Nhập lương: ");
                int salary = Integer.parseInt(scanner.nextLine());

                Employee employee = new Employee(id, name, age, sex, idCard, email, level, postion, salary);
                employeeList.set(i, employee);
            }
        }
    }

    @Override
    public void delete() {
        System.out.println("Nhập id cần xóa: ");
        int index = -1;
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employeeList.size();i++){
            if (id == employeeList.get(i).getId()){
                index = i;
                break;
            }
        }
        if (index != -1){
            employeeList.remove(index);
        }
    }
}
