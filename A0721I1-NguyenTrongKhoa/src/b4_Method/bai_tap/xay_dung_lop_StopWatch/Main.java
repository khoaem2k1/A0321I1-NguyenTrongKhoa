package b4_Method.bai_tap.xay_dung_lop_StopWatch;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        Random random = new Random(100000);

        int[] list = new int[100000];
        for (int i = 0; i < list.length; i++){
            int rd = random.nextInt(100000);
            list[i] = rd;
        }
        System.out.print("Start time: " + stopWatch.start());
        sort(list);
        System.out.println("\nEnd time: " + stopWatch.stop());
        System.out.println("Elapsed: " + stopWatch.getElapsedTime());
    }
    public static void sort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int current = list[i];
            int j;
            for (j = i - 1; j > 0 && list[j] > current; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = current;
        }
    }
}
