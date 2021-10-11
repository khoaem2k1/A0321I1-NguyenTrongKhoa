package b4_Method.bai_tap.xay_dung_lop_Fan;

import static b4_Method.bai_tap.xay_dung_lop_Fan.Fan.FAST;
import static b4_Method.bai_tap.xay_dung_lop_Fan.Fan.MEDIUM;

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.setSpeed(FAST);
        fan.setColor("yellow");
        fan.setRadius(10);
        fan.setOn(true);
        System.out.println("fan1");
        System.out.println(fan.toString()+ "\n");

        fan.setSpeed(MEDIUM);
        fan.setColor("blue");
        fan.setRadius(5);
        fan.setOn(false);
        System.out.println("fan2");
        System.out.println(fan.toString());
    }


}
