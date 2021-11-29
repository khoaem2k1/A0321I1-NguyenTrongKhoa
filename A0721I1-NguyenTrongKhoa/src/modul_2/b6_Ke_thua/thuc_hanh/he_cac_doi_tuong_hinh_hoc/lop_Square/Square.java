package b6_Ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.lop_Square;

import b6_Ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.lop_Rectangle.Rectangle;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {

        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super( color, filled, side, side);
    }

    public double getSide() {

        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}
