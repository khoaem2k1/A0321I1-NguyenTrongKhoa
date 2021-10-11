package b6_Ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.lop_Circle;

import b6_Ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.lop_shape.Shape;

public class Circle  extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return 2 * radius * Math.PI;
    }
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius= "
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}
