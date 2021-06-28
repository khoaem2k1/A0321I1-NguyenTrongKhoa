package b3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int mang[] = new int[10];
        int index = minValue(mang);
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < mang.length; i++){
            System.out.printf("Nhập phần tử thứ %d : ", (i+1));
            mang[i] = s.nextInt();
        }
        System.out.println("Giá trị nhỏ nhất là: " + mang[index]);

    }
    public static int minValue(int[] mang){
        int min = mang[0];
        for (int i = 0; i < mang.length; i++){
            if (mang[i] < min){
                min = mang[i];
            }
        }
        return min;

    }

}
