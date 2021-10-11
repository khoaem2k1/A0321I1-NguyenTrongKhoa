package b1_Introduction_to_Java.bai_tap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Mời nhập số đô: ");
        usd = sc.nextDouble();
        double many = usd * vnd;
        System.out.printf("Số tiền từ usd chuyển sang vnd: "+ many);
    }
}
