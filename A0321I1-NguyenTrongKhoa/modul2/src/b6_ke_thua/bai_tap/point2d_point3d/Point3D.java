package b6_ke_thua.bai_tap.point2d_point3d;

public class Point3D extends Point2D{
    private int z;

    public Point3D() {
        super();
        this.z = 0;
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "("+ super.getX() +","+ super.getY()+"," + this.z +")";
    }
}
