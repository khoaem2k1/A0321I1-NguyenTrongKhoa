package b4_Method.bai_tap.xay_dung_lop_Fan;

public class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static  final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        if (isOn()){
            return "speed:" + getSpeed() + "\ncolor: " + getColor() + "\nRadius: " + getRadius() + "\nfan is on";

        }else return "speed:" + getSpeed() + "\ncolor: " + getColor() + "\nRadius: " + getRadius() + "\nfan is off";
    }
}
