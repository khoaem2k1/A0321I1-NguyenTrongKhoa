package b7_abstractClass_Interface.thuc_hanh.trien_khai_interface_comparable_cho_cac_lop_hinh_hoc;


import b6_Ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.lop_Circle.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(String color, Boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()){
            return 1;
        }else if(getRadius() < o.getRadius()){
            return -1;
        }else {
            return 1;
        }
    }
}

