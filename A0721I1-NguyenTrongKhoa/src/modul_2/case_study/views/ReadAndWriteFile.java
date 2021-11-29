package case_study.views;

import b17_io_binary_file_va_serialization.bai_tap.entity.SanPham;
import case_study.models.Employee;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    final static String NHANVIEN_PATH ="D:\\KhoaEm\\HocCodeGym\\A0721I1-NguyenTrongKhoa\\src\\case_study\\data\\nhanvien.csv";
    public static void ghi(List<Employee> employeeList, boolean append){
        File file = new File(NHANVIEN_PATH);
        FileWriter fileWriter =null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,append); // true ghi tiếp(dùng cho thêm mới => false ghi đè (dùng cho edit và xóa)
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee: employeeList){
                bufferedWriter.write(employee.getInfoToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }

    }
    public static List<Employee> doc(){
        List<Employee> employeeList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(NHANVIEN_PATH));
            ois = new ObjectInputStream(fis);
            employeeList = (List<Employee>) ois.readObject();
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
        return employeeList;
    }
    private static void closeStream(InputStream is) {
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
