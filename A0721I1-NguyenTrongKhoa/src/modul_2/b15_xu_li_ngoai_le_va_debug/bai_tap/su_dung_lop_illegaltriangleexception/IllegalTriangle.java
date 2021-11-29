package b15_xu_li_ngoai_le_va_debug.bai_tap.su_dung_lop_illegaltriangleexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Check check = new Check();
        try {
            System.out.println("Nhập a: ");
            double a = sc.nextInt();
            System.out.println("Nhập b: ");
            double b = sc.nextInt();
            System.out.println("Nhập c: ");
            double c = sc.nextInt();
            try {
                check.checkTriangleEdges(a, b, c);

            }catch (IllegalTriangleException il){
                System.out.println("Loi: Tam giac khong hop le!" + il.getMessage());
            }
        }catch (InputMismatchException e){
            System.out.println("Sai định dạng nhập vào");
        }

    }


}