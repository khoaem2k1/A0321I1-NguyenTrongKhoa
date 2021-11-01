package b10_dsa_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_arraylist;

public class Main {
    public static class Student{
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Student a = new Student(1, "Khoa");
        Student b = new Student(2, "Châu");
        Student c = new Student(3, "Nhựt");
        Student d = new Student(4, "Lộ");
        Student e = new Student(5, "Đức");
        Student f = new Student(5, "Đức2");

        MyList<Student> studentMyList = new MyList<>();
        MyList<Student> newMyList = new MyList<>();

        studentMyList.add(a);
        studentMyList.add(b);
        studentMyList.add(c);
        studentMyList.add(d);
        studentMyList.add(e);
//        studentMyList.add(f,2);
//        System.out.println(studentMyList.size());
//        System.out.println(studentMyList.get(2).getName());
//        System.out.println(studentMyList.indexOf(d));
//        System.out.println(studentMyList.contains(f));

//  add
        for (int i = 0; i < studentMyList.size(); i++){
            Student student = (Student) studentMyList.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
//        newMyList = studentMyList.clone();
//        newMyList.remove(1);
//        for (int i = 0; i < newMyList.size(); i++){
//            System.out.println(newMyList.get(i).getName());
//        }

    }

}
