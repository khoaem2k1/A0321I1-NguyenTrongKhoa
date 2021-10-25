package b6_Ke_thua.bai_tap.lop_circle_va_lop_cylinder.lop_circle;

public class Circle {
    protected double radius = 1.0;
    protected String color = "red";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return " Circle{" +
                "radius=" + getRadius() +
                ", color='" + getColor() + '\'' + ", Area=" + getArea()
                 + '}';
    }
}
