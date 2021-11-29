package b5_Static_modifier.bai_tap.xay_dung_lop_chi_ghi_trong_java;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Student {
    String name = "John";
    String classes = "C02";

    public Student() {
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setClasses(String classes) {

        this.classes = classes;
    }


    void main(){
        System.out.println("Tên: " + name + " Lớp: " + classes);
    }
}
