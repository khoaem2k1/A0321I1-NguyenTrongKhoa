package bai_tap_them.model;

public class XeMay extends PhuongTien{
    private int congSuat;

    public XeMay() {
    }

    public XeMay(int id, String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, int congSuat) {
        super(id, bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "id=" + getId() +
                ", bienKiemSoat='" + getBienKiemSoat() + '\'' +
                ", tenHangSanXuat='" + getTenHangSanXuat() + '\'' +
                ", namSanXuat=" + getNamSanXuat() +
                ", chuSoHuu='" + getChuSoHuu() +
                "congSuat=" + congSuat +
                '}';
    }
}
