package b3_Array.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int a[] = new int[10];
        int n = 5;
        int atIndex = 0;
        for (int i = 0; i < n; i++){
            a[i] = i + 1;
        }
        System.out.print("Trước khi xóa: ");
        for (int element : a){
            System.out.print(element + " ");
        }
        System.out.println();
        for (int i = atIndex; i < a.length - 1; i++){
            a[i] = a[i + 1];
        }
        System.out.print("Sau khi xóa: ");
        for (int element : a){
            System.out.print(element + " ");
        }
    }
}
