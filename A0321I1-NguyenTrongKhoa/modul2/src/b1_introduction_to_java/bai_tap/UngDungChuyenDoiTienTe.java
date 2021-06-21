package b1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Mời bạn nhập số tiền USD: ");
        usd = sc.nextDouble();
        double quydoi = usd * vnd;
        System.out.printf("Giá trị VND: "+quydoi);
    }
}
