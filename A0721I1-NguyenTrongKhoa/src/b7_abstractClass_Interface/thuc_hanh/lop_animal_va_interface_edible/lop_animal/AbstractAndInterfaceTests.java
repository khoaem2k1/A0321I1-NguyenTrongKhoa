package b7_abstractClass_Interface.thuc_hanh.lop_animal_va_interface_edible.lop_animal;

import b7_abstractClass_Interface.thuc_hanh.lop_animal_va_interface_edible.lop_edible.Edible;
import b7_abstractClass_Interface.thuc_hanh.lop_animal_va_interface_edible.lop_fruit.Apple;
import b7_abstractClass_Interface.thuc_hanh.lop_animal_va_interface_edible.lop_fruit.Fruit;
import b7_abstractClass_Interface.thuc_hanh.lop_animal_va_interface_edible.lop_fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] a = new Animal[2];
        a[0] = new Tiger();
        a[1] = new Chicken();
        for (Animal ani : a){
            System.out.println(ani.makeSound());
            if (ani instanceof Chicken){
                Edible e = (Chicken) ani;
                System.out.println(e.howToEat());
            }
        }
        Fruit[] f = new Fruit[2];
        f[0] = new Orange();
        f[1] = new Apple();

        for (Fruit fr : f){
            System.out.println(fr.howToEat());
        }
    }
}
