package b7_abstract_class_interface.thuc_hanh.Animal_InterfaceEdible.Animal;

import b7_abstract_class_interface.thuc_hanh.Animal_InterfaceEdible.edible.Edible;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck";
    }

    @Override
    public String howToEat() {
        return "could be friend";
    }
}
