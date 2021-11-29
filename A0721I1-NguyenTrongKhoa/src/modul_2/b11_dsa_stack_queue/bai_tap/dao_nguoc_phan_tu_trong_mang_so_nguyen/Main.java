package b11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen;


import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void reverse(StringBuffer str) {

        int n = str.length();
        Stack obj = new Stack();

        int i;
        for (i = 0; i < n; i++)
            obj.push(str.charAt(i));

        for (i = 0; i < n; i++)
        {
            char ch = (char) obj.pop();
            str.setCharAt(i,ch);
        }
    }

    //driver function
    public static void main(String args[]) {
        StringBuffer s= new StringBuffer("KhoaEm");

        reverse(s);

        System.out.println("Chuỗi đảo ngược là: " + s);
    }
}
