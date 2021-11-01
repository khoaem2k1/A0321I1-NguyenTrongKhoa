package b14_thuat_toan_sap_xep.bai_tap.cai_dat_thuat_toan_sap_xep_chen;

import java.util.Scanner;

public class CaiDatSapXepChen {
    public void sort(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Di chuyển các phần tử của arr [0 ... i - 1], lớn hơn key
            // đến một vị trí trước vị trí hiện tại của chúng
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // In các phần tử của mảng
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String args[]) {
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

        System.out.println("Mảng ban đầu:");
        printArray(arr);
        CaiDatSapXepChen ob = new CaiDatSapXepChen();
        ob.sort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }
}
