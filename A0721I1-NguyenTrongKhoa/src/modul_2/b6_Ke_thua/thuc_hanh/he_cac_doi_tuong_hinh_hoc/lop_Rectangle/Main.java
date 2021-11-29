package b6_Ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.lop_Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r);

        Rectangle r1 = new Rectangle(2.0,3.0);
        System.out.println(r1);

        Rectangle r2 = new Rectangle("red", false, 2.0,5.0);
        System.out.println(r2);
    }
}
