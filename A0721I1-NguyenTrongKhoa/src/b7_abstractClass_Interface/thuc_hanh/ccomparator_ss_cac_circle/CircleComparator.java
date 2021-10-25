package b7_abstractClass_Interface.thuc_hanh.ccomparator_ss_cac_circle;

import b6_Ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.lop_Circle.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
