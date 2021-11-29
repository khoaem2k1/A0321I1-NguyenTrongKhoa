package b17_io_binary_file_va_serialization.bai_tap.dao;

import b12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework.entity.Product;
import b17_io_binary_file_va_serialization.bai_tap.entity.SanPham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SanPhamDao {
    private static final String SANPHAM_FILE_NAME = "D:\\KhoaEm\\HocCodeGym\\A0721I1-NguyenTrongKhoa\\src\\b17_io_binary_file_va_serialization\\bai_tap\\data\\sanpham.txt";
//lưu ds sản phẩm vào file
    public void ghi(List<SanPham> sanPhamList){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(new File(SANPHAM_FILE_NAME));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(sanPhamList);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException ex){
            ex.printStackTrace();
        }finally {
            closeStream(fos);
            closeStream(oos);
        }
    }
//đọc ds sản phẩm từ file
    public List<SanPham> doc() {
        List<SanPham> sanPhamList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(SANPHAM_FILE_NAME));
            ois = new ObjectInputStream(fis);
            sanPhamList = (List<SanPham>) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            closeStream(fis);
            closeStream(ois);
        }
        return sanPhamList;
    }


    private void closeStream(InputStream is) {
        if (is != null){
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private void closeStream(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
