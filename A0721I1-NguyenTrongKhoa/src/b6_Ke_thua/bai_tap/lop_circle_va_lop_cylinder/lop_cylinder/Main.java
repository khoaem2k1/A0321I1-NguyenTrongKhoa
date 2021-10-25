package b6_Ke_thua.bai_tap.lop_circle_va_lop_cylinder.lop_cylinder;

public class Main {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        System.out.println(c);

        Cylinder c1 = new Cylinder(5.5);
        System.out.println(c1);

        Cylinder c2 = new Cylinder(7.0, "green",9.0);
        System.out.println(c2);
    }
}
