package b7_abstract_class_interface.thuc_hanh.Animal_InterfaceEdible;

import b7_abstract_class_interface.thuc_hanh.Animal_InterfaceEdible.Animal.Animal;
import b7_abstract_class_interface.thuc_hanh.Animal_InterfaceEdible.Animal.Chicken;
import b7_abstract_class_interface.thuc_hanh.Animal_InterfaceEdible.Animal.Tiger;
import b7_abstract_class_interface.thuc_hanh.Animal_InterfaceEdible.fruit.Apple;
import b7_abstract_class_interface.thuc_hanh.Animal_InterfaceEdible.edible.Edible;
import b7_abstract_class_interface.thuc_hanh.Animal_InterfaceEdible.fruit.Fruit;
import b7_abstract_class_interface.thuc_hanh.Animal_InterfaceEdible.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals){
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken){
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
