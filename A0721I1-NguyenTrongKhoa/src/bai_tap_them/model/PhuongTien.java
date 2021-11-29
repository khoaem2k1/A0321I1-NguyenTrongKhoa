package bai_tap_them.model;

import java.io.Serializable;

public abstract class PhuongTien implements Serializable {
    private int id;
    private String bienKiemSoat;
    private String tenHangSanXuat;
    private int namSanXuat;
    private String chuSoHuu;

    public PhuongTien() {
    }

    public PhuongTien(int id, String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu) {
        this.id = id;
        this.bienKiemSoat = bienKiemSoat;
        this.tenHangSanXuat = tenHangSanXuat;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    @Override
    public String toString() {
        return "PhuongTien{" +
                "id=" + id +
                ", bienKiemSoat='" + bienKiemSoat + '\'' +
                ", tenHangSanXuat='" + tenHangSanXuat + '\'' +
                ", namSanXuat=" + namSanXuat +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                '}';
    }
}
