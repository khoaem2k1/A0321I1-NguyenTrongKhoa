package b5_Static_modifier.thuc_hanh.static_property;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mecerdec", "Skyactiv");
        car1.display();
        Car car2 = new Car("MayBack", "Skyactiv");
        car2.display();
    }
}
