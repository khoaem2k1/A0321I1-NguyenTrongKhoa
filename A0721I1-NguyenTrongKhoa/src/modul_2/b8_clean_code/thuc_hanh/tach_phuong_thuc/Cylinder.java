package b8_clean_code.thuc_hanh.tach_phuong_thuc;

public class Cylinder {
    public static double getVolume(int radius, int height){


        double baseArea = getPerimeter(radius);
        double perimeter = getBaseArea(radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }
    private static double getPerimeter(int radius) {

        return 2 * Math.PI  * radius;
    }

    private static double getBaseArea(int radius) {

        return Math.PI * radius * radius;
    }
}
