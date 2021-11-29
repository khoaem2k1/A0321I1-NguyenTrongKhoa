package b5_Static_modifier.thuc_hanh.static_method;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(1, "Hoàng");
        Student s2 = new Student(2, "Khánh");
        Student s3 = new Student(3, "Khoa");

        s1.display();
        s2.display();
        s3.display();
    }
}
