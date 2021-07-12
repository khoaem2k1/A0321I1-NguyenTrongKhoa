package b6_ke_thua.bai_tap.point2d_point3d;

public class Main {
    public static void main(String[] args) {
        Point2D p2a = new Point2D(1,2);
        System.out.println(p2a);
        Point2D p2b = new Point2D();
        System.out.println(p2b);
        p2a.setX(3);
        p2a.setY(4);
        System.out.println(p2a);
        System.out.println("x is:" + p2a.getX());
        System.out.println("y is:" + p2a.getY());
    }


}
