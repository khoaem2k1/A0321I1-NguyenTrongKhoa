package b7_abstract_class_interface.bai_tap.interfaceResizeable;

public class Main {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("yellow", false, x);
        shapes[1] = new Rectangle("infinity",true, x,x);
        shapes[2] = new Square(x, "melinda", true);

        for (Shape a : shapes){
            a.resize(Math.random() * 1000);
        }
        Shape.printShape(shapes);
    }
}
