package b6_ke_thua.bai_tap.circle_cylinder;

import b6_ke_thua.thuc_hanh.circle.Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);
        System.out.println("Area circle :" + circle.getArea());

        Cylinder cylinder = new Cylinder(circle.getRadius(), circle.getColor(), 10);
        System.out.println("Total is: " + cylinder.getTotalArea());
    }
}
