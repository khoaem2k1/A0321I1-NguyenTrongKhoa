package b3_Array.bai_tap;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int a[] = new int[10];
        int atIndex = 1;
        int value = 9;
        int n = 5;
        for (int i = 0; i < n; i++){
            a[i] = i + 1;
        }
        System.out.print("Trước khi thêm: ");
        for (int element : a){
            System.out.print(element + " ");
        }
        System.out.println();
        for (int i = n; i > atIndex; i--){
            a[i] = a[i - 1];
        }
        a[atIndex] = value;
        System.out.print("Sau khi thêm: ");
        for (int element : a){
            System.out.print(element + " ");
        }
    }
}
