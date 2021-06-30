package b4_lop_va_doi_tuong_trong_java.bai_tap.ClassFan;

import static b4_lop_va_doi_tuong_trong_java.bai_tap.ClassFan.Fan.FAST;
import static b4_lop_va_doi_tuong_trong_java.bai_tap.ClassFan.Fan.MEDIUM;

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.setSpeed(FAST);
        fan.setRadius(10);
        fan.setColor("yellow");
        fan.setOn(true);
        System.out.println("Fan");
        System.out.println(fan.toString()+ "\n");

        Fan fan1 = new Fan();
        fan1.setSpeed(MEDIUM);
        fan1.setRadius(5);
        System.out.println("Fan 1");
        System.out.println(fan1.toString());
    }
}
