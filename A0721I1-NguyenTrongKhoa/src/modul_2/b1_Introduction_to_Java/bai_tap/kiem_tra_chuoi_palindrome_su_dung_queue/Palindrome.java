package b11_dsa_stack_queue.bai_tap.kiem_tra_chuoi_palindrome_su_dung_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Nhập vào chuỗi cần kiểm tra: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Queue queue = new LinkedList();
        for (int i = str.length()-1; i >= 0; i--){
            queue.add(str.charAt(i));
        }
        String st = "";
        while (!queue.isEmpty()){
            st = st + queue.remove();
        }
        if (str.equals(st)){
            System.out.println("Đây là Palindrome");
        }else {
            System.out.println("Đây không phải là Palindrome");
        }
    }
}
