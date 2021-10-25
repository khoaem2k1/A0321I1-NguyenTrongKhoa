package b7_abstractClass_Interface.thuc_hanh.ccomparator_ss_cac_circle;

import b6_Ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.lop_Circle.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle("indigo",false,3.5);
        System.out.println("Pre-sorted: ");
        for (Circle circle : circles){
            System.out.println(circle);
        }
        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted: ");
        for (Circle circle : circles){
            System.out.println(circle);
        }
    }
}
