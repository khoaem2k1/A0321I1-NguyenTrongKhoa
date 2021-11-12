package b15_xu_li_ngoai_le_va_debug.bai_tap.su_dung_lop_illegaltriangleexception;

public class Check {
        // Ham kiem tra tam giac hop le
        public void checkTriangleEdges(double a, double b, double c) throws IllegalTriangleException {
            if (a + b <= c || a + c <= b || b + c <= a || a < 0 || b < 0 || c < 0)  {
                throw new IllegalTriangleException() ;
            }
        }
    }
