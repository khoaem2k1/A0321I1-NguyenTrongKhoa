package b17_io_binary_file_va_serialization.bai_tap.entity;

import java.io.Serializable;

public class SanPham implements Serializable {
    private static final long serialVersionUID = 6529685098267757690L;
    private int maSanPham;
    private String tenSanPham;
    private String hangSanPham;
    private double gia;

    public SanPham() {
    }

    public SanPham(int maSanPham, String tenSanPham, String hangSanPham, double gia) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.hangSanPham = hangSanPham;
        this.gia = gia;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHangSanPham() {
        return hangSanPham;
    }

    public void setHangSanPham(String hangSanPham) {
        this.hangSanPham = hangSanPham;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
}
