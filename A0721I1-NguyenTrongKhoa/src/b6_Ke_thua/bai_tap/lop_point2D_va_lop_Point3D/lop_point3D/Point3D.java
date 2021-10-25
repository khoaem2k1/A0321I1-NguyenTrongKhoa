package b6_Ke_thua.bai_tap.lop_point2D_va_lop_Point3D.lop_point3D;

import b6_Ke_thua.bai_tap.lop_point2D_va_lop_Point3D.lop_point2D.Point2D;

public class Point3D extends Point2D {
    protected float z;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + getZ() +
                '}' + super.toString();
    }
}
