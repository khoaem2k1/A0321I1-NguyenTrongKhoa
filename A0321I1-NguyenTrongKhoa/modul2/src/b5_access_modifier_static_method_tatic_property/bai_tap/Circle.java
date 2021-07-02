package b5_access_modifier_static_method_tatic_property.bai_tap;

public class Circle {
   private double radius;
   private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }
    public Circle(double r){
        radius = r;
        color = "red";
    }
    public double getDarius() {
        return radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
