package b3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int a[] = new int[10];
        int n = 5;
        int atIndex = 0;
        for (int i = 0; i < n; i++){
            a[i] = i + 1;
        }
        System.out.println("Trước khi xóa");
        for (int element : a){
            System.out.println(element + " ");
        }
        System.out.println();
        for (int i = atIndex; i < a.length - 1; i++){
            a[i] = a[i + 1];
        }
        System.out.println("Sau khi xóa");
        for (int element : a){
            System.out.println(element + " ");
        }
    }
}
