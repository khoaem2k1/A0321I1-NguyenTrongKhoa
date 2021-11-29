package thi.model;

import java.util.Date;

public class DienThoaiChinhHang extends DienThoai{
    private int thoiGianBaoHanh;
    private String phamViBaoHanh;

    public DienThoaiChinhHang() {
    }

    public DienThoaiChinhHang(int ID, String tenDienThoai, int giaBan, int soLuong, String nhaSanXuat, int thoiGianBaoHanh, String phamViBaoHanh) {
        super(ID, tenDienThoai, giaBan, soLuong, nhaSanXuat);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getPhamViBaoHanh() {
        return phamViBaoHanh;
    }

    public void setPhamViBaoHanh(String phamViBaoHanh) {
        this.phamViBaoHanh = phamViBaoHanh;
    }

    @Override
    public String toString() {
        return "DienThoaiChinhHang{"+
                "ID=" + getID() +
                ", tenDienThoai='" + getTenDienThoai() + '\'' +
                ", giaBan=" + getGiaBan() +
                ", soLuong=" + getSoLuong() +
                ", nhaSanXuat='" + getNhaSanXuat() +
                "thoiGianBaoHanh=" + thoiGianBaoHanh +
                ", phamViBaoHanh=" + phamViBaoHanh +
                '}';
    }
}
