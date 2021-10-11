package b2_Vong_lap_trong_Java.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);

        while(choice != 0){
            System.out.println("Menu");
            System.out.println("1. Vẽ hình chữ nhật");
            System.out.println("2. Vẽ 4 cạnh tam giác vuông");
            System.out.println("3. Vẽ hình chữ nhật");
            System.out.println("0. Thoát");
            System.out.println("Mời bạn chọn chức năng");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Hình chữ nhật");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 2:
                    System.out.println("2 hình tam giác vuông");
                    //hình tam giác vuông, có cạnh góc vuông ở botton-left
                    int n = 4;
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++) {
                             System.out.print("*");
                        }
                        System.out.println("\n");
                      }
//                    //hình tam giác vuông, có cạnh góc vuông ở top-left
                    for (int i = 4; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("\n");
                        }
                    break;
                case 3:
                    System.out.println("Hình tam giác cân");
                    for(int i=1; i<=5; i++){
                        for(int j=i; j<5; j++) {
                            System.out.printf(" ");
                        }
                        for (int j=1; j <= (2*i-1); j++){
                            System.out.printf("*");
                        }
                        System.out.printf("\n");

                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
