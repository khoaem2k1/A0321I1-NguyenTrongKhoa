package b3_Array.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        System.out.print("nhập vị trí cần thêm: ");
        int atIndex = sc.nextInt();
        System.out.print("nhập phần tử cần thêm: ");
        int value = sc.nextInt();
        System.out.print("Nhập sô phần tử có trong mảng: ");
        int n = sc.nextInt();
        for (int i = 0; i < n +1 ; i++){
            a[i] = i + 1;
        }
        System.out.print("Trước khi thêm: ");
        for (int element : a){
            System.out.print(element + " ");
        }
        System.out.println();
        for (int i = n; i > atIndex; i--){
            a[i] = a[i - 1];
        }
        a[atIndex] = value;
        System.out.print("Sau khi thêm: ");
        for (int element : a){
            System.out.print(element + " ");
        }
    }
}
