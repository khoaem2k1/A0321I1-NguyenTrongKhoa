package b5_access_modifier_static_method_tatic_property.thuc_hanh.Private;

public class Simple {
    public static void main(String args[]){

        A obj= new A();

        System.out.println(obj.data);//Compile Time Error

        obj.msg();//Compile Time Error

    }
    static class A{

        private int data=40;

        private void msg(){
            System.out.println("Hello java");}
    }
}
