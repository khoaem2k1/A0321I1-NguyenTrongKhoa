package b6_ke_thua.bai_tap.point_moveablePoint;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(20,30);
        System.out.println(p.toString());
        p.setXY(10,20);
        System.out.println(p.toString());
        p = new MoveAblePoint(p.getX(),
                p.getY(),
                10,
                20);
        System.out.println(p.toString());
        ((MoveAblePoint) p).move();
        System.out.println(p.toString());
        MoveAblePoint anotherPoint = new MoveAblePoint(20,20);
        System.out.println(anotherPoint.toString());
        anotherPoint.move();
        System.out.println(anotherPoint.toString());
    }
}
