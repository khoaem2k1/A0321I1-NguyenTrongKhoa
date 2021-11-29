package b11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen;

import java.util.Stack;

public class DaoNguocPhanTu {
    int size;
    int top;
    char[] a;

    //// hàm kiểm tra xem ngăn xếp có trống không
    public boolean isEmpty(){
        return (top < 0);
    }

    // hàm để thêm phần vào cuối Stack
    boolean push(char x){
        if (top >= size){
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            a[++top] = x;
            return true;
        }
    }

    //lấy phần tử từ stack
    public char pop(){
        if (top < 0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            char x = a[top--];
            return x;
        }
    }
}

