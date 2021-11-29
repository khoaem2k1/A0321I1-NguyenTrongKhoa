package b6_Ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.lop_Square;

public class Main {
    public static void main(String[] args) {
        Square sq = new Square();
        System.out.println(sq);

        Square sq1 = new Square(2.3);
        System.out.println(sq1);

        Square sq2 = new Square(1.2, "yellow", true);
        System.out.println(sq2);
    }
}
