package thi.service.impl;

import bai_tap_them.utils.ReadAndWrite;
import thi.model.DienThoaiChinhHang;
import thi.service.ChinhHanhService;

import java.util.ArrayList;
import java.util.Scanner;

public class ChinhHangServiceImpl implements ChinhHanhService {

    private static ArrayList<DienThoaiChinhHang> dienThoaiChinhHangs = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên điện thoại: ");
        String ten = scanner.nextLine();
        System.out.println("Nhập giá: ");
        int gia = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số lượng: ");
        int soLuong = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập nhà sản xuất: ");
        String nhaSanXuat = scanner.nextLine();
        System.out.println("Nhập thời gian bao hành: ");
        int thoiGian = Integer.parseInt(scanner.nextLine());
        System.out.println("Phạm vi bảo hành: ");
        String phamVi = scanner.nextLine();

        DienThoaiChinhHang dienThoaiChinhHang = new DienThoaiChinhHang(id, ten, gia, soLuong, nhaSanXuat, thoiGian, phamVi);
        dienThoaiChinhHangs.add(dienThoaiChinhHang);
        ReadAndWrite.write(dienThoaiChinhHangs, "D:\\KhoaEm\\HocCodeGym\\A0721I1-NguyenTrongKhoa\\src\\thi\\data\\ChinhHang.csv");
        System.out.println("Đã thêm mới thành công");
    }
    @Override
    public void HienThi() {
        dienThoaiChinhHangs = (ArrayList<DienThoaiChinhHang>) ReadAndWrite.read("D:\\KhoaEm\\HocCodeGym\\A0721I1-NguyenTrongKhoa\\src\\thi\\data\\ChinhHang.csv");
        for (DienThoaiChinhHang dienThoaiChinhHang: dienThoaiChinhHangs) {
            if (dienThoaiChinhHang != null){
                System.out.println(dienThoaiChinhHang.toString());
            }else {
                break;
            }
        }
    }

    @Override
    public int TimKiem() {
            System.out.println("Nhập id cần tìm kiếm: ");
            int id = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < dienThoaiChinhHangs.size(); i++) {
                if (id == dienThoaiChinhHangs.get(i).getID()){

                    System.out.println(dienThoaiChinhHangs.get(i));
                    return i;
                }

            }
            return -1;

    }

    @Override
    public void delete() {
        System.out.println("Nhập id cần xóa: ");
        int index = -1;
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < dienThoaiChinhHangs.size();i++){
            if (id == dienThoaiChinhHangs.get(i).getID()){
                index = i;
                break;
            }
        }
        if (index != -1){
            dienThoaiChinhHangs.remove(index);
        }
        ReadAndWrite.write(dienThoaiChinhHangs, "D:\\KhoaEm\\HocCodeGym\\A0721I1-NguyenTrongKhoa\\src\\thi\\data\\ChinhHang.csv");

    }
}
