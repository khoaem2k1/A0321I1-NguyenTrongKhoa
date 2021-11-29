package bai_tap_them.service.impl;

import bai_tap_them.model.Oto;
import bai_tap_them.model.XeMay;
import bai_tap_them.service.Service;
import bai_tap_them.utils.ReadAndWrite;
import bai_tap_them.utils.RegexData;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class XeMayServiceImpl implements Service {
    public static final String REGEX_XEMAY = "\\d{2}\\S[A-Z][0-9A-Z]\\S\\d{3}.\\d{2}";//(X : 0÷9, Y= (Chữ cái in hoa), Z =(0÷9) hoặc (Chữ cái in Hoa)
    private static List<XeMay> xeMayList = new LinkedList<>();
    private Scanner scanner = new Scanner(System.in);

    static {
        xeMayList.add(new XeMay(1,"43A-212.56","Toyota",2019,"nguyễn Văn A",100));
        xeMayList.add(new XeMay(2,"43B-453.88","Huyndai",2020,"Nguyễn Văn B",150));
        xeMayList.add(new XeMay(3,"43A-212.56","Ford",2020,"Nguyễn Văn C",50));
    }


    @Override
    public void add() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        String bien = bienKiemSoat();
        System.out.println("Nhập tên hãng sản xuất: ");
        String ten = scanner.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        int nam = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chủ sở hữu: ");
        String chu = scanner.nextLine();
        System.out.println("Nhập công suất: ");
        int congSuat = Integer.parseInt(scanner.nextLine());


        XeMay xeMay = new XeMay(id, bien, ten, nam, chu, congSuat);
        xeMayList.add(xeMay);
        System.out.println("Đã thêm mới thành công");
        ReadAndWrite.write(xeMayList, "D:\\KhoaEm\\HocCodeGym\\A0721I1-NguyenTrongKhoa\\src\\bai_tap_them\\data\\xeMay.csv");
    }

    @Override
    public void HienThi() {
        xeMayList = (List<XeMay>) ReadAndWrite.read("D:\\KhoaEm\\HocCodeGym\\A0721I1-NguyenTrongKhoa\\src\\bai_tap_them\\data\\xeMay.csv");
        for (XeMay xeMay: xeMayList) {
            System.out.println(xeMay.toString());
        }
    }
    private String bienKiemSoat(){
        System.out.println("Nhập biển kiểm soát");
        return RegexData.regex(scanner.nextLine(), REGEX_XEMAY, "Bạn đã nhâ[j sai định dạng");
    }

    @Override
    public void delete() {
        System.out.println("Nhập id cần xóa: ");
        int index = -1;
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < xeMayList.size();i++){
            if (id == xeMayList.get(i).getId()){
                index = i;
                break;
            }
        }
        if (index != -1){
            xeMayList.remove(index);
        }
        ReadAndWrite.write(xeMayList, "D:\\KhoaEm\\HocCodeGym\\A0721I1-NguyenTrongKhoa\\src\\bai_tap_them\\data\\oto.csv");
    }
}
