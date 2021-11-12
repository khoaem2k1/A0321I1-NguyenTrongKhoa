package b17_io_binary_file_va_serialization.bai_tap.service;

import b17_io_binary_file_va_serialization.bai_tap.dao.SanPhamDao;
import b17_io_binary_file_va_serialization.bai_tap.entity.SanPham;
import b17_io_binary_file_va_serialization.bai_tap.utils.TimKiemTheoGia;
import b17_io_binary_file_va_serialization.bai_tap.utils.TimKiemTheoTen;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QuanLiSanPham {
    public static Scanner scanner = new Scanner(System.in);
    private List<SanPham> sanPhamList;
    private SanPhamDao sanPhamDao;

    public QuanLiSanPham() {
        sanPhamDao = new SanPhamDao();
        sanPhamList = sanPhamDao.doc();
    }

    //thêm sản phẩm

    public void them() {
        int maSanPham = (sanPhamList.size() > 0) ? (sanPhamList.size() + 1) : 1;
        System.out.println("mã sản phẩm = " + maSanPham);
        String tenSanPham = themTenSanPham();
        String hangSanPham = themHangSanPham();
        double gia = themGia();
        SanPham sanPham = new SanPham(maSanPham, tenSanPham, hangSanPham, gia);
        sanPhamList.add(sanPham);
        sanPhamDao.ghi(sanPhamList);
    }
    //chỉnh sửa sản phẩm theo msp

    public void sua(int maSanPham) {
        boolean isExited = false;
        int size = sanPhamList.size();
        for (int i = 0; i < size; i++) {
            if (sanPhamList.get(i).getMaSanPham() == maSanPham) {
                isExited = true;
                sanPhamList.get(i).setTenSanPham(themTenSanPham());
                sanPhamList.get(i).setHangSanPham(themHangSanPham());
                sanPhamList.get(i).setGia(themGia());
                break;
            }
        }
        if (!isExited) {
            System.out.printf("mã sp = %d không tồn tại. \n", maSanPham);
        } else {
            sanPhamDao.ghi(sanPhamList);
        }
    }
    //xóa sp theo msp

    public void xoa(int maSanPham) {
        SanPham sanPham = null;
        int size = sanPhamList.size();
        for (int i = 0; i < size; i++) {
            if (sanPhamList.get(i).getMaSanPham() == maSanPham) {
                sanPham = sanPhamList.get(maSanPham);
                break;
            }
        }
        if (sanPham != null) {
            sanPhamList.remove(sanPham);
            sanPhamDao.ghi(sanPhamList);
        } else {
            System.out.printf("mã sp = %d không tồn tại.", maSanPham);
        }
    }
    //tìm kiếm theo tên sản phẩm

    public void timKiemTheoTen() {
        Collections.sort(sanPhamList, new TimKiemTheoTen());
    }

    //tìm kiếm theo giá sản phẩm

    public void timKiemTheoGia() {
        Collections.sort(sanPhamList, new TimKiemTheoGia());
    }

    //hiển thị danh sách sản phẩm
    public void hienThi() {
        for (SanPham sanPham : sanPhamList) {
            System.out.format("%5d | ", sanPham.getMaSanPham());
            System.out.format("%20s | ", sanPham.getTenSanPham());
            System.out.format("%20s | ", sanPham.getHangSanPham());
            System.out.format("%5f%n", sanPham.getGia());
        }
    }

    //nhập mã sp
    public int themMaSanPham() {
        System.out.print("Mã Sản Phẩm: ");
        while (true) {
            try {
                int maSanPham = Integer.parseInt((scanner.nextLine()));
                return maSanPham;
            } catch (NumberFormatException ex) {
                System.out.print("Không hợp lệ! Nhập lại Mã SP");
            }
        }
    }

    //nhập tên sp
    private String themTenSanPham() {
        System.out.print("Nhập tên sản phẩm: ");
        return scanner.nextLine();
    }

    //nhập hãng sp
    private String themHangSanPham() {
        System.out.print("Nhập hãng sản phẩm: ");
        return scanner.nextLine();
    }

    //nhập giá sp
    private double themGia() {
        System.out.print("Nhập giá sản phẩm: ");
        while (true) {
            try {
                double gia = Long.parseLong(String.valueOf((scanner.nextLong())));
                if (gia < 0.0 && gia > 100000000) {
                    throw new NumberFormatException();
                }
                return gia;
            } catch (NumberFormatException e) {
                System.out.print("không hợp lệ! Nhập lại giá sp");
            }
        }
    }
    //getter và setter

    public List<SanPham> getSanPhamList(){
        return sanPhamList;
    }
    public void setSanPhamList(List<SanPham> sanPhamList){
        this.sanPhamList = sanPhamList;
    }
}
