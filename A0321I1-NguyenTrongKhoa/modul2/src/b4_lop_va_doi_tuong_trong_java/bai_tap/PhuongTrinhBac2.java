package b4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

public class PhuongTrinhBac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giải phương trình bậc 2 : ax2 + bx + x = 0");
        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();

        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();

        System.out.println("Nhập c: ");
        double c = scanner.nextDouble();

        if(a == 0){
            if (b == 0){
                if (c == 0){
                    System.out.println("Phương trình có vô số nghiệm");
                }else {
                    System.out.println("Phương trình vô nghiệm");
                }
            }else {
                double x = -c/b;
                System.out.println("Phương trình có một nghiệm x = "+x);
            }
        }else {
            double delta = b * b - 4 * a * c;
            if (delta < 0){
                System.out.println("Phương trình vô nghiệm");
            }else if (delta == 0){
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm duy nhất x = " + x);
            }else {
                double x1 = (-b + Math.sqrt(delta)) / ( 2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm x1 = " + x1 + "và x2 = " +x2);
            }
        }
    }
}
