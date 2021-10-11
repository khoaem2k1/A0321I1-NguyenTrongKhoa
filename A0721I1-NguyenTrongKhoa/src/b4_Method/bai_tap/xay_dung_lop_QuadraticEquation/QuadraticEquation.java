package b4_Method.bai_tap.xay_dung_lop_QuadraticEquation;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getdelta(){
        return  b * b - 4 * a * c;
    }
    public double getRoot1(){
        if (this.getdelta() < 0) return 0;
            return ((-b+Math.sqrt(this.getdelta()))/(2*a));
    }
    public  double getRoot2(){
        if (this.getdelta() < 0) return 0;
        return ((-b-Math.sqrt(this.getdelta()))/(2*a));
    }
}
