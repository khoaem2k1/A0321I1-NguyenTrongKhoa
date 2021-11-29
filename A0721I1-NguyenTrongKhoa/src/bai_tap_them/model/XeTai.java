package bai_tap_them.model;

public class XeTai extends PhuongTien{
    private int trongTai;

    public XeTai() {
    }

    public XeTai(int id, String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, int trongTai) {
        super(id, bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" +
                "id=" + getId() +
                ", bienKiemSoat='" + getBienKiemSoat() + '\'' +
                ", tenHangSanXuat='" + getTenHangSanXuat() + '\'' +
                ", namSanXuat=" + getNamSanXuat() +
                ", chuSoHuu='" + getChuSoHuu() +
                "trongTai=" + trongTai +
                '}';
    }
}
