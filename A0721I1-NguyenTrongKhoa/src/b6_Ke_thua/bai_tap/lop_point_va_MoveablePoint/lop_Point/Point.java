package b6_Ke_thua.bai_tap.lop_point_va_MoveablePoint.lop_Point;

public class Point {
    private double x = 0;
    private double y = 0;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y) {
        this.y = y;
        this.x = x;
    }

    public double[] getXY() {
        double[] out = {this.x, this.y};
        return out;
    }

    @Override
    public String toString() {
        return "+ position: (" + this.x + "," + this.y + ")" + "\n";
    }
}


