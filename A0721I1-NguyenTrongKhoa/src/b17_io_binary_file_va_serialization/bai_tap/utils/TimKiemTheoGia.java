package b17_io_binary_file_va_serialization.bai_tap.utils;

import b17_io_binary_file_va_serialization.bai_tap.entity.SanPham;

import java.util.Comparator;

public class TimKiemTheoGia implements Comparator<SanPham> {

    @Override
    public int compare(SanPham s1, SanPham s2) {
        if (s1.getGia() > s2.getGia()){
            return 1;
        }
        return -1;
    }
}
