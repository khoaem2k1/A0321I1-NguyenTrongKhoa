package b11_dsa_stack_queue.bai_tap.chuyen_doi_tu_he_thap_phan_sang_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class HeThapPhanSangNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Nhập vào 1 số thập phân: ");
        int num = sc.nextInt();
        while (num != 0){
            int d = num % 2;
            stack.push(d);
            num /= 2;
        }
        System.out.println("Giá trị được đổi sang nhị phân là: ");
        while (!(stack.isEmpty())){
            System.out.print(stack.pop());
        }
    }
}
