package b6_Ke_thua.bai_tap.lop_circle_va_lop_cylinder.lop_cylinder;

import b6_Ke_thua.bai_tap.lop_circle_va_lop_cylinder.lop_circle.Circle;

public class Cylinder extends Circle {
    protected double height = 3.5;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + getHeight() +
                '}' + super.toString();
    }
}
