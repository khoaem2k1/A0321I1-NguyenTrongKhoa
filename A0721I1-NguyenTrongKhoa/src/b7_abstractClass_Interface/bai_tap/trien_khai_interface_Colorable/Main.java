package b7_abstractClass_Interface.bai_tap.trien_khai_interface_Colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];

        for (int i = 0; i < shapes.length; i++){

            shapes[i] = getRandomShape();

        }
        Shape.printShape(shapes);
        for (Shape x : shapes) {
            if (x instanceof Colorable) {
                ((Colorable) x).howToColor();
            }
        }
    }
    static  Shape getRandomShape() {
        int random = (int) (Math.round(Math.random() * 2));
        switch (random) {
            case 0:
                return new Square(10);
            case 1:
                return new Rectangle(10, 20, "red",false);
            default:
                return new Circle(10);
        }
    }
}
