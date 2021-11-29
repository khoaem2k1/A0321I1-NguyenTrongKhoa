package bai_tap_them.service.impl;

import bai_tap_them.model.Oto;
import bai_tap_them.service.OtoService;
import bai_tap_them.utils.ReadAndWrite;
import bai_tap_them.utils.RegexData;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OtoServiceImpl implements OtoService {

    public static final String REGEX_OTO = "\\d{2}(C)\\S\\d{3}.\\d{2}";//XXY-XXX.XX (X : 0÷9 , Y=A nếu xe du lịch, Y=B  nếu xe khách)
    private static ArrayList<Oto> otoList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);



//    static {
//        otoList.add(new Oto(1,"43A-212.56","Toyota",2019,"nguyễn Văn A",5,"Du lịch"));
//        otoList.add(new Oto(2,"43B-453.88","Huyndai",2020,"Nguyễn Văn B",45,"Xe khách"));
//        otoList.add(new Oto(3,"43A-212.56","Ford",2020,"Nguyễn Văn C",16,"Xe Khách"));
//    }

    @Override
    public void HienThi() {
        otoList = (ArrayList<Oto>) ReadAndWrite.read("D:\\KhoaEm\\HocCodeGym\\A0721I1-NguyenTrongKhoa\\src\\bai_tap_them\\data\\oto.csv");
        for (Oto oto: otoList) {
            if (oto != null){
                System.out.println(oto.toString());
            }else {
                break;
            }
        }
    }
    private String bienKiemSoat(){
        System.out.println("Nhập biển kiểm soát");
        return RegexData.regex(scanner.nextLine(), REGEX_OTO, "Bạn đã nhâ[j sai định dạng");
    }

    @Override
    public void add() throws FileNotFoundException {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        String bien = bienKiemSoat();
        System.out.println("Nhập tên hãng sản xuất: ");
        String ten = scanner.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        int nam = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chủ sở hữu: ");
        String chu = scanner.nextLine();
        System.out.println("Nhập số chỗ ngồi: ");
        int ngoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu xe: ");
        String kieuXe = scanner.nextLine();

        Oto oto = new Oto(id, bien, ten, nam, chu, ngoi, kieuXe);
        otoList.add(oto);
        System.out.println("Đã thêm mới thành công");
        ReadAndWrite.write(otoList, "D:\\KhoaEm\\HocCodeGym\\A0721I1-NguyenTrongKhoa\\src\\bai_tap_them\\data\\oto.csv");
    }


    @Override
    public void delete() {
        System.out.println("Nhập id cần xóa: ");
        int index = -1;
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < otoList.size();i++){
            if (id == otoList.get(i).getId()){
                index = i;
                break;
            }
        }
        if (index != -1){
            otoList.remove(index);
        }

    }
}
