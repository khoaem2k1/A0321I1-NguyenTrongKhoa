package b4_lop_va_doi_tuong_trong_java.bai_tap.StopWatch;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        Random random = new Random(100000);

        int[] list = new int[100000];
        for (int i = 0; i < list.length; i++) {
            int rd = random.nextInt(100000);
            list[i] = rd;
        }
        System.out.println("Start time: " + stopWatch.start());
        AlgorithmsSort.sort(list);
        System.out.println("End time: " + stopWatch.stop());
        System.out.println("Elapsed: " + stopWatch.getElapsedTime());
    }
}
