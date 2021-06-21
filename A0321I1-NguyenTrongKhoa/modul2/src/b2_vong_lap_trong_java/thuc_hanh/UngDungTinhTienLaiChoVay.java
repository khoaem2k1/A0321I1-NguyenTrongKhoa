package b2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class UngDungTinhTienLaiChoVay {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interset_rate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền: ");
        money = input.nextDouble();
        System.out.println("Nhập số tháng: ");
        month = input.nextInt();
        System.out.println("Lãi suất hàng năm: ");
        interset_rate = input.nextDouble();
        double total_interset = 0;
        for(int i = 0; i < month; i++){
            total_interset += money * (interset_rate/100)/12 * month;

        }
        System.out.println("Lãi: " + total_interset);
    }
}
