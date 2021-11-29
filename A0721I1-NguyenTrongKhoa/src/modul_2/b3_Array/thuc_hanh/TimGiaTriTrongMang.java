package b3_Array.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên 1 học sinh: ");
        String input_name = scanner.nextLine();

        boolean isExits = false;
        for (int i = 0; i < students.length; i++){
            if (students[i].equals(input_name)){
                System.out.println("Vị trí của các sinh viên trong danh sách " + input_name + " is: " + (i + 1));
                isExits = true;
                break;
            }
        }
        if (!isExits){
            System.out.println("Not found" + input_name + " in the list.");
        }

    }
}
