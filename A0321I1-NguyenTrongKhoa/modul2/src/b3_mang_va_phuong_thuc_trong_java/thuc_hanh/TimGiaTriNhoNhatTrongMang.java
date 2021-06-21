package b3_mang_va_phuong_thuc_trong_java.thuc_hanh;

public class TimGiaTriNhoNhatTrongMang {
    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min < arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }

}
