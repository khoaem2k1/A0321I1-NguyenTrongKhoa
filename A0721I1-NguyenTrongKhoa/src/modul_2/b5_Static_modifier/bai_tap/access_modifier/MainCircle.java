package b5_Static_modifier.bai_tap.access_modifier;

public class MainCircle {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("The radius is: " + c.getArea());
        System.out.println("The area is : " + c.getArea());

        System.out.println("+++++++++++++++++++++++++++++");

        Circle c1 = new Circle(3.0);
        System.out.println("The radius is: " + c1.getArea());
        System.out.println("The area is :" + c1.getArea());
    }
}
