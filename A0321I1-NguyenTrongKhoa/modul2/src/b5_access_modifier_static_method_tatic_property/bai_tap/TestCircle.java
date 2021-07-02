package b5_access_modifier_static_method_tatic_property.bai_tap;

public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("The radius is: "+ c.getDarius());
        System.out.println("The area is: " + c.getArea());

        Circle c1 = new Circle(2.0);
        System.out.println("The radius is: " + c1.getDarius());
        System.out.println("The radius is: " + c1.getArea());
    }
}
