package b5_access_modifier_static_method_tatic_property.thuc_hanh.static_property;


public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazde 3","Skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda 6", "Skyactiv 6");
        System.out.println(Car.numberOfCars);
    }


}
