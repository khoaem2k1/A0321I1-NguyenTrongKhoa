package bai_tap_them.service.impl;

import bai_tap_them.model.XeMay;
import bai_tap_them.model.XeTai;
import bai_tap_them.service.Service;
import bai_tap_them.utils.ReadAndWrite;
import bai_tap_them.utils.RegexData;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class XeTaiServiceImpl implements Service {
    public static final String REGEX_XETAI = "\\d{2}((A)|(B))\\S\\d{3}.\\d{2}";//(X : 0÷9 , Y=A nếu xe du lịch, Y=B  nếu xe khách)
    private static List<XeTai> xeTaiList = new LinkedList<>();
    private Scanner scanner = new Scanner(System.in);

    static {
        xeTaiList.add(new XeTai(1,"43A-212.56","Toyota",2019,"nguyễn Văn A",10));
        xeTaiList.add(new XeTai(2,"43B-453.88","Huyndai",2020,"Nguyễn Văn B",15));
        xeTaiList.add(new XeTai(3,"43A-212.56","Ford",2020,"Nguyễn Văn C",5));
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
        System.out.println("Nhập trọng tải: ");
        int trongTai = Integer.parseInt(scanner.nextLine());


        XeTai xeTai = new XeTai(id, bien, ten, nam, chu, trongTai);
        xeTaiList.add(xeTai);
        System.out.println("Đã thêm mới thành công");
        ReadAndWrite.write(xeTaiList, "D:\\KhoaEm\\HocCodeGym\\A0721I1-NguyenTrongKhoa\\src\\bai_tap_them\\data\\xeTai.csv");
    }
    private String bienKiemSoat(){
        System.out.println("Nhập biển kiểm soát");
        return RegexData.regex(scanner.nextLine(), REGEX_XETAI, "Bạn đã nhâ[j sai định dạng");
    }

    @Override
    public void HienThi() {
        ReadAndWrite.write(xeTaiList, "D:\\KhoaEm\\HocCodeGym\\A0721I1-NguyenTrongKhoa\\src\\bai_tap_them\\data\\oto.csv");
        for (XeTai xeTai: xeTaiList) {
            System.out.println(xeTai.toString());
        }
    }

    @Override
    public void delete() {
        System.out.println("Nhập id cần xóa: ");
        int index = -1;
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < xeTaiList.size();i++){
            if (id == xeTaiList.get(i).getId()){
                index = i;
                break;
            }
        }
        if (index != -1){
            xeTaiList.remove(index);
        }
        ReadAndWrite.write(xeTaiList, "D:\\KhoaEm\\HocCodeGym\\A0721I1-NguyenTrongKhoa\\src\\bai_tap_them\\data\\xeTai.csv");
    }
}
