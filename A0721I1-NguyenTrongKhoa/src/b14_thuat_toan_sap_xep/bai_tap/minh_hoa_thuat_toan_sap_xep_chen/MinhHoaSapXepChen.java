package b14_thuat_toan_sap_xep.bai_tap.minh_hoa_thuat_toan_sap_xep_chen;

import java.util.Scanner;

public class MinhHoaSapXepChen {
    public void insertionSort(int arr[]) {
        int valueToInsert;
        int holePosition;
        int i;

        // lap qua tat ca cac so
        for (i = 1; i < arr.length; i++) {

            // chon mot gia tri de chen
            valueToInsert = arr[i];

            // lua chon vi tri de chen
            holePosition = i;

            // kiem tra xem so lien truoc co lon hon gia tri duoc chen khong
            while (holePosition > 0 && arr[holePosition - 1] > valueToInsert) {
                arr[holePosition] = arr[holePosition - 1];
                holePosition--;
                System.out.println("Di chuyen phan tu: " + arr[holePosition]);
            }

            if (holePosition != i) {
                System.out.println(" Chen phan tu: " + valueToInsert
                        + ", tai vi tri: " + holePosition);
                // chen phan tu tai vi tri chen
                arr[holePosition] = valueToInsert;
            }

            System.out.println("Vong lap thu " + i);
            display(arr);
        }
    }

    public void display(int arr[]) {
        int i;
        System.out.print("[");

        // Duyet qua tat ca phan tu
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("]\n");
    }

    public static void main(String[] args) {
        // khoi tao mang arr
        int n;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n < 0);

        int arr[] = new int[n];
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        MinhHoaSapXepChen sapXepChen = new MinhHoaSapXepChen();
        System.out.println("Mang du lieu dau vao: ");
        sapXepChen.display(arr);
        System.out.println("-----------------------------");
        sapXepChen.insertionSort(arr);
        System.out.println("-----------------------------");
        System.out.println("\nMang sau khi da sap xep: ");
        sapXepChen.display(arr);
    }
}
