package thi.service.impl;

import bai_tap_them.utils.ReadAndWrite;
import thi.model.DienThoaiXachTay;
import thi.service.XachTayService;

import java.util.ArrayList;
import java.util.Scanner;

public class XachTayServiceImpl implements XachTayService {
    private static ArrayList<DienThoaiXachTay> dienThoaiXachTays = new ArrayList<>();
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
            System.out.println("Nhập quốc gia xách tay: ");
            String quocGia = scanner.nextLine();
            System.out.println("Trạng thái: ");
            String trangThai = scanner.nextLine();

            DienThoaiXachTay dienThoaiXachTay = new DienThoaiXachTay(id, ten, gia, soLuong, nhaSanXuat, quocGia, trangThai);
            dienThoaiXachTays.add(dienThoaiXachTay);
            ReadAndWrite.write(dienThoaiXachTays, "D:\\KhoaEm\\HocCodeGym\\A0721I1-NguyenTrongKhoa\\src\\thi\\data\\XachTay.csv");
            System.out.println("Đã thêm mới thành công");
    }

    @Override
    public void delete() {
        System.out.println("Nhập id cần xóa: ");
        int index = -1;
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < dienThoaiXachTays.size();i++){
            if (id == dienThoaiXachTays.get(i).getID()){
                index = i;
                break;
            }
        }
        if (index != -1){
            dienThoaiXachTays.remove(index);
        }
        ReadAndWrite.write(dienThoaiXachTays, "D:\\KhoaEm\\HocCodeGym\\A0721I1-NguyenTrongKhoa\\src\\thi\\data\\XachTay.csv");
    }

    @Override
    public void HienThi() {
        dienThoaiXachTays = (ArrayList<DienThoaiXachTay>) ReadAndWrite.read("D:\\KhoaEm\\HocCodeGym\\A0721I1-NguyenTrongKhoa\\src\\thi\\data\\XachTay.csv");
        for (DienThoaiXachTay dienThoaiXachTay: dienThoaiXachTays) {
            if (dienThoaiXachTay != null){
                System.out.println(dienThoaiXachTay.toString());
            }else {
                break;
            }
        }
    }

    @Override
    public int TimKiem() {
        System.out.println("Nhập id cần tìm kiếm: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < dienThoaiXachTays.size(); i++) {
            if (id == dienThoaiXachTays.get(i).getID()){

                System.out.println(dienThoaiXachTays.get(i));
                return i;
            }
        }
        return -1;
    }
}
