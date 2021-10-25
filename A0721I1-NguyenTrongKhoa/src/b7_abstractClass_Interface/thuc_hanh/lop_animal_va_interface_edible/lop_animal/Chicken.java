package b7_abstractClass_Interface.thuc_hanh.lop_animal_va_interface_edible.lop_animal;

import b7_abstractClass_Interface.thuc_hanh.lop_animal_va_interface_edible.lop_edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
    @Override
    public String howToEat(){
        return "could be fried";
    }
}
