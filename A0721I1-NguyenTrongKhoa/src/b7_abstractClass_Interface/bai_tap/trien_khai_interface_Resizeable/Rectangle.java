package b7_abstractClass_Interface.bai_tap.trien_khai_interface_Resizeable;

import b6_Ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.lop_shape.Shape;

public class Rectangle extends Shape implements Resizeable{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, Boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}' + " which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.length += this.length * percent /100;
        this.width += this.length * percent /100;
    }
}
