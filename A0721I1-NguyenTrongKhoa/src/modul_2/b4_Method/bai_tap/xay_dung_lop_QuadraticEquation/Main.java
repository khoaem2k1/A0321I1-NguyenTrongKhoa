package b4_Method.bai_tap.xay_dung_lop_QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c;
        System.out.println("Nhập a,b,c: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        QuadraticEquation qa = new QuadraticEquation(a, b, c);
        if (qa.getdelta() > 0){
            System.out.println("Phương trình có 2 ngiệm: \n" + "x1:" + qa.getRoot1() + "\nx2 : " + qa.getRoot2());
        }else if(qa.getdelta() == 0){
            System.out.println("Phương trình có nghiệm kép: "+ qa.getRoot1());
        }else{
            System.out.println("Phương trình không có nghiệm ");

        }
    }
}
