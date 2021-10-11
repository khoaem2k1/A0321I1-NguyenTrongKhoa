package b6_Ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.lop_Circle;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c);

        Circle c1 = new Circle(3.5);
        System.out.println(c1);

        Circle c2 = new Circle("yellow", false, 3.5);
        System.out.println(c2);
    }
}
